package com.school.management.system.teachers.Exception;

import jdk.dynalink.linker.LinkerServices;

import java.util.List;

public class ErrorResponse {

    private String name;
    private List<String> details;
    public ErrorResponse(String name, List<String> details) {
        this.name = name;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }
}
