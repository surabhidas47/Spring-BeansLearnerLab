package com.example.BeanFLL.Configurations;

import com.example.BeanFLL.Instructor.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorConfig {

    @Bean (name = "tcUsaInstructors")
    public Instructors tcUsaInstructors()
    {
        return new Instructors();
    }

    @Bean (name = "tcUKInstructors")
    public Instructors tcUKInstructors()
    {
        return new Instructors();
    }

    @Primary
    @Bean (name = "ZipCodeWilmingtonInstructor")
    public Instructors ZipCodeWilmingtonInstructor(){
        return new Instructors();
    }




}
