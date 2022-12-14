package com.educacionIT.alumnosApi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.educacionIT.alumnosApi.DTO.RequestAlumnoDTO;
import com.educacionIT.alumnosApi.models.Alumno;

@RestController
public class AlumnoController {

	@PostMapping("/alta")
	//@ApiOperation(value = "crear alumnos")
	public ResponseEntity<?> altaAlumno(@RequestBody RequestAlumnoDTO alumno){
	
		return ResponseEntity.ok("created");
	}
}
