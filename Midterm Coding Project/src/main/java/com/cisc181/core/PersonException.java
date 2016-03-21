package com.cisc181.core;

import com.cisc181.core.Person;

public class PersonException extends Exception {
	private Person x;
	public PersonException(Person p){
		super();
		this.x = p;
	}
	public Person getPerson(){
		return x;
	}
}
