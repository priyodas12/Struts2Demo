package controller;

import com.opensymphony.xwork2.ActionSupport;

public class UserController extends ActionSupport {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void validate() {
		if(name.equals("")) {
			addFieldError( "name", "Name Should not be empty!");
		}
	}
	@Override
	public String execute() throws Exception {
		//do controller work!
		return "success";
	}
}
