package com.Validate;

import com.opensymphony.xwork2.ActionSupport;


public class Employee extends ActionSupport{

	private String Name;
	private int Age;

	public String execute() {
		return "success";
	}

	public void validate()
	{
		if(Name==null || Name.equals(" ")) {
			addFieldError("Name", "Name is Required");
		}

		if(Age<28 || Age>65)
		{
			addFieldError("Age", "Age must be within range of 28 to 65");
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return Age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		Age = age;
	}



}