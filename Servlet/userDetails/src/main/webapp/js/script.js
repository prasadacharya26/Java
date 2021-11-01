function validateField(){
    var name=$('#username').val();
    var email=$('#email').val();
    var contact=$('#contact').val();
    var city=$('#city').val();
    var password=$('#password').val();
    var cnfpassword=$('#cnfpassword').val();
    var country=$('#country').val();
    var status=$('input[type=checkbox]:checked');
    var gender= $("input[name='gender']:checked").val();
    if(name ==""){
        $('#nameValid').html("Invalid full name. Name between 4 and 15 charcter required, it must contain lowercase letters.").css("color", "red");
    }
    else if(email==""){
        $('#emailValid').html("Invalid email.").css("color", "red");
    }
    else if(contact==""){
        $('#contactValid').html("Invalid contact number.").css("color", "red");
    }
    else if(date =="") {
        $('#dateValid').html("Invalid date. Date of birth must be contain.").css("color", "red");
    }
    else if(password == ""){
        $('#passwordValid').html("Invalid password. Your password between 8 and 16 characters. It contain upper and lower case letters, and number.").css("color", "red");
    }
    else if(cnfpassword == ""){
        $('#cnfpasswordValid').html("Invalid password. Your password between 8 and 16 characters. It contain upper and lower case letters, and number.").css("color", "red");
    }

    if(gender){
        $('#genderValid').html('&#10004;').css("color", "green");
    }else{
        $('#genderValid').html("Select gender.").css("color", "red");
    }
    if(status.length>=1){
        $('#statusValid').html('&#10004;').css("color", "green");
    }else{
        $('#statusValid').html("Select status.").css("color", "red");
    }
    if(!country == ""){
        $('#countryValid').html('&#10004;').css("color", "green");
    }else{
        $('#countryValid').html("Select your country.").css("color", "red");
    }
       
    
}
function validateName(){
    var name=$('#username').val();
    var lowerCaseLetters = /^[a-z]+$/;
    if(name != "" && name.length > 3 && name.length < 15 && name.match(lowerCaseLetters)){
        $('#nameValid').html('&#10004;').css("color", "green");
    }else{
        $('#nameValid').html("Invalid full name. Name between 4 and 15 charcter required, it must contain lowercase letters.").css("color", "red");
    }
}
function validateEmail(){
    var email=$('#email').val();
    var emailvalid=/^[a-zA-Z0-9._]+@[a-zA-Z.]+/
    if(email != "" && email.length > 6 && email.length < 18 && email.match(emailvalid)){
        $('#emailValid').html('&#10004;').css("color", "green");
    }else{
        $('#emailValid').html("Invalid email").css("color", "red");
    }
}
function validateContact(){
    var contact=$('#contact').val();
    var number = /^[0-9]+$/;
    if(contact != "" && contact.length ==10 && contact.match(number)){
        $('#contactValid').html('&#10004;').css("color", "green");
    }else{
        $('#contactValid').html("Invalid contact number.").css("color", "red");
    }
}
function validateCity(){
    var city=$('#city').val();
    var lowerCaseLetters = /^[a-z]+$/;
    if(city != "" && city.length > 3 && city.length < 10 && city.match(lowerCaseLetters)){
        $('#cityValid').html('&#10004;').css("color", "green");
    }else{
        $('#cityValid').html("Invalid city. Name between 4 and 10 charcter required, it must contain lowercase letters.").css("color", "red");
    }
}
function validatePassword(){
    var password=$('#password').val();
    var lowerCaseLetters = new RegExp('[A-Z]');
    var upperCaseLetters = new RegExp('[a-z]');
    var number =new RegExp('[0-9]');
    if(password != "" && password.length > 8 && password.length < 16 && password.match(lowerCaseLetters)&& password.match(upperCaseLetters)&& password.match(number)){
        $('#passwordValid').html('&#10004;').css("color", "green");
    }else{
        $('#passwordValid').html("Invalid password. Your password between 8 and 16 characters. It contain upper and lower case letters, and number.").css("color", "red");
    }
}
function validateCnfPassword(){
    var cnfpassword=$('#cnfpassword').val();
    var password=$('#password').val();

    if(password == cnfpassword){
        $('#cnfpasswordValid').html('&#10004;').css("color", "green");
    }else{
        $('#cnfpasswordValid').html("Password does not match.").css("color", "red");
    }
}
function validateDate(){
    var date=$('#date').val();
    if(date != "" ){
        $('#dateValid').html('&#10004;').css("color", "green");
    }else{
        $('#dateValid').html("Invalid date. Date of birth must be contain.").css("color", "red");
    }
}
function validateLoginPassword(){
    var password=$('#password').val();
    var lowerCaseLetters = new RegExp('[A-Z]');
    var upperCaseLetters = new RegExp('[a-z]');
    var number =new RegExp('[0-9]');
    if(password != "" && password.length > 8 && password.length < 16 && password.match(lowerCaseLetters)&& password.match(upperCaseLetters)&& password.match(number)){
        $('#passwordLoginValid').html('&#10004;').css("color", "green");
    }else{
        $('#passwordLoginValid').html("Invalid password.").css("color", "red");
    }
}
