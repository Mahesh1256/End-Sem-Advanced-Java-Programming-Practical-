import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport {

    private String username;
    private String password;
    @Override
    public String execute() throws Exception {


        return super.execute();
    }

    @Override
    public void validate() {
        //CHECKS IF ANY FIELD IS EMPTY
        if(username==null || username.trim().equals(""))
            addFieldError("username","Please enter any name");
        if(password==null || password.trim().equals(""))
            addFieldError("password","Please enter a password");

        //FORM ONLY VALIDATES IF USER IS piyush.bisht & PASSWORD IS 1234

        if(!username.equals("piyush.bisht"))
            addFieldError("username","Enter correct username");
        if(!password.equals("1234"))
            addFieldError("password","Enter correct password");

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
