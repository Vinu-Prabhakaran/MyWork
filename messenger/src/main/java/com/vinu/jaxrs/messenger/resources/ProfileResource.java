/**
 * 
 */
package com.vinu.jaxrs.messenger.resources;


import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vinu.jaxrs.messenger.model.Profile;
import com.vinu.jaxrs.messenger.service.ProfileService;

/**
 * @author Vinu Prabhakaran
 *         on Jun 30, 2020
 *
 */
@Path("/profiles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Singleton
public class ProfileResource {
	
	private ProfileService profileService = new ProfileService();
	
	@GET
	public List<Profile> getProfiles() {
		
		return profileService.getProfiles();
	}
	
	@GET
	@Path("/{profileId}")
	public Profile getProfile(@PathParam("profileId") String profileName) {
		
		return profileService.getProfile(profileName);
	}
	
	@POST
	public Profile addProfile(Profile profile) {
		
		return profileService.addProfile(profile);
	}
	
	@DELETE
	@Path("/{profileId}")
	public Boolean deleteProfile(@PathParam("profileId") String profileId) {
		
		return profileService.deleteProfile(profileId);
	}
	
	@PUT
	@Path("/{profileName}")
	public Profile updateProfile(Profile profile,@PathParam("profileName") String profileName) {
		
		profile.setProfileName(profileName);
		return profileService.updateProfile(profile);
	}
}
