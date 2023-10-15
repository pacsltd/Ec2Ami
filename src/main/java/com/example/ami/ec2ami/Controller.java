package com.example.ami.ec2ami;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping
    public String testMe() {
        return "twatting once again my lover :)";
    }

    @RequestMapping("/wanker")
    public String testMeWanker() {
        return "wanking_twatting oh noooo";
    }
}
