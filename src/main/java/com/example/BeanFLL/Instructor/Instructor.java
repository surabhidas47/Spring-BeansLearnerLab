package com.example.BeanFLL.Instructor;

import com.example.BeanFLL.Learner;
import com.example.BeanFLL.People.Person;
import com.example.BeanFLL.Teacher;

public class Instructor extends Person implements Teacher {



    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);

    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {

        //cant use size on iterable
        double numberOfHoursPerLearner;
        long counter = 0;

        for (Learner l: learners) {

            counter++;
        }

        if (counter !=0){
            numberOfHoursPerLearner= numberOfHours/counter;

        } else {
            numberOfHoursPerLearner = 0;
        }

        learners.forEach(learner -> learner.learn(numberOfHoursPerLearner));


    }
}
