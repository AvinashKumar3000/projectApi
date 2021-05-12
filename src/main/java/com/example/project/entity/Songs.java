package com.example.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="songs")
public class Songs {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String url;
    private String cover;
    private String artists;
    private String releases;
    private String genere;
    private String spotifyUrl;
}
