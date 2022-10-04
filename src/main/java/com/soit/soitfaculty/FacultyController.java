package com.soit.soitfaculty;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soit.soitfaculty.model.Faculty;

@Controller
@RequestMapping("/Faculties")
public class FacultyController {
	
	//Upload Faculty Info
	private List<Faculty> theFaculties;
	
	@PostConstruct
	private void loadData() {
		
		//Create Faculties
		Faculty fac1 = new Faculty(1, "Kelly", "Miller", "Kelly@uc.edu");
		Faculty fac2 = new Faculty(2, "Robert", "Lee", "Robert@uc.edu");
		Faculty fac3 = new Faculty(3, "Laura", "West", "Laura@uc.edu");
		
		
		//Create our List
		theFaculties = new ArrayList();
		
		
		//Add to our List
		theFaculties.add(fac1);
		theFaculties.add(fac2);
		theFaculties.add(fac3);
		
	}
	
	
	
	//Mapping for "/list"

}
