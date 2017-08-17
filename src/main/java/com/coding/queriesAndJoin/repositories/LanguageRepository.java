package com.coding.queriesAndJoin.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.queriesAndJoin.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{

}
