package com.example.springedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EduController {

    @GetMapping("eduController")
    public String printGrade(Model model, @RequestParam(value = "name", defaultValue = "없음") String name, @RequestParam(value = "avgScore", defaultValue = "없음") int avgScore) {

        model.addAttribute("name", name);
        model.addAttribute("avgScore", avgScore);
        if(avgScore >= 90) {
           return "gradeA";
        } else if (avgScore >= 80 && avgScore < 90) {
            return "gradeB";
        } else if (avgScore >= 70 && avgScore < 80) {
            return "gradeC";
        } else {
            return "gradeD";
        }

    }

}
