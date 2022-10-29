package formulario.validation;


import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RequeridoValidador implements ConstraintValidator<Requerido, String> {


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || !StringUtils.hasText(value)) {
            return false;
        }

        /*
        if (value == null || value.isEmpty() || value.isBlank()) {
            return false;
        }
         */
        return true;
    }
}
