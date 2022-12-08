package com.educacionIT.alumnosApi.Dao.AlumnoRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educacionIT.alumnosApi.models.Alumno;



@Repository
public interface AlumnoRepository extends JpaRepository<Alumno,Integer>{

}
