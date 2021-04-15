package model;

public class Staff {
	private String name;
	private short age;
	private String address;
	private String city;
	private String state;
	private String country;
	private int pincode;
	private String email;
	private String username;
	private String password;

	public Staff(String name, short age, String address, String city, String state, String country, int pincode,
			String email, String username, String password) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
