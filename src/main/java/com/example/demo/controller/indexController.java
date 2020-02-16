package com.example.demo.controller;

import com.example.demo.mapper.SchoolMapper;
import com.example.demo.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class indexController {


    @Autowired
    private SchoolMapper schoolMapper;

    @RequestMapping("/")
    public String index(Model model){
        List<School> schools=schoolMapper.schoolList();
        model.addAttribute("school",schools);
        return "index";
    }
}
