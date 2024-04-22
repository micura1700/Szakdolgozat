package com.goldentable.restaurant.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/menu")
    public String menu() {
        return "menu";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping("/events")
    public String events() {
        return "events";
    }

    @RequestMapping("/music")
    public String music() {
        return "music";
    }
}
