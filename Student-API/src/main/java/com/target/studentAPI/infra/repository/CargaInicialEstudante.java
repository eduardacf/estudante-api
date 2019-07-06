package com.target.studentAPI.infra.repository;

import com.target.studentAPI.dominio.model.Estudante;
import com.target.studentAPI.dominio.model.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.asList;

@Service
public class CargaInicialEstudante {

    @Autowired
    EstudanteRepository estudanteRepository;

    public void popularEstudantes() {

        if(!existEstudante()){
            //aluno1
            List<Materia> materias = asList(
                    new Materia("Geografia"),
                    new Materia("Matematica"),
                    new Materia("Portugues")
            );

            Estudante estudante = new Estudante("Eduarda", 123, 18, 200);
            estudante.setMateria(materias);

            estudanteRepository.save(estudante);

            //aluno2
            List<Materia> materias1 = asList(
                    new Materia("Geografia"),
                    new Materia("Matematica"),
                    new Materia("Portugues"),
                    new Materia("Filosofia")

            );

            Estudante estudante1 = new Estudante("Logan", 1234, 1234, 201);
            estudante1.setMateria(materias);
            estudanteRepository.save(estudante1);

            //aluno3

            List<Materia> materias2 = asList(
                    new Materia("Geografia"),
                    new Materia("Matematica"),
                    new Materia("Portugues"),
                    new Materia("Filosofia"),
                    new Materia("Artes")

            );

            Estudante estudante2 = new Estudante("Gabriel", 3, 12345, 202);
            estudante2.setMateria(materias);
            estudanteRepository.save(estudante2);

        }
    }

    private boolean existEstudante() {
        return ((List<Estudante>) estudanteRepository.findAll()).size() <= 0;
    }
}
