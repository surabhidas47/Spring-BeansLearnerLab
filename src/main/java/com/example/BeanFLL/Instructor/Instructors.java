package com.example.BeanFLL.Instructor;

import com.example.BeanFLL.Instructor.Instructor;
import com.example.BeanFLL.People.People;

import java.util.Iterator;

public class Instructors extends People<Instructor> {
    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }

    public Instructors(Instructor... p) {
        super(p);
    }
}
