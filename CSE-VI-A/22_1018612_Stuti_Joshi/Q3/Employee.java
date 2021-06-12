package com.q3;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class Employee extends ActionSupport{
 private String name;
 private int age;
 private int empId;
 private String dept;

 public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String execute() {
 return "success";
 }
 public void validate() {
	 
 if(name==null || name.trim().equals("")) {
 addFieldError("name","The name is required");
 }
 if(age<21 || age>65)
 {
 addFieldError("age","Age should be in between 21 and 65");
 }
 if(empId < 9999 && empId > 99999) {
	 addFieldError("empId","The employee id should be a 5 digit number");
 }
 if(dept.length() != 2) {
	 addFieldError("dept","The department should 2 characters long");
 }
 if(dept==null || dept.trim().equals("")) {
	 addFieldError("dept","The department abbr. is required");
 }
 if(dept == "HR" || dept == "IT") {
	 addFieldError("dept","The department should be either HR or IT");
 }
 }
 public String getName() { 
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public int getAge() {
 return age;
 }
 public void setAge(int age) {
 this.age = age;
 }


} 