package com.capgemini;

import java.util.Set;

import javax.persistence.*;
@Entity
public class Department 
{

	@Id private int departmentId;
	private String departmentName;
	@OneToMany
	private Set<Employee> employees;
	
	public Department()
	{
		
	}
	
	public Department(int departmentId)
	{
		this.departmentId = departmentId;
	}

	public int getDepartmentId()
	{
		return departmentId;
	}
	

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Employee emp) {
		System.out.println(employees.size());
		employees.add(emp);
		System.out.println(employees.size());
	}


	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ",employees="+employees+"]";
	}
	
}