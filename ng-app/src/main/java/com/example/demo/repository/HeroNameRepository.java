package com.example.demo.repository;

import com.example.demo.domain.Hero;

import java.util.List;

public interface HeroNameRepository {
  List<Hero> findByName(String name);
}
