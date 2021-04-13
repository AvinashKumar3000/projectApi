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
    private String industry;
    private String lob;
    private String personas;
    private String kpi;
    private Date startDate;
    private Date endDate;
    private String productType;
    private String status;
    private String techStack;
    private String codeRef;
    private String demoVideo;
    private String pov;
    private String businessPotentialCustomer;
    private String innovationCategory;
    private String gAndTStory;
    private String crmId;
    private String customerAccount;
    private String productOwners;
    private String contextualMaster;
    private String innovistaChampion;
    private String crowdSourcingChampion;
    private String brm;
    private String associates;
    private String attachments;
}
