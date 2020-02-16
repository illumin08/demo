package com.example.demo.controller;

import com.example.demo.dto.School_ProDTO;
import com.example.demo.model.School;
import com.example.demo.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class professionController {


@Autowired
private ProfessionService professionService;

    @GetMapping("/profession/{id}")
    public String profession (@PathVariable("id") int id, Model model){

        List<School_ProDTO> school_proDTOList=professionService.selectProById(id);
        model.addAttribute("professions",school_proDTOList);

        return "profession";
    }
}
