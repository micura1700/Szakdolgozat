package com.goldentable.restaurant.Entity;

import jakarta.persistence.*;
@Entity
@Table(name="Email")
public class Email {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long EmailId;

    @Column(nullable = false, unique = true)
    private String emailName;

    public Email() {
    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailId(long EmailId) {
        this.EmailId = EmailId; }
    public void setEmail(String emailName) {
        this.emailName = emailName;}
}
