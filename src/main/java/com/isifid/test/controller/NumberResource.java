package com.isifid.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isifid.test.service.NumberService;

@RestController
@RequestMapping(path = "/api/number")

public class NumberResource {

	@Autowired
	private NumberService numberservice;
	
	@GetMapping(value = "/calculate/{number}")
	public ResponseEntity<Integer> calculate(@PathVariable Integer number)
	{
		if(number == null)
		{
			return ResponseEntity.ok(0);
		}
		else if(number < 0)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return ResponseEntity.ok(numberservice.calculate(number)) ;
		
	}
	
}
