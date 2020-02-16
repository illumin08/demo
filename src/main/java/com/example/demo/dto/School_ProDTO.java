package com.example.demo.dto;

import com.example.demo.model.Profession;
import com.example.demo.model.School;
import lombok.Data;

@Data
public class School_ProDTO {
    private int id;
    private int pid;
    private Profession profession;

}
