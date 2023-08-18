package com.example.BeanFLL;

import com.example.BeanFLL.Instructor.Instructors;
import com.example.BeanFLL.Student.Students;

public class Classroom {

    Instructors instructors;
    Students students;


    public Classroom(Instructors instructors, Students students ) {
        this.instructors=instructors;
        this.students=students;
    }

    public void hostLecture (Teacher teacher, double numberOfHours){
        teacher.lecture(students,numberOfHours);
    }


    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }
}
