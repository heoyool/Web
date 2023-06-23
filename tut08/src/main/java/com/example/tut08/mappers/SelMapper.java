package com.example.tut08.mappers;


import com.example.tut08.dto.BuseoDto;
import com.example.tut08.dto.PosDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface SelMapper {

        //get Buseo 부서 가지고 오기
    @Select("select * from kor_buseo")
    List<BuseoDto> getBuseo();

    @Select("select * from kor_position where kor_buseo_code = #{selectValue}")
    List<PosDto> getPos(String selectValue);

}

