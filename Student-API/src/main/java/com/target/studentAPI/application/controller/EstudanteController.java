package com.target.studentAPI.application.controller;

import com.target.studentAPI.application.service.EstudanteService;
import com.target.studentAPI.dominio.model.Estudante;
import com.target.studentAPI.infra.repository.EstudanteRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

@Api(value = "EstudanteController", description = "Essa controladora faz operação do Estudante!!")
@RestController
public class EstudanteController {

  @Autowired
  EstudanteService estudanteService;

  @Autowired
  EstudanteRepository
        cargaInicialEstudante.popularEstudantes();

}
