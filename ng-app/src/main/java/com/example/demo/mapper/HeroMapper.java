package com.example.demo.mapper;

import com.example.demo.domain.Hero;
import com.example.demo.model.HeroDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HeroMapper {
  Hero modelToDomain(HeroDto hero);
  HeroDto domainToModel(Hero hero);

  List<Hero> modelToDomain(List<HeroDto> heroDtos);
  List<HeroDto> domainToModel(List<Hero> heroes);

}
