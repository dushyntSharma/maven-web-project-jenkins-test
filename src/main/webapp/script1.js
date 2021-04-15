$(document).ready(function() {


	$('#namecheck').hide();
	let nameError = true;
	$('#names').keyup(function() {
		validateName();
	});

	function validateName() {
		let nameValue = $('#names').val();
		if (nameValue.length == '') {
			$('#namecheck').show();
			nameError = false;
			return false;
		}
		else {
			$('#namecheck').hide();
		}
	}

	$('#submit').click(function() {
		validateName();

		if (nameError == true) {
			return true;
		} else {
			return false;
		}
	});
});