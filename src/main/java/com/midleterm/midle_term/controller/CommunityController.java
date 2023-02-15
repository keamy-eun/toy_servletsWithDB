package com.midleterm.midle_term.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommunityController {

 
    
    // 강좌게시판
    @RequestMapping(value="/community_lecture", method = RequestMethod.GET)
    public ModelAndView getLecture(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/communitys/community_lecture");
        return modelAndView;
    }

    // 강사게시판
    @RequestMapping(value="/community_lecturer", method = RequestMethod.GET)
    public ModelAndView getLecturer(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/communitys/community_lecturer");
        return modelAndView;
    }

    //공지사항 게시판
    @RequestMapping(value="/community_notice", method = RequestMethod.GET)
    public ModelAndView getNotice(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/communitys/community_notice");
        return modelAndView;
    }

    // 게시글 페이지
    @RequestMapping(value="/community_post", method = RequestMethod.GET)
    public ModelAndView getPost(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/communitys/community_post");
        return modelAndView;
    }

    // 게시글 작성 페이지
    @RequestMapping(value="/community_posting", method = RequestMethod.GET)
    public ModelAndView getPosting(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/communitys/community_posting");
        return modelAndView;
    }

    // 학생게시판
    @RequestMapping(value="/community_student", method = RequestMethod.GET)
    public ModelAndView getStudent(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/communitys/community_student");
        return modelAndView;
    }

    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    public ModelAndView form(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        modelAndView.setViewName("/communitys/test");
        return modelAndView;
    
}
}