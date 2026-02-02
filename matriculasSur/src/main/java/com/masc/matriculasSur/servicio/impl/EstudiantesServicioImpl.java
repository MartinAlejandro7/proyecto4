package com.masc.matriculasSur.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.masc.matriculasSur.modelo.entidad.Estudiantes;
import com.masc.matriculasSur.repositorio.IEstudiantesRepositorio;
import com.masc.matriculasSur.servicio.IEstudiantesServicio;


@Service
@Component
public class EstudiantesServicioImpl implements IEstudiantesServicio {
	
	@Autowired
	public IEstudiantesRepositorio repositorioEstudiantes;

	@Override
	public Estudiantes insertarEstudiantes(Estudiantes nuevoEstudiante) {
		// TODO Auto-generated method stub
		return repositorioEstudiantes.save(nuevoEstudiante);
	}

	@Override
	public Estudiantes editarEstudiantes(int idEstudiante) {
		// TODO Auto-generated method stub
		return repositorioEstudiantes.findById(idEstudiante).get();
	}

	@Override
	public void eliminarEstudiantes(int idEstudiante) {
		// TODO Auto-generated method stub
		repositorioEstudiantes.delete(editarEstudiantes(idEstudiante));
	}

	@Override
	public List<Estudiantes> listarEstudiante() {
		// TODO Auto-generated method stub
		return repositorioEstudiantes.findAll();
	}

}
