/* Name= Surya Pratap Singh
   Roll Number: 66
   Section : C
   University Roll Number: 1018614 */

package com.surya.practical3; // package 

import com.opensymphony.xwork2.ActionSupport;

public class prac extends ActionSupport // class A extends class B
{
    private String User_Name;
    private String password;
    // string for User_Name and passWord is private, that means cannot be outside.

    public String execute() 
    {
        return "successfully done"; //poped message.
    }

    public void validate()
    {
        if (User_Name == null || User_Name.trim().equals("")) 
        {
            addFieldError("name", "The name is required");
        }
        if (password == null || password.length() < 8)
        	// check for conditions if password = null
            addFieldError("password", "Password must be of at least length 8");
    }

    public String getName() 
    {
        return User_Name;
        //returns the User_Name
    }

    public void setName(String name) {
        this.User_Name = name;
        //takes the address of other parameter using this keyword
    }

    public String getPassword() {
        return password;
        //returns password
    }

    public void setPassword(String password) {
        this.password = password;
    } 

} // end of program 

