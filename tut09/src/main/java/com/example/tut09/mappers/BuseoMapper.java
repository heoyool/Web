package com.example.tut09.mappers;


import com.example.tut09.dto.BuseoDto;
import com.example.tut09.dto.EmpDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BuseoMapper {

    //    부서가져오는 select
    @Select("select * from kor_buseo")
    // 결과가 줄로나옴 > result안에 들어감.
    List<BuseoDto> getEmpAjax();

    //    insert시
    @Insert("INSERT INTO kor_emp VALUES(null, #{dept}, #{email}, #{username}, now())")
//    insert는 결과가 들어갔다고 나오지 않음 따라서 > void임
    void saveEmp(EmpDto empDto);

    //    부서입력한값 나오는 select
    @Select("select * from kor_emp order by id desc")
    List<EmpDto> getEmpAll();


    @Delete("DELETE FROM kor_emp WHERE id = #{id}")
    void deleteEmp(int id);

    @Select("select * from kor_emp WHERE id = #{id})")
    EmpDto getEmpOne(int id);
}