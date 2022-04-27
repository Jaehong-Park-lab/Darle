package com.spring.darle.dao;

import com.spring.darle.dto.MemberDto;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {
    @Autowired
    private SqlSessionTemplate sqlSession;

    private static String nameSpace = "member";


    public int insert(MemberDto dto) {
        System.out.println("test222");
        return sqlSession.insert(nameSpace + ".join", dto);


    }
}
