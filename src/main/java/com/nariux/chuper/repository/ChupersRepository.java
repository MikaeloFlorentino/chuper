package com.nariux.chuper.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nariux.chuper.entity.Chuper;

public interface ChupersRepository extends JpaRepository<Chuper, Integer>{
    

}
