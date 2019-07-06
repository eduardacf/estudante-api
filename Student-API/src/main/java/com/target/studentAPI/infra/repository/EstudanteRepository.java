package com.target.studentAPI.infra.repository;

import com.target.studentAPI.dominio.model.Estudante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EstudanteRepository extends CrudRepository<Estudante, Integer> {


    List<Estudante> findByNome(String nome);

    List<Estudante> findById(String id);


}
