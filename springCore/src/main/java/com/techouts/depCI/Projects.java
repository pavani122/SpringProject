package com.techouts.depCI;

import java.util.Map;

public class Projects {
	
	

	private String projectName;
	private int projectId;
	private Map<Company,Employee> map;
	
	public Projects(String projectName, int projectId, 
			Map<Company, Employee> map) {

		this.projectName = projectName;
		this.projectId = projectId;
		this.map = map;
	}
	
	
	
	void display()
	{
		System.out.println(projectId);
		System.out.println(projectName);
		System.out.println("map"+map);
		System.out.println("Company:");
		for(Map.Entry<Company, Employee> me:map.entrySet())
		{	
			me.getKey().display();
		}
	}
}
