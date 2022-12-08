package com.educacionIT.alumnosApi.models;

import javax.persistence.*;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "alumno")
public class Alumno {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
	
    @Column(name = "nombre")
    private String nombre;
 
    @Column(name = "apellido")
    private String apellido;
 
    @Column(name = "mail")
    private String mail;
 
    @Column(name = "password")
    private String password;
 
 
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

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}


 
}
