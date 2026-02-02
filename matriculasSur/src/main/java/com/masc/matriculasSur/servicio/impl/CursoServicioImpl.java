package com.masc.matriculasSur.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.masc.matriculasSur.modelo.entidad.Curso;
import com.masc.matriculasSur.repositorio.ICursoRepositorio;
import com.masc.matriculasSur.servicio.ICursoServicio;

@Service
@Component
public class CursoServicioImpl implements ICursoServicio{
	
	@Autowired
	public ICursoRepositorio repositorioCurso;

	@Override
	public Curso insertarCurso(Curso nuevoCurso) {
		// TODO Auto-generated method stub
		return repositorioCurso.save(nuevoCurso);
	}

	@Override
	public Curso editarCurso(int idCurso) {
		// TODO Auto-generated method stub
		return repositorioCurso.findById(idCurso).get();
	}

	@Override
	public void eliminarCurso(int idCurso) {
		// TODO Auto-generated method stub
		repositorioCurso.delete(editarCurso(idCurso));
	}

	@Override
	public List<Curso> listarCurso() {
		// TODO Auto-generated method stub
		return repositorioCurso.findAll();
	}

}
