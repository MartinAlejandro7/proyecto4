package com.masc.matriculasSur.servicio;

import java.util.List;

import com.masc.matriculasSur.modelo.entidad.Matricula;

public interface IMatriculaServicio {

	public Matricula insertarEstudiantes(Matricula nuevoMatricula);
	public Matricula editarEstudiantes(int idMatricula);
	public void eliminarMatricula(int idMatricula);
	public List<Matricula> listarMatricula();
}
