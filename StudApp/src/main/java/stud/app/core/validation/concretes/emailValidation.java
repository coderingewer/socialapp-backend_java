package stud.app.core.validation.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import stud.app.core.validation.abstracts.EmailValidationService;

@Service
public class emailValidation implements EmailValidationService {

	private static final String EMAIL_PATTERN ="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.edu+)*$";
	private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

	@Override
	public boolean isValid(String email) {
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

}
