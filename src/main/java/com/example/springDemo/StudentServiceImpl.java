package com.example.springDemo;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
	//public boolean validateStudent(Student s) {
		//String username = s.getUsername();
		//String password = s.getPassword();
		//if (username.equals("vj") && password.equals("dj")) {
			//return true;
		//} else {
			//return false;
		//}
	//}
public String StudenttoUpper(Student s)
{
 String sname= s.getSname();
 return sname.toUpperCase();

}


}
