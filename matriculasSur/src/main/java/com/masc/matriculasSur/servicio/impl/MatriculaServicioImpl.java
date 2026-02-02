package com.masc.matriculasSur.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.masc.matriculasSur.modelo.entidad.Matricula;
import com.masc.matriculasSur.repositorio.IMatriculaRepositorio;
import com.masc.matriculasSur.servicio.IMatriculaServicio;

@Service
@Component
public class MatriculaServicioImpl implements IMatriculaServicio{
	
	@Autowired
	public IMatriculaRepositorio repositorioMatricula;

	@Override
	public Matricula insertarEstudiantes(Matricula nuevoMatricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Matricula editarEstudiantes(int idMatricula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarMatricula(int idMatricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Matricula> listarMatricula() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
