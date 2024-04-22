package com.goldentable.restaurant.Service;

import com.goldentable.restaurant.Entity.Email;
import com.goldentable.restaurant.Repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmailService {
    private EmailRepository emailRepository;

    @Autowired
    public void setRepo(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }


    public String saveEmail(Email emailToSave) {
        Email emailCheck = emailRepository.findByEmailName(emailToSave.getEmailName());

        if ((emailCheck != null)) {
            return "alreadyExists";
        }
        else {
            emailRepository.save(emailToSave);
            return "successSubscribe";
        }
    }
}
