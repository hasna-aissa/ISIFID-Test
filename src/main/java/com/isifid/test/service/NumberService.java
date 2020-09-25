package com.isifid.test.service;

import org.springframework.stereotype.Service;

@Service
public class NumberService {
	
	public Integer calculate(Integer number) {
	    if (number % 2 != 0) {
	      return fibonacci(number);
	    } else if (number < 51) {
	      return factorial(number);
	    } else {
	      return number;
	    }
	  }

	  private Integer factorial(Integer number) {
	    if (number == 0) {
	      return 1;
	    }
	    return number * factorial(number - 1);
	  }

	  private Integer fibonacci(Integer number) {
	    if (number <= 1) {
	      return number;
	    }
	    return fibonacci(number - 1) + fibonacci(number - 2);
	  }

}
