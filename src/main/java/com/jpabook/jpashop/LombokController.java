package com.jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LombokController {


    @GetMapping("/Lombok")
    public String Lombok(Model model) {
        model.addAttribute("data", "Lombok");
        return "Lombok";
    }

}
