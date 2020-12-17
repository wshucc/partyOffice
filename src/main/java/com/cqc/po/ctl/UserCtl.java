package com.cqc.po.ctl;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserCtl {


    @GetMapping("/po/login")
    public String login() throws Exception{
        return "login";
    }

    @GetMapping("/po/index")
    public String index(String mobile,String verifyCode) throws Exception{
     return "index";
    }

}
