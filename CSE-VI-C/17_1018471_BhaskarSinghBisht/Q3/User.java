package myPackage;

import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class User extends ActionSupport{
 private String name;
 private String age;

 public String execute() {
 return "success";
 }
 public void validate() {
 if(name==null || name.trim().equals("")) {
 addFieldError("name","UserName is Mandatory");
 }
 if(age.length() <8)
 {
 addFieldError("age","Your Password length should be more than 8");
 }
 }
 public String getName() { 
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public String getAge() {
 return age;
 }
 public void setAge(String age) {
 this.age = age;
 }
} 