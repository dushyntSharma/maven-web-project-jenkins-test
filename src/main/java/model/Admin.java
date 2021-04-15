package model;

public class Admin {
	private String aEmail;
	private String pass;

	public Admin(String aEmail, String pass) {
		super();
		this.aEmail = aEmail;
		this.pass = pass;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getaEmail() {
		return aEmail;
	}

	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}
