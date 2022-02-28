package com.example.demo.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity@Data@AllArgsConstructor@NoArgsConstructor@ToString
public class Match {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_match;
    private Date date_fin;
    private Date date_debut;
    private String description;
}

