package com.ujjawal.struts2;

import com.opensymphony.xwork2.ActionSupport;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("serial")
public class Employee extends ActionSupport{
 private String name;
 private String password;

 public String execute() {
 return "success";
 }
 public void validate() {
 if(name==null || name.trim().equals("")) {
 addFieldError("name","The name is required");
 }
// String regex="^(?=.\\d)(?=.[a-z])(?=.[A-Z])(?=.[@#$%]).{8,20}$";
// if(password==null)
// {
// addFieldError("password","The password is required");
// }
// else {
//	 addFieldError(execute());
// }
 }
 public String getName() { 
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public String getPassword() {
 return password;
 }
 public void setAge(String password) {
 this.password = password;
 }


}