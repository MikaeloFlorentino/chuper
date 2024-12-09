package com.nariux.chuper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nariux.chuper.repository.ListasRepository;

@Service
public class ListasService {

    @Autowired
    ListasRepository listasRepository;
    
}
