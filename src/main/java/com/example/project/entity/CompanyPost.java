package com.example.project.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="companypost")
public class CompanyPost {
    @Id
    @GeneratedValue
    private int id;
    private String description;
    private String auther;
    private String shortDesc;
    private String time;
}
