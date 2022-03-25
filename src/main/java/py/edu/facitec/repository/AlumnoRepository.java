package py.edu.facitec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.facitec.entidad.Alumno;

//PARA CAMBIAR DE SuscritoRepository PARA AlumnoRepository DAMOS
//UN REFACTOR SOBRE EL MISMO Y DESPUES RENAME

public interface AlumnoRepository extends JpaRepository<Alumno, Integer> { //CLASE --> "Alumno" y 
																			//TIPO DE DATO DE Codigo --> "Integer"

}
 