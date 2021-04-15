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
@Table(name = "poc_details")
public class Detail {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String problemDetails;
    private String domain;
    private String lob;
    private String personas;
    private String kpi;
    private String tcsSolution;
    private String features;
    private String benefits;
    private String tag;
    private Date startDate;
    private Date endDate;
    private String productType;
    private String status;
    private String technology;
    private String codeReference;
    private String demoVideo;
    private String pov;
    private String architectureDiagram;
    private String topProspectiveCustomers;
    private String innovationCategory;
    private String g_and_t_story;
    private String crm_ID;
    private String customerAccount;
    private String productOwners;
    private String contextualMaster;
    private String innovistaChampion;
    private String crowdSourcingChampion;
    private String brm_CP;
    private String associatesContributingToPOCs;
}

