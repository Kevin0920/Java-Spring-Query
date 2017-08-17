package com.coding.queriesAndJoin.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.queriesAndJoin.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long>{

}
