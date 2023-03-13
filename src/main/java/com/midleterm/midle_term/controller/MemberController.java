package com.midleterm.midle_term.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="")
public class MemberController {
    
    @RequestMapping("/memberList")
    public String getMemberList(ModelAndView modelAndView){
        
        
        return null;

    }
    
}
