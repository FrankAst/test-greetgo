package com.greetgo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by frankast on 5/20/17.
 */

@Controller
public class WordController {

    @RequestMapping("/data")
    public String getData(){
        return "index";
    }
}
