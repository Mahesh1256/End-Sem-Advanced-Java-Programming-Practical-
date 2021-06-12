import com.opensymphony.xwork2.ActionSupport;

public class Employee extends ActionSupport{
 private String name;
 private int age;

 public String execute() {
 return "success";
 }
 public void validate() {
 if(name==null || name.trim().equals("")) {
 addFieldError();
 }
 if(age<28 || age>65)
 {
 addFieldError("6");
 }
 }
 public String getName() { 
Pulkit ROLL-53 CSE-6(A)
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