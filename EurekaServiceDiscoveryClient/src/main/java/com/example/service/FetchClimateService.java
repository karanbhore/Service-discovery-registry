package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.model.Climate;

@Service
public class FetchClimateService {
	
	@Autowired
	RestTemplate restTemplate;

	public Climate fetch(String city)
	{
		
        // Use service discovery to locate the Climate Service

        String climateServiceUrl = "http://climate-api/example/climates/" + city;

        Climate climate = restTemplate.getForObject(climateServiceUrl, Climate.class);
        return climate;
	}
	
	
}
