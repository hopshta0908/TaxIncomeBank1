package ua.lviv.lhz.validations;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;
import ua.lviv.lhz.entity.User;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by Леся Гопшта on 04.08.2016.
 */
@Component
public class UserValidator implements Validator {
    Pattern pattern2 = Pattern.compile( "^[+]{0,1}[- (),0-9]{7,}$" );
    Pattern pattern3 = Pattern.compile( "^[A-Za-z_-]{3,15}$" );
    Pattern pattern4 = Pattern.compile( "^[A-Za-z_-]{2,15}$" );

    public boolean supports(Class<?> aClass) {
        return User.class.equals( aClass );
    }

    public void validate(Object o, Errors errors) {
        User user = (User) o;

        ValidationUtils.rejectIfEmptyOrWhitespace( errors, "name", "name.empty" );
        ValidationUtils.rejectIfEmptyOrWhitespace( errors, "surname", "surname.empty" );
        ValidationUtils.rejectIfEmptyOrWhitespace( errors, "phone", "phone.empty" );
        ValidationUtils.rejectIfEmptyOrWhitespace( errors, "password", "password.empty" );


        boolean passwordSwitcher = true;

        if (user.getPassword().length() < 8) {
            errors.rejectValue( "password", "password.too.short" );
            passwordSwitcher = false;
        }
        if (passwordSwitcher) {
            if (!user.getPassword().equals( user.getPasswordConfirm() )) {
                errors.rejectValue( "password", "bad.password" );
            }
        }

        Matcher matcher;


        if (!(matcher = pattern2.matcher( user.getPhone() )).matches()) {
            errors.rejectValue( "phone", "phone.incorrect" );
        }

        if (!(matcher = pattern3.matcher( user.getName() )).matches()) {
            errors.rejectValue( "name", "bad.name" );
        }
        if (!(matcher = pattern4.matcher( user.getSurname() )).matches()) {
            errors.rejectValue( "surname", "bad.surname" );
        }
    }
}

