package com.robuxstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StoreController {

    @GetMapping("/robux-store")
    public String showStorePage() {
        return "redirect:/static/index.html"; // Отдаем статический HTML
    }

    @PostMapping("/process-payment")
    @ResponseBody
    public String processPayment(
            @RequestParam("robux") int robux,
            @RequestParam("amount") double amount) {
        
        // Здесь можно добавить логику обработки платежа
        return "Платеж принят! Robux: " + robux + ", Сумма: " + amount + " руб.";
    }
}
