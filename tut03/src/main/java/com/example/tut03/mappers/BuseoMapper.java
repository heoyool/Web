package com.example.tut03.mappers;

import com.example.tut03.dto.BuseoDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BuseoMapper {
    //쿼리를 이용해 db자료 검색, 수정, 입력, 삭제를 함 @Mapper을 사용해야 이 역할을 하게 되는 것임)

    @Select("select * from kor_buseo order by kor_buseo_code desc")
    public List<BuseoDto> getBuseoData();
}
