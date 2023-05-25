package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertCurrency {
    @GetMapping("/")
    public String showForm(){
        return "convertCurrency";
    }

    @GetMapping("/result")
    public String convert(@RequestParam double usd, Model model){
        double VND = usd * 22000;
        model.addAttribute("yen", VND);
        return "result";
    }
    @GetMapping("convert")
    public String showForm2(){
        return "convertCurrency2";
    }
    @GetMapping("/result2")
    public String convertVndToUsd(@RequestParam double vnd, Model model){
        double usd = vnd/22;
        model.addAttribute("USD",usd);
        return "result2";
    }
}
