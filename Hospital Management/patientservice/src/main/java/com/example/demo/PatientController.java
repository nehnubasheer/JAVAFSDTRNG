package com.example.demo;

import java.util.HashMap;

import java.util.List;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Patient")
public class PatientController {
	@Autowired
	private PatientService pSer;

	@GetMapping("/patients")
	public List<Patient> getAllEmployees() {
		return PatientService.findAll();
	}

	@GetMapping("/patients/{id}")
	public ResponseEntity<Patient> getEmployeeById(@PathVariable(value = "id") Long patientId)
			throws ResourceNotFoundException {
		Patient patient =  PatientService.findById(patientId)
				.orElseThrow(() -> new ResourceNotFoundException("patient not found for this id :: " + patientId));
		return ResponseEntity.ok().body(patient);
	}

	@PostMapping("/patients")
	public Patient createEmployee( @RequestBody Patient patient) {
		return PatientService.save(patient);
	}

	@PutMapping("/patients/{id}")
	public ResponseEntity<Patient> updateEmployee(@PathVariable(value = "id") Long patientId,
			 @RequestBody Patient employeeDetails) throws ResourceNotFoundException {
		Patient patient = PatientService.findById(patientId)
				.orElseThrow(() -> new ResourceNotFoundException("patient not found for this id :: " + patientId));

		patient.setId(employeeDetails.getId());
		patient.setName(employeeDetails.getName());
		patient.setAge(employeeDetails.getAge());
		final Patient updatedEmployee = PatientService.save(patient);
		return ResponseEntity.ok(updatedEmployee);
	}

	@DeleteMapping("/patients/{id}")
	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long patientId)
			throws ResourceNotFoundException {
		Patient employee = PatientService.findById(patientId)
				.orElseThrow(() -> new ResourceNotFoundException("Patients not found for this id :: " + patientId));

		PatientService.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}