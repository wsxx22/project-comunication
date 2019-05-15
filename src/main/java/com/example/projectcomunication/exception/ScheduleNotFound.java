package com.example.projectcomunication.exception;

public class ScheduleNotFound extends RuntimeException {
    public ScheduleNotFound() {
        super("Schedule not found!");
    }
}
