package com.nariux.chuper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nariux.chuper.service.SolicitudesService;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudesController {

    @Autowired
    SolicitudesService solicitudesService;
}
