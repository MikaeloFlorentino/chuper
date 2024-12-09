package com.nariux.chuper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nariux.chuper.service.ListasService;

@RestController
@RequestMapping("/listas")
public class ListasController {

    @Autowired
    ListasService listasService;
}
