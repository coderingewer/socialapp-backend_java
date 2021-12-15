package stud.app.core.validation.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import stud.app.core.validation.abstracts.passwordValidService;

@Service
public class PasswordValid implements passwordValidService {

	private static final String PASSWORD_PATTERN ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
	private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

	@Override
	public boolean isValid(String password) {
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

}
