package com.example.demo.mapper;

import com.example.demo.model.Profession;
import com.example.demo.model.School;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SchoolMapper {
    @Select("select * from school")
    List<School> schoolList();


    @Select("select * from school where id=#{id}")
    School selectBymid(@Param("id") int id);
}
