package com.example.demo.controller;

import com.example.demo.domain.Hero;
import com.example.demo.exception.HeroNotFoundException;
import com.example.demo.mapper.HeroMapper;
import com.example.demo.model.HeroDto;
import com.example.demo.repository.HeroesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/heroes")
public class HeroesController {

  private final HeroesRepository heroesRepository;

  private final HeroMapper heroMapper;

  public HeroesController(HeroesRepository heroesRepository, HeroMapper heroMapper) {
    this.heroesRepository = heroesRepository;
    this.heroMapper = heroMapper;
  }

  @GetMapping("/{id}")
  public HeroDto getHero(@PathVariable Long id) {
    return heroMapper.domainToModel(findHeroOrThrow(id));
  }

  @GetMapping()
  public List<HeroDto> getHero(@RequestParam(required = false) String name) {
    if (name == null || name.equals("")) {
      return heroMapper.domainToModel(heroesRepository.findAll());
    } else {
      return heroMapper.domainToModel(heroesRepository.findByName(name));
    }
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public HeroDto createHero(@RequestBody HeroDto heroDto) {
    Hero hero = heroMapper.modelToDomain(heroDto);
    hero = heroesRepository.save(hero);
    return heroMapper.domainToModel(hero);
  }

  @PutMapping
  @ResponseStatus(HttpStatus.ACCEPTED)
  public void updateHero(@RequestBody HeroDto heroDto) {
    Hero hero = findHeroOrThrow(heroDto.getId());
    hero.setName(heroDto.getName());
    heroesRepository.save(hero);
  }

  @DeleteMapping("/{id}")
  public void deleteHero(@PathVariable Long id) {
    Hero hero = findHeroOrThrow(id);
    heroesRepository.delete(hero);
  }

  private Hero findHeroOrThrow(Long id) {
    return heroesRepository.findById(id).orElseThrow(HeroNotFoundException::new);
  }
}
