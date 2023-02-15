package com.midleterm.midle_term.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midleterm.midle_term.dao.CommunityDao;

@Service
public class CommunityService {

    @Autowired
    CommunityDao communityDao;


    public Object gerLecture(Object dataMap){
        String sqlMapId = "매퍼이름 @@.@@@";
        Object result = communityDao.메소드명(sqlMapId, dataMap);
        return result;
    }
}
