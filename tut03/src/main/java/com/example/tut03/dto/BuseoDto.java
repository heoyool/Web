package com.example.tut03.dto;

import lombok.Data;

@Data
public class BuseoDto {
//    db를 보고 필드를 작업하면 됨
//    첫단어 제외한 나머지 단어의 첫글자는 대문자로 사용
    private String korBuseoCode;
    private String korBuseoName;

}
