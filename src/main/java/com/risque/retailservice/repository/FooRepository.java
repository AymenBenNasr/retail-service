package com.risque.retailservice.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import com.risque.retailservice.entity.Foox;

@Repository
public interface FooRepository extends ListCrudRepository<Foox, Long>{
}
