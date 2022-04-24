package com.spring.darle.service;

import com.spring.darle.dto.MemberDto;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    public void postJoin(MemberDto dto);

}
