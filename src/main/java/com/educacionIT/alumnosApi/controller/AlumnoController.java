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
	public ResponseEntity<Alumno> altaAlumno(@RequestBody RequestAlumnoDTO alumno){
		Alumno a1 = new Alumno();
		a1.setNombre("Juan");
		a1.setApellido("Perez");
		a1.setMail("juanparez@gmail.com");
		a1.setPassword("asas");
		return ResponseEntity.ok(a1);
	}
}
