package com.educacionIT.alumnosApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educacionIT.alumnosApi.DTO.RequestAlumnoDTO;
import com.educacionIT.alumnosApi.models.Alumno;
import com.educacionIT.alumnosApi.service.AlumnoService;

@RestController
@RequestMapping("/alumnoapi")
@CrossOrigin(origins="*", allowedHeaders = "*")
public class AlumnoController {
	
	@Autowired
	private AlumnoService service;
	
	@PostMapping("/")
	//@ApiOperation(value = "crear alumnos")
	public ResponseEntity<?> altaAlumno(@RequestBody RequestAlumnoDTO alumno){
		this.service.altaAlumno(alumno);
		return ResponseEntity.ok("created");
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getAlumnos(){	
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getAlumnosID(@PathVariable("id") Integer id){	
		return ResponseEntity.ok(this.service.getAlumno(id));
	}
	
}
