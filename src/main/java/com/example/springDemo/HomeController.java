package com.example.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	StudentService s3;

	//StudentService s2;
	@RequestMapping("/square/{number}")
	public String calculateSquare(@PathVariable int number) {
		String output = " square of " + number + " is " + (number * number);
		return output;
	}

	@RequestMapping("/sum/{a}/{b}")
	public String calculateSum(@PathVariable("a") int number1, @PathVariable("b") int number2) {
		String output = " sum of " + number1 + "and" + number2 + " is " + (number1 + number2);
		return output;

	}

	@RequestMapping("/oye/{name}/{sname}")
	public String greeting(@PathVariable String name, @PathVariable String sname) {
		return "Hello " + name + " : " + sname;
	}

	//@PutMapping("/validate")
	//public boolean validateStudent(@RequestBody Student s) {
		//StudentService S1= new StudentService();
		//return S1.validateStudent(s);
		//return s2.validateStudent(s);
	//}

	@PutMapping("/upper")
	public String StudenttoUpper(@RequestBody Student s)
	{
	 //StudentService s4= new StudentService();
	 return s3.StudenttoUpper(s);

}

	@GetMapping("/upper1/{sname}")
	public String StudenttoUpper(@PathVariable String sname)
	{
	 //StudentService s4= new StudentService();
	 return sname.toUpperCase();

}


}



