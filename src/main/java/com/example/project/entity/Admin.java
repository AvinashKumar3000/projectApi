package com.example.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="admin")
public class Admin {
    @Id
    @GeneratedValue
    private int id;
    private String yourname;
    private String username;
    private String pass;
    private String websiteLink;
    private String location;
    private String startDate;
    private String ceo;
    private String profileLink;
    private String groupId;
}
