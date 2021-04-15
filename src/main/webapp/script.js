function required() {
	var name = document.myForm.name.value;
	var age = document.myForm.age.value;
	var address = document.myForm.address.value;
	var city = document.myForm.city.value;
	var state = document.myForm.state.value;
	var country = document.myForm.country.value;
	var pincode = document.myForm.pincode.value;

	var email = document.myForm.email.value;
	var username = document.myForm.username.value;
	var password = document.myForm.password.value;


	var pattern = /^[^0-9]+$/;

	if (name == null || name == "") {
		alert("Name can't be blank!");
		return false;
	}
	if (age == null || age == "") {
		alert("Age can't be blank!");
		return false;
	}
	if (city == null || city == "") {
		alert("city can't be blank!");
		return false;
	}
	if (state == null || state == "") {
		alert("state can't be blank!");
		return false;
	}
	if (country == null || country == "") {
		alert("country can't be blank!");
		return false;
	}
	if (pincode == null || pincode == "") {
		alert("pincode can't be blank!");
		return false;
	}
	if (email == null || email == "") {
		alert("email can't be blank!");
		return false;
	}

	if (username == null || username == "") {
		alert("UserName can't be blank!");
		return false;
	}


	if (address.length > 500) {
		alert("Address should not exceed 500 characters!");
		return false;
	}

	if (password == null || password == "") {
		alert("password should't be blank!");
		return false;
	}

}



