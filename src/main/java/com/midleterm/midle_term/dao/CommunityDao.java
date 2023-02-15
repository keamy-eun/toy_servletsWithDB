package com.midleterm.midle_term.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommunityDao {
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;
    
    public Object 메소드명(String sqlMapId, Object dataMap){
        Object result = sqlSessionTemplate.selectList(sqlMapId, dateMap);
    }
    
}



