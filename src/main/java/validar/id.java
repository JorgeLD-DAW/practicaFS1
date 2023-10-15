package validar;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = idvalidar.class)
public @interface id {

	String message() default "codigo no valido";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
