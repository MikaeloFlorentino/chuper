package com.nariux.chuper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nariux.chuper.repository.MiembrosRepository;

@Service
public class MiembrosService {

    @Autowired
    MiembrosRepository miembrosRepository;
}
