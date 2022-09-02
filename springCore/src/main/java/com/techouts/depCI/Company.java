package com.techouts.depCI;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Company {
	
	private int licenseNum;
	private String companyName;
	private String companyAddress;
	private Employee employee;
	private List<String> list;
	private Map<String,Integer> map;
	

	public Company(int licenseNum, String companyName, String companyAddress, Employee employee, List<String> list,
			Map<String, Integer> map) {
		super();
		this.licenseNum = licenseNum;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.employee = employee;
		this.list = list;
		this.map = map;
	}

	void display()
	{
		System.out.println(licenseNum+"\t"+companyName+"\t"+companyAddress);
		System.out.println(employee.toString());
		System.out.println("List of employees:");
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
		}
		System.out.println("\nMap:");
		for(Map.Entry<String, Integer> me:map.entrySet())
		{
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}
	
}
