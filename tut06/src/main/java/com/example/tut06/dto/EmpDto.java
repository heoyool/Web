package com.example.tut06.dto;


import lombok.Data;

//lombok이 알아서 g,s처리해줌. 필드는 만들어야함.
@Data
public class EmpDto {
    private String dept;
    private String email;
    private String passwd;
}
