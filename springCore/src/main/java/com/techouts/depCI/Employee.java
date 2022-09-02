package com.techouts.depCI;

import java.util.Set;

public class Employee {
	
	private int empId;
	private String empName;
	private int empAge;
	private float empSal;
	private String empAdd;
	private Set<Integer> set;

	
	public Employee(int empId, String empName, int empAge,
			float empSal, String empAdd, Set<Integer> set) 
	{
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSal = empSal;
		this.empAdd = empAdd;
		this.set = set;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSal=" + empSal
				+ ", empAdd=" + empAdd + ", set=" + set + "]";
	}



	

	
	
}
