package com.example.demo.controller;

import com.example.demo.dao.StudyPlanJdbc;
import com.example.demo.model.StudyPlan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyPlanController {
    private final StudyPlanJdbc studyplanJdbc;
    public StudyPlanController (StudyPlanJdbc studyplanJdbc) {
        this.studyplanJdbc = studyplanJdbc;
    }
    @GetMapping("/studyplan/{id}")
    public StudyPlan getStudyPlan (@PathVariable int id) {
        StudyPlan mark = studyplanJdbc.get(id);
        return studyplan;
    }
}
