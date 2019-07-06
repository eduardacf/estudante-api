package com.target.studentAPI.application.service;

import com.target.studentAPI.application.dto.EstudanteMateriasDTO;
import com.target.studentAPI.dominio.model.Estudante;
import com.target.studentAPI.dominio.model.Materia;
import com.target.studentAPI.infra.repository.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudanteService {

    @Autowired
    EstudanteRepository EstudanteRepository;

    private String converteListaEmString(List<Materia> lista){
        StringBuilder str = new StringBuilder();
        for(Materia materia : lista){
            str.append(materia.getNome()).append(",");
        }
        return str.toString().substring( 0, str.length() - 1 );
    }
    public EstudanteMateriasDTO getEstudanteById(Integer id) {
        Estudante estudante = EstudanteRepository.findById(id).get();
        return new EstudanteMateriasDTO(estudante.getNome(),
                estudante.getMatricula(),
                estudante.getIdade(),
                estudante.getTurma(),
                converteListaEmString(estudante.getMateria()),
                estudante.getId()
        );
    }
}
