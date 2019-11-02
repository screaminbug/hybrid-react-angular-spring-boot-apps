package com.example.demo.repository;

import com.example.demo.domain.Hero;
import com.example.demo.domain.QHero;
import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class HeroNameRepositoryImpl implements HeroNameRepository {
  @PersistenceContext
  private EntityManager em;

  @Override
  public List<Hero> findByName(String name) {
    JPAQueryFactory q = new JPAQueryFactory(em);
    return q.selectFrom(QHero.hero)
      .where(QHero.hero.name.contains(name))
      .fetch();
  }
}
