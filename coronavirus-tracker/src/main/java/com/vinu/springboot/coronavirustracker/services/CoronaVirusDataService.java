/**
 * 
 */
package com.vinu.springboot.coronavirustracker.services;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * @author Vinu Prabhakaran
 *         on Apr 26, 2020
 *
 */
@Service
public class CoronaVirusDataService {
	
	@Value("${covid.data.url}")
	private String VIRUS_DATA_URL;
	
	@Autowired
	RestTemplate restTemplate;
	
	@PostConstruct
	public void fetchVirusData() throws IOException {
		
		String covidData=restTemplate.getForEntity(VIRUS_DATA_URL, String.class).getBody();
		//System.out.println(covidData);
		Reader in = new StringReader(covidData);
		
		Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
		for (CSVRecord record : records) {
			System.out.println("Country :"+record.get("Country/Region")+",State :"+record.get("Province/State")
								+",LatestCount :"+record.get(record.size()-1));
			
		}
		
	}
}
