package com.example.springedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class StudyPathController {
//    @RequestMapping(value="/study/{no}/thymeleaf")
//    public RedirectView loadThymeleafPage(@PathVariable("no")int no,String url){
//
//        if (no == 1) {
//           url = "https://abbo.tistory.com/56";
//        } else if (no == 2) {
//           url = "https://abbo.tistory.com/57";
//        } else if (no == 3) {
//            url = "https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html";
//        } else if (no == 4) {
//            url = "https://www.baeldung.com/dates-in-thymeleaf";
//        }
//        return new RedirectView((url));
//    }

    @RequestMapping(value="/study/{no}/thymeleaf")
    public String studyPath(@PathVariable("no")int no){
        if(no == 1){
            return "redirect:https://abbo.tistory.com/56";
        } else if (no == 2) {
            return "redirect:https://abbo.tistory.com/57";
        } else if (no == 3) {
            return "redirect:https:www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html";
        } else if (no == 4) {
            return "redirect:https:www.baeldung.com/dates-in-thymeleaf";
        }
        return "";
    }
}
