package com.risque.retailservice.service;

import java.util.List;

import com.risque.retailservice.entity.Foox;

public interface RetailService {

	List<Foox> getAllFoo();

	Foox createFoo(Foox foo);

	Foox updateFoo(Foox foo, Long id);

	Foox deleteFoo(Long id);

}
