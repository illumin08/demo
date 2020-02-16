package com.example.demo.controller;

import com.example.demo.dto.School_MajorDTO;
import com.example.demo.dto.School_ProDTO;
import com.example.demo.service.ProfessionService;
import com.example.demo.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Controller
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @GetMapping("/school/{pid}")
    public String School(@PathVariable("pid") int pid ,Model model){
         List<School_MajorDTO> school_majorDTOList= schoolService.selectBypId(pid);
         model.addAttribute("school",school_majorDTOList);
         return "school";
    }

}




