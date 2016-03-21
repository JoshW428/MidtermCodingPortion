package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
public static ArrayList<Staff> j = new ArrayList<Staff>();

	@BeforeClass
	public static void setup() {
		Staff a = new Staff("John","N","Smith",new Date(1996,Calendar.JANUARY,8),"14 James Rd.","(132)-123-1345","JNS@udel.edu","2-4TF",12,71000.0,new Date(1996, Calendar.MAY,8),eTitle.MR);
		Staff b = new Staff("Sue","C","James",new Date(1987,Calendar.DECEMBER,14),"17 Wilbur Ln.","(837)-017-1648","Sue@udel.edu","9-1WF",9,54000.0,new Date(2010, Calendar.JUNE,24),eTitle.MS);
		Staff c = new Staff("Cathy","J","Fallon",new Date(1967,Calendar.FEBRUARY,18),"1 Race Ln.","(134)-736-1638","Cathy@udel.edu","9-2F",6,64000.0,new Date(2007, Calendar.MARCH,12),eTitle.MS);
		Staff d = new Staff("Tim","L","Gorg",new Date(1976,Calendar.APRIL,2),"14 Illur Pl.","(984)-876-6354","Tim@udel.edu","5-7MW",8,74000.0,new Date(2008, Calendar.AUGUST,17),eTitle.MR);
		Staff e = new Staff("Ray","G","Yurn",new Date(1956,Calendar.SEPTEMBER,23),"76 West Main St.","(837)-132-8725","Ray@udel.edu","3-5MR",8,68000.0,new Date(2013, Calendar.NOVEMBER,23),eTitle.MR);
		j.add(a);
		j.add(b);
		j.add(c);
		j.add(d);
		j.add(e);

	}
	//TO MAKE SURE STAFF OBJECTS CREATED CORRECTLY
	//Staff(String FirstName, String MiddleName, String LastName,
			//Date DOB, String Address, String Phone_number, String Email,
			//String officeHours, int rank, double salary, Date hireDate,
			//eTitle Title)
	@Test
	public void test() {
		double sum = 0.0;
		double average = 0.0;
		for(Staff a : j){
			sum = sum + a.getSalary();
			average = sum/j.size();
		}
		assertEquals(average,66200.0,0.001);
	}	

}
