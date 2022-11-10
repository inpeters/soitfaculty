package com.soit.soitfaculty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soit.soitfaculty.dao.FacultyRepository;
import com.soit.soitfaculty.entity.Faculty;

@Service

public class FacultyServiceImpl implements FacultyService {
	
	private FacultyRepository facultyRepository;
	
	@Autowired
	public FacultyServiceImpl (FacultyRepository theFacultyRepository) {
		facultyRepository = theFacultyRepository;
	}

	@Override
	public List<Faculty> findAll() {
		// TODO Auto-generated method stub
		return facultyRepository.findAllByOrderByLastName();
	}

	@Override
	public Faculty findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Faculty theFaculty) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub

	}

}
