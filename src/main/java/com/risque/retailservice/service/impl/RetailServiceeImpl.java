package com.risque.retailservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.risque.retailservice.entity.Foox;
import com.risque.retailservice.repository.FooRepository;
import com.risque.retailservice.service.RetailService;

@Service
public class RetailServiceeImpl implements RetailService {

	private final FooRepository fooRepository;

	public RetailServiceeImpl(FooRepository fooRepository) {
		super();
		this.fooRepository = fooRepository;
	}

	@Override
	public Foox createFoo(Foox foo) {
		return fooRepository.save(foo);
	}

	@Override
	public Foox deleteFoo(Long id) {
		Foox foo = fooRepository.findById(id).orElseThrow(IllegalArgumentException::new);
		fooRepository.delete(foo);
		return foo;
	}

	@Override
	public List<Foox> getAllFoo() {
		return fooRepository.findAll();
	}

	@Override
	public Foox updateFoo(Foox foo, Long id) {
		Foox fn = fooRepository.findById(id).orElseThrow(IllegalArgumentException::new);
		fn.setLicenseType(foo.getLicenseType());
		fn.setProductName(foo.getProductName());
		fn.setDescription(foo.getDescription());
		fn.setOrganizationId(foo.getOrganizationId());
		return fooRepository.save(fn);
	}
}
