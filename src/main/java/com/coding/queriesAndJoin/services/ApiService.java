package com.coding.queriesAndJoin.services;

import java.util.List;

import org.hibernate.jpa.criteria.expression.function.AggregationFunction.COUNT;
import org.springframework.stereotype.Service;

import com.coding.queriesAndJoin.models.City;
import com.coding.queriesAndJoin.models.Country;
import com.coding.queriesAndJoin.repositories.CityRepository;
import com.coding.queriesAndJoin.repositories.CountryRepository;
import com.coding.queriesAndJoin.repositories.LanguageRepository;

@Service 
public class ApiService {
	private CountryRepository countryRepository;
	private LanguageRepository languageRepository;
	private CityRepository cityRepository;
	
	public ApiService(CountryRepository countryRepository, LanguageRepository languageRepository, CityRepository cityRepository) {
		this.countryRepository = countryRepository;
		this.languageRepository = languageRepository;
		this.cityRepository = cityRepository;
	}
	

	public List<Country> findCountrylanguage(String lang) {
		return (List<Country>) countryRepository.findCountriesByLanguage(lang);
	}


	public List<Country> findCountriesCitiesOrderBy() {
	
		return (List<Country>) countryRepository.findCountriesCitiesOrderBy();
	}


	public List<Country> findCitisOfMexicoWithPopulationOrderBy(String country) {

		return (List<Country>) countryRepository.findCitisOfMexicoWithPopulationOrderBy(country);
	}


	public List<Country> findAllLanguageInCountryOrderByPercentage() {
	
		return (List<Country>) countryRepository.findAllLanguageInCountryOrderByPercentage();
	}


	public List<Country> getCountriesWithArea() {

		return (List<Country>) countryRepository.getCountriesWithArea();
	}


	public List<Country> hello() {
	
		return (List<Country>) countryRepository.hello();
	}


	public List<City> getCountryCityArea() {
		return (List<City>) countryRepository.getCountryCityArea();
	}


//	public List<Object[]> lastOne() {
//
//		return countryRepository.lastOne();
//	}
	

	
	
}
