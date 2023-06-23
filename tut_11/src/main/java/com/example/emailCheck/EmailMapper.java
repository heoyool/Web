package com.example.emailCheck;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmailMapper {
    @Select("select count(*) from tbl_email where email =#{email}")
    int getEmailCheck(String emailValue);
}
