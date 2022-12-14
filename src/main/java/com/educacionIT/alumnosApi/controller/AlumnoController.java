package com.educacionIT.alumnosApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.educacionIT.alumnosApi.DTO.RequestAlumnoDTO;
import com.educacionIT.alumnosApi.models.Alumno;
import com.educacionIT.alumnosApi.service.AlumnoService;

@RestController
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;

	@PostMapping("/alta")
	//@ApiOperation(value = "crear alumnos")
	public ResponseEntity<?> altaAlumno(@RequestBody RequestAlumnoDTO alumno){
	    this.alumnoService.altaAlumno(alumno);
		return ResponseEntity.ok("create");
	}
	
	//consulta de alumno por id
	
	//consulta de todos alumnos
	
	//modificacion de alumnos
	
	// delete alumnos
	
	//consulta por apellido de alumno
	
	//alumno domicilio va a ser uan entidad realcionada alumno  
}
