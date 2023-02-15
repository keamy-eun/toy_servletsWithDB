package com.midleterm.midle_term.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    
    // 회원수정
    @RequestMapping(value="/admin_edit", method = RequestMethod.GET)
    public ModelAndView getEdit(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/main/admin_edit");
        return modelAndView;
    }

    // 회원조회
    @RequestMapping(value="/admin_member", method = RequestMethod.GET)
    public ModelAndView getMember(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/main/admin_member");
        return modelAndView;
    }

    // 강좌 리뷰 조회
    @RequestMapping(value="/lecture_review", method = RequestMethod.GET)
    public ModelAndView getReview(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/main/lecture_review");
        return modelAndView;
    }

    // 강좌신청목록
    @RequestMapping(value="/lecture_signup_list", method = RequestMethod.GET)
    public ModelAndView getLectureList(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/main/lecture_signup_list");
        return modelAndView;
    }

    // 강좌신청
    @RequestMapping(value="/lecture_signup", method = RequestMethod.GET)
    public ModelAndView getLecture(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/main/lecture_signup");
        return modelAndView;
    }

    // 로그인
    @RequestMapping(value="/main_login", method = RequestMethod.GET)
    public ModelAndView getLogin(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/main/main_login");
        return modelAndView;
    }

    // 회원가입
    @RequestMapping(value="/main_signUp", method = RequestMethod.GET)
    public ModelAndView getSighUp(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/main/main_signUp");
        return modelAndView;
    }

    // 메인페이지
    @RequestMapping(value="/main", method = RequestMethod.GET)
    public ModelAndView getMain(@RequestParam Map<String, Object> params, ModelAndView modelAndView ){
        // Object resultMap = 서비스.get서비스메소드(params);
        // modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/main/main");
        return modelAndView;
    }

    
}
