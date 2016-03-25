package main.java.model;
import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.bind.annotation.XmlRootElement;

import main.java.connectionprovider.ConnectionProvider;


@Path("/User")
public class UserInfo {
	
	public UserInfo()
	{
		
	}
	@GET
	@Path("/id")
	@Produces("application/json")
	public ArrayList<User> users()
	{
	
	ArrayList<User> List = new ArrayList<User>();
	try
	{
	List = new ConnectionProvider().getUsers();
	
	} catch (Exception e)
	{
	e.printStackTrace();
	}
	return List;
	}
	}

	

