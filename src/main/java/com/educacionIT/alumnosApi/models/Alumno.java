package com.educacionIT.alumnosApi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Alumno {
	
 private String nombre;
 
 private String apellido;
 
 private String mail;
 
 private String password;
 
 private long id;

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}
 
}
