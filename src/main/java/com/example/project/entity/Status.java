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
@Table(name="status")
public class Status {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String time;
    private String picLink;
    private String status;
}
