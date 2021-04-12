package com.example.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Details")
public class Detail {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String description;
    private String LOB;
    private String personas;
    private String business;
    private String productType;
    private String KPI;
    private String architectureDiagram;
    private String[] techStack;
    private Date startDate;
    private Date endDate;
    private String[] productOwner;
    private String[] contextualMaster;
    private String status;
    private String[] innovistaChampion;
    private String[] crowdSourcingChampionOrDP;
    private String[] BRMOrCP;
    private String[] associatesContributinToPOCs;
    private String notes;
    private String gitlab;
    private String demoVideoOrImage;
    private String PoV;
    private String[] additionalDocs;
}
