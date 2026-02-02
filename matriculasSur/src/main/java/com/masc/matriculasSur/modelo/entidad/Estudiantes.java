package com.masc.matriculasSur.modelo.entidad;
import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Estudiantes implements Serializable{
	private static final long serialVersionUID = 1l;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private int idEstudiantes;
	private String nombreEstudiantes;
	private String apellidoEstudiantes;
	private String emailEstudiantes;
	private String direccionEstudiantes;
	private String estadoEstudiantes; //A activo I inavctivo
	

}
