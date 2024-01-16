package com.example.movie5service.validation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class CheckNameValidator implements ConstraintValidator<CheckNameValidation, String> {
    @Override
    public boolean isValid(String name, ConstraintValidatorContext context) {
        List<String> forbiddenWords = new ArrayList<>(List.of("home", "horror", "murder", "prison"));

        if (name == null || name.isBlank()) {
            return false;
        }
        for (String word: forbiddenWords) {
            if (name.toLowerCase().contains(word)){
                return false;
            }
        }
        return true;
    }
}



