package com.example.demo.service;

import com.example.demo.dto.School_MajorDTO;
import com.example.demo.mapper.SchoolMapper;
import com.example.demo.mapper.School_ProMapper;
import com.example.demo.model.School;
import com.example.demo.model.School_Pro;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SchoolService {
    @Autowired
    private School_ProMapper school_proMapper;
    @Autowired
    private SchoolMapper schoolMapper;


    public List<School_MajorDTO> selectBypId(int pid){
        List<School_Pro> school_majorList=school_proMapper.selectIdByPid(pid);
        List<School_MajorDTO> school_majorDTOList=new ArrayList<>();
        for (School_Pro school_pro:school_majorList){
            School school=schoolMapper.selectBymid(school_pro.getId());
            School_MajorDTO school_majorDTO=new School_MajorDTO();
            BeanUtils.copyProperties(school_pro,school_majorDTO);
            school_majorDTO.setSchool(school);
            school_majorDTOList.add(school_majorDTO);
        }


        return school_majorDTOList;
    }
}
