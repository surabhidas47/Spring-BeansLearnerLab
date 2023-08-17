package com.example.BeanFLL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<PersonType>{

    List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    //d define a constructor which consumes a variable number of PersonType
    // objects and sets the personList field respectively.
    public People(PersonType...p) {
        this.personList = new ArrayList<>(Arrays.asList(p));
    }

    public void add(PersonType p){
        personList.add(p);
    }

    public void remove (PersonType p){
        personList.remove(p);
    }

    public int size() {
        return personList.size();
    }



}
