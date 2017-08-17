package com.coding.queriesAndJoin.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coding.queriesAndJoin.models.Country;
import com.coding.queriesAndJoin.services.ApiService;

@Controller
public class ApiController {
	private ApiService apiService;
	
	public ApiController(ApiService apiService) {
		this.apiService = apiService;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
//		model.addAttribute("countries", apiService.findCountrylanguage("Slovene"));
//		model.addAttribute("countries", apiService.findCountriesCitiesOrderBy());
		
//		model.addAttribute("cities", apiService.findCitisOfMexicoWithPopulationOrderBy("Mexico"));
		
//		model.addAttribute("languages", apiService.findAllLanguageInCountryOrderByPercentage());
		
		model.addAttribute("countries", apiService.getCountriesWithArea());
		model.addAttribute("countries", apiService.hello());
		
		model.addAttribute("cities", apiService.getCountryCityArea());
//		model.addAttribute("cities", apiService.lastOne());
		return "index";
	}
}
