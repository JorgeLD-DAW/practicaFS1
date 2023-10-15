package validar;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = emailValidator.class)
public @interface email {

	String message() default "Ingresa in email valido ('tunombre@gmail.com')";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
