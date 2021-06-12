package Ques2;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class User extends ActionSupport{
private String name;
private String passw;
public String execute() {
return "success";
}
public void validate() {
if(name==null || name.trim().equals("")) {
addFieldError("name","The name is required");
}
if(passw==null || passw.trim().equals(""))
{
addFieldError("paasw","Password is required");
}

}
public String getName() {

return name;
}
public void setName(String name) {
this.name = name;
}
public String getPassword() {
return passw;
}
public void setPassword(String passw) {
this.passw = passw;
}

}