package com.jda.user.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.jda.user.model.User;

public class UserValidation implements Validator {

	@Override
	public boolean supports(Class<?> aclass) {
		// TODO Auto-generated method stub
		return User.class.equals(aclass);
	}

	@Override
	public void validate(Object user, Errors errors) {
		// TODO Auto-generated method stub
		//User user=(user) o; instead of typecasting object in here define it in method itself
	ValidationUtils.rejectIfEmpty(errors, "username", "required.username", "username is mandatory");
	ValidationUtils.rejectIfEmpty(errors, "password", "required.password", "password is rquired");
	ValidationUtils.rejectIfEmpty(errors, "firstname", "required.firstname", "firstname is required");
	ValidationUtils.rejectIfEmpty(errors, "lastname", "required.lastname", "lastname is required");
	ValidationUtils.rejectIfEmpty(errors, "email", "required.email", "email is required");
	ValidationUtils.rejectIfEmpty(errors, "phone", "required.phone",  "phone is required");
	}

	
}

