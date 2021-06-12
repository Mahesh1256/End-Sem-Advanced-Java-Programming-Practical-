/*22_1018480_Divya_Pathak*/
package practical12;
import java.util.regex.*;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class Employee extends ActionSupport{
 private String name;
 private String email;
 
 public String email_regex = "^(.+)@(.+)$";

 public String execute() {
 return "success";
 }
 public void validate() {
	 Pattern pattern = Pattern.compile(email_regex);
	 Matcher matcher = pattern.matcher(email);
	 
	 if(name==null || name.trim().equals("")) {
		 addFieldError("name","The name is required");
	 }
	 if(name.length() > 30 ) {
		 addFieldError("name","The name should be of length less than 30 ");
	 }
 
	 if(matcher.matches() == false)
	 {
		 addFieldError("email","Email should be of format abc1@xyz.com");
	 }
 }
 public String getName() { 
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

} 