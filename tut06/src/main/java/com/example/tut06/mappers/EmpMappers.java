package com.example.tut06.mappers;


import com.example.tut06.dto.DeptDto;
import com.example.tut06.dto.RegDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMappers {
    //    1. ajax사용해서 db불러오기
    @Select("select * from kor_buseo ORDER BY kor_buseo_code DESC")
    public List<DeptDto> getDept();

    @Insert("insert into tb_reg values(#{dept}, #{email}, #{passwd})")
    public void saveEmp(RegDto regDto);

    @Select("SELECT * FROM tb_reg")
    List<RegDto> getEmpAll();

    @Delete("delete from tb_reg where email = #{email}")
    void deleteEmp(String email);
}
