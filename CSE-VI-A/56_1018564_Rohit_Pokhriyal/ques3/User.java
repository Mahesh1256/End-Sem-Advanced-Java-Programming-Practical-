//Rohit Pokhriyal rollno56 secA
package ques3;
import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport{
    private String name;
    private String password;

    public String execute() { //execute method
        return "success";
    }
    public void validate() { //validate method
        if(username==null || username.trim().equals("")) {
        addFieldError("username","The user name is required.");
        }
        if(password==null || password.trim().equals("")){
        addFieldError("password","The password is required.");
        }
    }
    
    //getters and setters
    public String getName() { 
    return name;
    }
    public void setName(String name) {
    this.name = name;
    }
    public int getPassword() {
    return password;
    }
    public void setPassword(string password) {
    this.password = password;
    }
} 