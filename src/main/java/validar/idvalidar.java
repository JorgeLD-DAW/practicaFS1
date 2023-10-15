package validar;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class idvalidar implements ConstraintValidator<id, Integer> {

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		return value != null && value > 0;
	}

}
