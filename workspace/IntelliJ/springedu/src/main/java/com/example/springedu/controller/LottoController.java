package com.example.springedu.controller;

import com.example.springedu.domain.CountDTO;
import com.example.springedu.domain.LottoDTO;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("cnt")
public class LottoController {

    public int[] lottoCnt(){
        return new int[1];
    }

    @GetMapping("/lotto")
    public String getResult(LottoDTO lottoDTO, Model model){
        int rand = (int)(Math.random()*6)+1;
        if(model.getAttribute("cnt") == null) {
            model.addAttribute("cnt", 0);
        }
        int n = (int) model.getAttribute("cnt");
        if(n > 4) {
            lottoDTO.setResult("<hr>로또 응모는 낙첨된 경우에 한하여 3번 까지만 가능합니다.<br>브라우저를 재기동한 후에 응모해주세요.");
            lottoDTO.setImgName("images/snow.png");
            return "lottoView";
        }
        if(lottoDTO.getLottoNum() == rand) {
            lottoDTO.setResult("추카추카!!");
            lottoDTO.setImgName("images/sun.png");
        } else {
            lottoDTO.setResult("아쉽네요.. 다음 기회를!!");
            lottoDTO.setImgName("images/rain.png");
        }
        model.addAttribute("cnt", n + 1);
        model.addAttribute("lottoDTO", lottoDTO);

        return "lottoView";

    }

}
