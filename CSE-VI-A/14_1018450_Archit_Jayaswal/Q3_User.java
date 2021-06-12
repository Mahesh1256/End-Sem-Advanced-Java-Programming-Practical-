package Question3; 
import com.opensymphony.xwork2.ActionSupport; 
@SuppressWarnings("serial") 
public class User extends ActionSupport{ 
 private String name; 
 private String pass; 
 //made by Archit Jayaswal
 public String execute() { 
 return "success"; 
 } 
 public void validate() { 
 if(name==null || name.trim().equals("")) { 
 addFieldError("name","The name is required"); 
 } 
 if(pass=="Gehu@123") 
 { 
 addFieldError("Password","password should be correct."); 
 } 
 } 
 public String getName() {
return name; 
 } 
 public void setName(String name) { 
 this.name = name; 
 } 
 public String getPass() { 
 return pass; 
 } 
 public void setPass(String pass) { 
 this.pass = pass; 
 } 
 
 
}