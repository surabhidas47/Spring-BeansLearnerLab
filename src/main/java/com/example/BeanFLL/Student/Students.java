package com.example.BeanFLL.Student;

import com.example.BeanFLL.People.People;
import com.example.BeanFLL.Student.Student;

import java.util.Iterator;

public class Students extends People<Student> {
    @Override
    public Iterator<Student> iterator() {
        return null;
    }

    public Students(Student... p) {
        super(p);
    }
}
