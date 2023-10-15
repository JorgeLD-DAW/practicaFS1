package validar;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = codigovalidar.class)
public @interface codigo {

	String message() default "ingrase un codigo que siga el formato  'EMP-dep-123";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}