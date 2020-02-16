package com.example.demo.dto;

import com.example.demo.model.Profession;
import com.example.demo.model.School;
import javafx.beans.DefaultProperty;
import lombok.Data;

@Data
public class School_MajorDTO {
    private int id;
    private int pid;
    private School school;
}
