package Question;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class Employee extends ActionSupport{
 private String name;
 private int password;

 public String execute() {
 return "success";
 }
 public void validate() {
 if(name==null || name.trim().equals("")) {
 addFieldError("name","The name is required");
 }
 if(password!==null || password.length>8)
 {
 addFieldError("password","password must be strong and not empty");
 }
 }
 public String getName() {
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public int getPassword() {
 return password;
 }
 public void setPassword(int password) {
 this.password = password;
 }

}