package com.goldentable.restaurant.Controller;

import com.goldentable.restaurant.Entity.Email;
import com.goldentable.restaurant.Repository.EmailRepository;
import com.goldentable.restaurant.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmailController {
    private EmailService emailService;

    @Autowired
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    @RequestMapping("/promotions")
    public String promotions(Model model) {
        model.addAttribute("email", new Email());
        return "promotions";
    }

    @PostMapping("/subscribe")
    public String subscribe(@ModelAttribute Email email) {
        String emailCheck = emailService.saveEmail(email);

        if (emailCheck.equals("successSubscribe"))
            return "redirect:/promotions?successSubscribe";
        else
            return "redirect:/promotions?alreadyExists";
    }
}
