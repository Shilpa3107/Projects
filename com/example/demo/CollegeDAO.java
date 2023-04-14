package com.example.demo;

import org.springframework.stereotype.Repository;
import com.example.demo.Colleges;

@Repository

public class CollegeDAO{
    private static Colleges list = new Colleges();

    static {
        list.getCollegeList().add( new College("IIT Madras", "B.TECH",800000.0, 4, "AC", 20000.0));
        list.getCollegeList().add( new College("IIT Bombay", "B.SC",80000.0, 3, "AC", 20000.0));
        list.getCollegeList().add( new College("IIT Delhi", "B.A",80000.0, 4, "AC", 2000.0));

    }

    public Colleges getAllColleges(){
        return list;
    }

    public void addCollege(College college){
        list.getCollegeList().add(college);
    }
}
