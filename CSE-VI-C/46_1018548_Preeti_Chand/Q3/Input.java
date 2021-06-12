package p3;

import com.opensymphony.xwork2.ActionSupport; 
@SuppressWarnings("serial")
public class Input extends ActionSupport{

    private String name; 
    private String password; 
 
 public String execute() { 
 return "success"; 
 } 
 public void validate() { 
 if(name==null || name.trim().equals("")) { 
 addFieldError("name","The name is required"); 
 } 
 if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*") && password.length()>=6 && password.length()<=40)
 addFieldError("Password","Password is strong "); 
 
 else
 addFieldError("Password","Password fromat is wrong "); 
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
public void setPassword(String password) { 
this.password = password; 
}
}