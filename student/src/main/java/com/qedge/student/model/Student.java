package com.qedge.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer stuId;
  private String firstName;
  private String lastName;
public Integer getStuId() {
	return stuId;
}
public void setStuId(Integer stuId) {
	this.stuId = stuId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Student(Integer stuId, String firstName, String lastName) {
	super();
	this.stuId = stuId;
	this.firstName = firstName;
	this.lastName = lastName;
}
public Student(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}
public Student() {
	super();
}


@Override
public String toString() {
	return "Student [stuId=" + stuId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}
  
}
