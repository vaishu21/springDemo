package com.example.springDemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/square/{number}")
	public String calculateSquare(@PathVariable int number)
	{
		String output = " square of " + number + " is " + (number * number);
		return output;
	}

	@RequestMapping("/sum/{a}/{b}")
	public String calculateSum(@PathVariable ("a")int number1,@PathVariable ("b")int number2)
	{
		String output = " sum of "  + number1 +  "and"  + number2 +  " is "  + (number1 + number2);
		return output;

	}

	@RequestMapping("/oye")
	public String greeting ()
	{
		return "Hello";
	}
}
