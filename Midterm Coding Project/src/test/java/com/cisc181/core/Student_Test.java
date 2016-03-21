package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	public static ArrayList<Course> y = new ArrayList<Course>();
	public static ArrayList<Section> s = new ArrayList<Section>();
	public static ArrayList<Semester> t = new ArrayList<Semester>();
	public static ArrayList<Student> students = new ArrayList<Student>();
	public static ArrayList<Enrollment> enroll = new ArrayList<Enrollment>();
	
	static UUID cisc = UUID.randomUUID();
	static UUID math = UUID.randomUUID();
	static UUID cpeg = UUID.randomUUID();
	static UUID fallID = UUID.randomUUID();
	static UUID springID = UUID.randomUUID();
	
	@BeforeClass
	public static void setup() {
		Course a = new Course(cisc,"CISC",200);
		Course b = new Course(math,"MATH",400);
		Course c = new Course(cpeg,"CPEG",345);
		y.add(a);
		y.add(b);
		y.add(c);
		Semester fall = new Semester(fallID,new Date(2015,Calendar.SEPTEMBER,9),new Date(2015,Calendar.DECEMBER,21));
		Semester spring = new Semester(springID,new Date(2016,Calendar.FEBRUARY,9),new Date(2015,Calendar.MAY,25));
		t.add(fall);
		t.add(spring);
		
		Section cisc1 = new Section(cisc,fallID,UUID.randomUUID(),210);
		Section cisc2 = new Section(cisc,springID,UUID.randomUUID(),320);
		Section math1 = new Section(math,fallID,UUID.randomUUID(),110);
		Section math2 = new Section(math,springID,UUID.randomUUID(),120);
		Section cpeg1 = new Section(cpeg,fallID,UUID.randomUUID(),220);
		Section cpeg2 = new Section(cpeg,springID,UUID.randomUUID(),320);
		s.add(cisc1);
		s.add(cisc2);
		s.add(math1);
		s.add(math2);
		s.add(cpeg1);
		s.add(cpeg2);
		Student Jon = new Student();
		Student Jane = new Student();
		Student Kim = new Student();
		Student Tom = new Student();
		Student Mike = new Student();
		Student Mitch = new Student();
		Student Elena = new Student();
		Student Jill = new Student();
		Student Nate = new Student();
		Student Harry = new Student();
		students.add(Jon);
		students.add(Jane);
		students.add(Kim);
		students.add(Tom);
		students.add(Mike);
		students.add(Mitch);
		students.add(Elena);
		students.add(Jill);
		students.add(Nate);
		students.add(Harry);
		
		//To make sure correct object being created
		//Course(UUID courseID, String courseName, int gradePoints) 
		//Semester(UUID semesterID, Date startDate, Date endDate)
		//Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID)
	}

	@Test
	public void test() {
		Enrollment C1 = new Enrollment();
		Enrollment C2 = new Enrollment();
		Enrollment M1 = new Enrollment();
		Enrollment M2 = new Enrollment();
		Enrollment Cp1 = new Enrollment();
		Enrollment Cp2 = new Enrollment();
		enroll.add(C1);
		enroll.add(C2);
		enroll.add(M1);
		enroll.add(M2);
		enroll.add(Cp1);
		enroll.add(Cp2);
		for(Enrollment c: enroll){
			c.setGrade(80.0);
		}
		Student James = new Student();
		James.setMajor(eMajor.NURSING);
		assertEquals(C1.getGrade(),80.0,0.001);
		assertEquals(C2.getGrade(),80.0,0.001);
		assertEquals(M1.getGrade(),80.0,0.001);
		assertEquals(M2.getGrade(),80.0,0.001);
		assertEquals(Cp1.getGrade(),80.0,0.001);
		assertEquals(Cp2.getGrade(),80.0,0.001);
	}
}