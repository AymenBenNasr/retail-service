package com.risque.retailservice.controller;

import com.risque.retailservice.entity.Foox;
import com.risque.retailservice.service.RetailService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("risque/foo")
public class FooController {

	private RetailService retailService;

	public FooController(RetailService retailService) {
		super();
		this.retailService = retailService;
	}

	@DeleteMapping("/{licenseId}")
	public ResponseEntity<Foox> deleteLicense(@PathVariable("licenseId") Long licenseId) {
		return ResponseEntity.ok(retailService.deleteFoo(licenseId));
	}

	@GetMapping
	public List<Foox> getAllFoo() {
		return retailService.getAllFoo();
	}

	@PostMapping
	public ResponseEntity<Foox> createLicense(@RequestBody Foox request) {
		return ResponseEntity.ok(retailService.createFoo(request));
	}

}
