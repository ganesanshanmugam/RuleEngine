package com.re.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserInfoController {

    public interface EndPoint {
        String ROOT = "/";
        String READ_RULES = "readRules";
    }


    @RequestMapping(value = {EndPoint.ROOT, EndPoint.READ_RULES}, method = RequestMethod.GET)
    public String readUsers(Model model) {
        return "Done!!!";
    }

}
