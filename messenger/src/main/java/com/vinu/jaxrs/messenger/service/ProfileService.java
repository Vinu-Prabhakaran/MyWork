/**
 * 
 */
package com.vinu.jaxrs.messenger.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.NotFoundException;

import com.vinu.jaxrs.messenger.model.Profile;

/**
 * @author Vinu Prabhakaran
 *         on Jun 30, 2020
 *
 */
public class ProfileService {
	
	private static List<Profile> profiles=new ArrayList<> ();
	
	public ProfileService() {

		profiles.add(new Profile(1L,"vprabha","Vinu", "Prabhakaran"));
		profiles.add(new Profile(2L,"rvinu","Ramya", "Vinu"));
	}
	
	public List<Profile> getProfiles(){
		System.out.println(profiles);
		return profiles;
	}
	
	public Profile getProfile(String profileName) {
		
		return profiles
				   .stream()
				   .filter(p -> p.getProfileName().equals(profileName))
				   .findFirst()
				   .orElseThrow(() -> new NotFoundException());
	}
	
	public Profile addProfile(Profile profile) {
		
		profile.setId((long) (profiles.size()+1));
		profile.setCreated(LocalDateTime.now());
		profiles.add(profile);
		System.out.println(profiles);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		
		if (profiles.stream().anyMatch(p -> p.getProfileName().equals(profile.getProfileName()))) {
			
			Profile getProf = profiles.stream()
				   .filter(p -> p.getProfileName()
				   .equals(profile.getProfileName()))
				   .findFirst()
				   .get();
			
			profile.setId(getProf.getId());
			profile.setCreated(LocalDateTime.now());
			profiles.set(profiles.indexOf(getProf),profile);
			return profile;
						
		} else {
			return null;
		}
	}
	
	public Boolean deleteProfile(String profileName) {

		if (profiles.stream().anyMatch(p -> p.getProfileName().equals(profileName))) {
			
			return profiles.removeAll(profiles.stream()
				   .filter(p -> p.getProfileName().equals(profileName)).collect(Collectors.toList()));
						
		} else {
			return false;
		}		
	}
}
