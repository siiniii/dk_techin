package com.example.springedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {
    @PostMapping(value = "/calcController")
    public ModelAndView calcResult( @RequestParam(value = "firstNum", defaultValue = "1") int num1, @RequestParam(value = "secondNum", defaultValue = "1") int num2, @RequestParam(value = "operator", defaultValue = "") String operator) {
        ModelAndView mav = new ModelAndView();
        int result = 0;
            if (num2 == 0 && operator.equals("divide")) {
                mav.addObject("errorMSG", "나눗셈 연산시 두 번째 숫자는 0일 수 없습니다!!");
                mav.setViewName("calcError");
            }
            else {
                if (operator.equals("divide")) {
                    result = num1 / num2;
                } else if (operator.equals("plus")) {
                    result = num1 + num2;
                } else if (operator.equals("minus")) {
                    result = num1 - num2;
                } else {
                    result = num1 * num2;
                }
                mav.setViewName("calcResult");
                mav.addObject("result", result);
            }

        return mav;
        }


}
