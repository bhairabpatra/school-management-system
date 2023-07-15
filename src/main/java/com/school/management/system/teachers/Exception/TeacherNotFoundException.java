package com.school.management.system.teachers.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class TeacherNotFoundException extends Exception{
    private static final long serialVersionUID = -435435435435435L;
    public TeacherNotFoundException(String exception){
        super(exception);
    }
}

