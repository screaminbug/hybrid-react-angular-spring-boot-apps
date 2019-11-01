package com.example.demo.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Hero {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID")
  private Long id;

  @Column(name = "HERO_NAME")
  private String name;
}
