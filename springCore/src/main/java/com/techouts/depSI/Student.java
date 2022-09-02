package com.techouts.depSI;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private String name;
	private int id;
	List<Integer>  marks;
	Set<String> languages;
	Map<String,Integer> map;
	Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	public Set<String> getLanguages() {
		return languages;
	}
	public void setLanguages(Set<String> languages) {
		this.languages = languages;
	}
	public List<Integer> getMarks() {
		return marks;
	}
	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		Iterator it=marks.iterator();
		System.out.println("Marks: ");
		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
		}
		
		it=languages.iterator();
		System.out.println("\nLanguages:");
		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
		}
		
		Set s=map.entrySet();
		it=s.iterator();
		System.out.println();
		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
		}		
		System.out.println();
		System.out.println("Address: "+address.getAddress()+","+address.getCountry());
	}
	
	
}
