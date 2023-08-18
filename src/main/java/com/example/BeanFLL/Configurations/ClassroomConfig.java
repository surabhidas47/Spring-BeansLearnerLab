package com.example.BeanFLL.Configurations;


import com.example.BeanFLL.Classroom;
import com.example.BeanFLL.Instructor.Instructors;
import com.example.BeanFLL.Student.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    //The @DependsOn annotation is used to specify the order in which beans should be initialized.
    // It defines a bean dependency relationship, indicating that one bean depends on another and
    // should be initialized only after the specified bean(s) have been initialized

    public Classroom currentCohort(@Qualifier("instructors") Instructors instructors, @Qualifier("students") Students students) {
        return new Classroom(instructors, students);

    }

    @Bean(name = "previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(@Qualifier("instructors") Instructors instructors, @Qualifier("previousStudents") Students students) {
        return new Classroom(instructors, students);

    }

}