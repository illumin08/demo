package com.example.demo.mapper;

import com.example.demo.model.School;
import com.example.demo.model.School_Pro;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface School_ProMapper {

    @Select("select * from school_pro where id=#{id}")
    List<School_Pro> selectPidById(@Param("id") int id);

    @Select("select * from school_pro where pid=#{pid}")
    List<School_Pro> selectIdByPid(@Param("pid") int pid);
}
