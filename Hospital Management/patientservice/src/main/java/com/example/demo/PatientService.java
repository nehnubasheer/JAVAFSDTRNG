package com.example.demo;
import java.util.List;
import java.util.Optional;

public interface PatientService {
	List <Patient> getPatients();
	
	void savePatients(Patient pat);
	Patient getPatientsById(long id);
	void deletePatientsById(long id);

	static List<Patient> findAll() {
		findAll();
		return null;
	}

	

	static Long findById(Long patientId) {
		
		return patientId;
	}

	static Patient save(Patient patient) {
		
		return patient;
	}

	static Patient delete(Patient employee) {
		
		return employee;
	}

	
	


}
