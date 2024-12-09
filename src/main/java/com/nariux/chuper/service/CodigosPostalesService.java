package com.nariux.chuper.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nariux.chuper.repository.CodigosPostalesRepository;

@Service
public class CodigosPostalesService {
    
    @Autowired
    CodigosPostalesRepository codigosPostalesRepository;

}
