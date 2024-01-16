package com.example.movie5service.validation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckNameValidator.class)
public @interface CheckNameValidation {
    String message() default "This field must not be blank or contain forbidden words";
    Class<?>[] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
