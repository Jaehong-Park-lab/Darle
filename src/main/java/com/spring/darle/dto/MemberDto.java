package com.spring.darle.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class MemberDto {
    String id, pass, user_name, hp_num, email;
}
