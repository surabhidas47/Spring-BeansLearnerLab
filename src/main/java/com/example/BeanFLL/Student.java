package com.example.BeanFLL;

public class Student extends Person implements Learner{

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
