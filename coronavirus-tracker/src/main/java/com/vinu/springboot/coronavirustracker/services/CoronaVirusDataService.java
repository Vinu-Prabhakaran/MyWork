/**
 * 
 */
package com.vinu.springboot.coronavirustracker.services;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vinu.springboot.coronavirustracker.models.LocationStats;

import lombok.Getter;


/**
 * @author Vinu Prabhakaran
 *         on Apr 26, 2020
 *
 */
@Service
@Getter
@EnableScheduling
public class CoronaVirusDataService {
	
	@Value("${covid.data.url}")
	private String VIRUS_DATA_URL;
	private List<LocationStats> allStats;
	
	@Autowired
	RestTemplate restTemplate;
	
	@PostConstruct
	@Scheduled(cron = "0 0 0 * * *")  //Set to execute Mondnight everyday
	public void fetchVirusData() throws IOException {
		
		String covidData=restTemplate.getForEntity(VIRUS_DATA_URL, String.class).getBody();
		//System.out.println(covidData);
		Reader in = new StringReader(covidData);
		List<LocationStats> newStats=new ArrayList<>();
		
		Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
		for (CSVRecord record : records) {
			/*System.out.println("Country :"+record.get("Country/Region")+",State :"+record.get("Province/State")
								+",LatestCount :"+record.get(record.size()-1));*/
			LocationStats locationStat=new LocationStats();
			locationStat.setCountry(record.get("Country/Region"));
			locationStat.setState(record.get("Province/State"));
			locationStat.setLatestTotalCases(Integer.parseInt(record.get(record.size()-1)));
			newStats.add(locationStat);
		}
		
		this.allStats=newStats;
		System.out.println("Filtered stats");
		allStats.stream().filter(s -> !s.getState().isEmpty()).forEach(System.out::println);
	}
}
