package main.java.model;
import java.io.Serializable;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;



@Path("/User")
@Produces("application/json")
public class User {
	private int user_id;
	private String firstName;
	private String lastName;
	private String passWord;
	
	public User()
	{
		
	}

	public int getUser_name() {
		return user_id;
	}
	public void setUser_id(int i) {
		this.user_id = i;
	}
	

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getlastName() {
		return firstName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getpassWord() {
		return firstName;
	}

	public void setpassWord(String firstName) {
		this.firstName = firstName;
	}

	
	
	
	

}



