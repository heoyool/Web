package com.example.tut10.mappers;


import com.example.tut10.dto.CrudDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CrudMapper {
//
//    @Insert("INSERT INTO kor_sawon VALUES(NULL, #{empEmail}, #{empPasswd}, #{empName}, now())")
//    void saveEmp(CrudDto crudDto);
//
//    @Select("select * from kor_sawon order by emp_id desc")
//    List<CrudDto> getEmpAll();
//
//    @Delete("delete from kor_sawon where emp_id = #{id}")
//    void deleteEmp(int empId);

    @Insert("INSERT INTO kor_sawon VALUES(NULL, " +
            "#{empEmail}, " +
            "#{empPasswd}, " +
            "#{empName}, now())")
    void saveEmp(CrudDto crudDto);

    @Select("select * from kor_sawon order by emp_id desc;")
    List<CrudDto> getEmpAll();

    @Delete("delete from kor_sawon where emp_id = #{empId}")
    void deleteEmp(int empId);

    @Select("select * from kor_sawon where emp_id = #{id}")
    CrudDto getEmpOne(int id);

    @Update("update kor_sawon set emp_email = #{empEmail}, emp_passwd = #{empPasswd}, emp_name = #{empName} where emp_id = #{empId}")
    void updateEmp(CrudDto crudDto);
}
