package com.example.demo.repository;


import com.example.demo.domain.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroesRepository extends JpaRepository<Hero, Long> {}
