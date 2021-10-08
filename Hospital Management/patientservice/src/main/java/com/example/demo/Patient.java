package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Patient {
    private	long id;
	
	private String Name;
		
	private int Age;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public void orElseThrow(Patient object) {
		
		return;
	}

	
	
	}

