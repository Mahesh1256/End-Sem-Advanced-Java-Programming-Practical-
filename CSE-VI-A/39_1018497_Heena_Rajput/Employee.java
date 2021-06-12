
package practical12;


//HeenaRajput-A-39
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")

public class Employee1 extends ActionSupport{
	
	private String name;
	private String password;
	
	public String execute() {
		return "success";
	}
	
	public void validate() {
		if(name==null || name.trim().equals("")) {
			addFieldError("name","The Name is Required");
		}
		
		if(password==null || password.trim().equals(""))
		{
			addFieldError("password","Password is required");
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



