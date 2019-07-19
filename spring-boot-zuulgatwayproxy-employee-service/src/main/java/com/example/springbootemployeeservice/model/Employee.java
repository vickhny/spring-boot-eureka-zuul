package com.example.springbootemployeeservice.model;

public class Employee {

	String ename;
	String dept;
	String eid;

	public Employee(String ename, String dept, String eid) {
		super();
		this.ename = ename;
		this.dept = dept;
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public String getDept() {
		return dept;
	}

	public String getEid() {
		return eid;
	}

}