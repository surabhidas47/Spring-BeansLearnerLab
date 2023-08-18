package com.example.BeanFLL.Configurations;

import com.example.BeanFLL.Student.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {



   @Bean(name ="students")

   public Students currentStudents(){
      return new Students();

   }

   @Bean (name ="previousStudents")

   public Students previousStudents(){
      return new Students();

   }



}
