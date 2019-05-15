package com.example.projectcomunication.exception;

public class DriverNotFound extends RuntimeException {

    public DriverNotFound() {
        super("Driver not found!");
    }
}
