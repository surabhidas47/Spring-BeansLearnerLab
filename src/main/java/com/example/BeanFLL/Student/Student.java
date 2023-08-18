package com.example.BeanFLL.Student;

import com.example.BeanFLL.Learner;
import com.example.BeanFLL.People.Person;

public class Student extends Person implements Learner {

    double totalStudyTime;



    public Student(Long id, String name) {
        super(id, name);
    }

    public double returnTotalStudy(){
        return this.totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {

       this.totalStudyTime += numberOfHours;

    }
}
