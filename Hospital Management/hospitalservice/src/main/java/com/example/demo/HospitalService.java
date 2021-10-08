package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HospitalService {
	@Autowired
	private HospitalRepository HosRepo;
	public void admitpatient(Hospital m) {
		HosRepo.save(m);
	}
	
	public List<Hospital> getAllMed() {
		return HosRepo.findAll();
	}
	
	public Hospital getByDisPatientId(String id) {
		Optional<Hospital> m= HosRepo.findById(id);
		if(m.isPresent()) {
			return m.get();
		}
		return null;
	}
	
	public void deleteDisPatient(String id) {
		HosRepo.deleteById(id);
	}
}
