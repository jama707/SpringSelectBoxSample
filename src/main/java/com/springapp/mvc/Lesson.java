package com.springapp.mvc;

import java.util.Collections;
import java.util.List;

public class Lesson {
    private List<String> options = Collections.emptyList();

    private Course course;
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
       this.course = course;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}