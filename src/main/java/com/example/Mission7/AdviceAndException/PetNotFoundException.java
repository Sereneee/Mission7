package com.example.Mission7.AdviceAndException;

public class PetNotFoundException extends RuntimeException {
    public PetNotFoundException(String id) {
        super("Could not find pet with ID: " + id);
    }
}
