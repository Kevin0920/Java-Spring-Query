package com.coding.queriesAndJoin.repositories;



import java.util.List;

import org.hibernate.jpa.criteria.expression.function.AggregationFunction.COUNT;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.queriesAndJoin.models.City;
import com.coding.queriesAndJoin.models.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long>{
	
	@Query("SELECT c FROM Country c JOIN c.languages l WHERE language = ?1 ORDER BY l.percentage DESC ")
	List<Country> findCountriesByLanguage(String language);
	
	@Query("SELECT c FROM Country c ORDER BY SIZE(c.cities) DESC ")
	List<Country> findCountriesCitiesOrderBy();
	
	@Query("SELECT c FROM City c JOIN c.country cc WHERE cc.name = ?1 AND c.population > 500000 ORDER BY c.population DESC ")
	List<Country> findCitisOfMexicoWithPopulationOrderBy(String country);
	
	@Query("SELECT l FROM Language l JOIN l.country c WHERE percentage > 89.0 ORDER BY percentage DESC")
	List<Country> findAllLanguageInCountryOrderByPercentage();
	
	@Query("SELECT c FROM Country c WHERE c.surface_area < 501 AND c.population >100000")
	List<Country> getCountriesWithArea();
	
	@Query("SELECT c FROM Country c WHERE government_form = 'Constitutional Monarchy' AND capital > 200 AND life_expectancy > 75.0")
	List<Country> hello();
	
	@Query("SELECT c FROM City c JOIN c.country cc WHERE district='Buenos Aires' AND c.population > 500000")
	List<City> getCountryCityArea();
	
//	@Query("SELECT c, COUNT(continent) FROM Country c GROUP BY continent ORDER BY COUNT(continent) DESC")
//	List<Object[]> lastOne();
}
