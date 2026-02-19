package com.lynda.reglegestion.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lynda.reglegestion.entitees.ParametreRegle;

public interface ParametreRegleRepository extends JpaRepository<ParametreRegle, Integer>{
	Optional<ParametreRegle> findByNomRegle(String nomRegle);
	List<ParametreRegle> findAll();
}


