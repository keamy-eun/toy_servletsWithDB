package com.midleterm.midle_term.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
// @RequestMapping(value="/communitys")
public class CommunityController {
    
    @RequestMapping("/lecture")
    public ModelAndView getMemberList(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("communitys/community_lecture");
        return modelAndView;

    }
    
}
