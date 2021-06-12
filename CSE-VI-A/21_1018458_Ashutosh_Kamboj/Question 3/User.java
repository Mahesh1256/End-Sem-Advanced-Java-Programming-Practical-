import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class Employee extends ActionSupport{
 private String name;
 private int pass;

 public String execute() {
 return "success";
 }
 public void validate() {
 if(name==null || name.trim().equals("")) {
 addFieldError("name","The name is required");
 }
  if(pass==null) {
 addFieldError("Password","The Password is required");
 }
 
 }
 public String getName() {
   return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public int getPassword() {
 return pass;
 }
 public void setPassword(int pass) {
 this.pass=pass;
 }


}
