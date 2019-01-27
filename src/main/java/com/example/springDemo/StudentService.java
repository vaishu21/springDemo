package com.example.springDemo;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {
	public boolean validateStudent(Student s);

}
