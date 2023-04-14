package com.example.demo;

import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ReponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.Colleges;
import com.example.demo.CollegeDAO;
import com.example.demo.College;

@RestController
@RequestMapping(path = "/colleges")
public class CollegeController {

    @Autowired
    private CollegeDAO collegeDao;

    @GetMapping(
        path = "/", produces = "application/json"
    )
    public Colleges getColleges(){
        return collegeDao.getAllColleges();
    }

    @PostMapping(
        path = "/", consumes = "application/json", produces = "application/json"
    )
    public ReponseEntity<Object> addCollege(
        @RequestBody College college
    )
    {
        Integer 
    }
    
}
