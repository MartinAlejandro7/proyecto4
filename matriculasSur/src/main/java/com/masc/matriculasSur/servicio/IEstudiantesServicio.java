package com.masc.matriculasSur.servicio;

import java.util.List;

import com.masc.matriculasSur.modelo.entidad.Estudiantes;

public interface IEstudiantesServicio {

	public Estudiantes insertarEstudiantes(Estudiantes nuevoEstudiante);
	public Estudiantes editarEstudiantes(int idEstudiante);
	public void eliminarEstudiantes(int idEstudiante);
	public List<Estudiantes> listarEstudiante();
}
