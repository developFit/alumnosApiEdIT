package com.educacionIT.alumnosApi.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RequestAlumnoDTO {

	 private String nombre;
	 
	 private String apellido;
	 
	 private String mail;
	 
	 private String password;
}
