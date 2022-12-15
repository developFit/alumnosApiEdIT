package com.educacionIT.alumnosApi.service;
import com.educacionIT.alumnosApi.models.Alumno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educacionIT.alumnosApi.DTO.RequestAlumnoDTO;
import com.educacionIT.alumnosApi.Dao.AlumnoRepository.AlumnoRepository;
import com.educacionIT.alumnosApi.models.Alumno;

@Service
public class AlumnoService {
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	public void altaAlumno(RequestAlumnoDTO alumno) {
		Alumno alumnoNuevo = new Alumno();
		
		alumnoNuevo.setApellido(alumno.getApellido());
		alumnoNuevo.setNombre(alumno.getNombre());
		alumnoNuevo.setPassword(alumno.getPassword());
		alumnoNuevo.setMail(alumno.getMail());
		
		this.alumnoRepository.save(alumnoNuevo);
	}
	
	public List<Alumno> getAll(){
		return this.alumnoRepository.findAll();
	}
	
	public Alumno getAlumno(Integer id) {
		return this.alumnoRepository.findById(id).get();
	}
	
	//consulta de alumno por id
	
	//consulta de todos alumnos
		
	//modificacion de alumnos
		
	// delete alumnos
		
	//consulta por apellido de alumno
		
	//alumno domicilio va a ser uan entidad realcionada alumno

	
}
