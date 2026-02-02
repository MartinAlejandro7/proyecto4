package com.masc.matriculasSur.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.masc.matriculasSur.modelo.entidad.Curso;

@Repository
@Service
public interface ICursoRepositorio extends JpaRepository<Curso, Integer>{
}
