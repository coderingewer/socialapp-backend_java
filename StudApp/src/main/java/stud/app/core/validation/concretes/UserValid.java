package stud.app.core.validation.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import stud.app.core.validation.abstracts.EmailValidationService;
import stud.app.core.validation.abstracts.UserValidService;
import stud.app.core.validation.abstracts.passwordValidService;

@Service
public class UserValid implements UserValidService {

	private passwordValidService passwordValidService;
	private EmailValidationService emailValidationService;
	
	@Autowired
	public UserValid(stud.app.core.validation.abstracts.passwordValidService passwordValidService,
			EmailValidationService emailValidationService) {
		super();
		this.passwordValidService = passwordValidService;
		this.emailValidationService = emailValidationService;
	}

	@Override
	public boolean validInfo(String password, String email) {
		if(passwordValidService.isValid(password) && emailValidationService.isValid(email)) {
			return true;
		}else {
			return false;
		}
	}

}
