package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Colleges {
    private List<College> collegelist;

    public List<College> getCollegeList() {
        
        if(collegelist == null){
            collegelist  = new ArrayList<>();
        }
        return collegelist;
        }

    public void setCollegeList(List<College> collegelist){
        this.collegelist = collegelist;
    }
    
}
