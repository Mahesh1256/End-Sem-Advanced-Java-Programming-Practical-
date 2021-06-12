	package valid;
	import com.opensymphony.xwork2.ActionSupport;
	@SuppressWarnings("serial")
	public class user extends ActionSupport{
		private String name;
		private String pass;

		public String execute() {
			return "success";
		}
		public void validate() {
			if(name==null || name.trim().equals("")) {
				addFieldError("username","The name is required");
			}
			if(pass=="qw3rty12E4")
			{
				addFieldError("PAssword","Password is required");
			}
		}
		public String getName() { 
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getpass() {
			return pass;
		}
		public void setpass(String pass) {
			this.pass= pass;
		}
	} 
 }