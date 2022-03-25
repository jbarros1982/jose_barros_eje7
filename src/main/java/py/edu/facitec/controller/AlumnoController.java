package py.edu.facitec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import py.edu.facitec.entidad.Alumno;
import py.edu.facitec.repository.AlumnoRepository;

@Controller
public class AlumnoController {
	

	@Autowired  //ANOTACION QUE INICIALIZA/IMPLEMENTA  
	private AlumnoRepository alumnoRepository; 
	
	@RequestMapping("/form")
	
	public String metodo() {
		
		System.out.println("Cargando pagina de alumno...");
		
		return "vista/alumno/formulario"; 
								
	}
	
	
	@RequestMapping(value ="/registrar", method = RequestMethod.POST) 
	

	
	public ModelAndView registrar(Alumno alumno) { 
		
	
		
		alumnoRepository.save(alumno);
		
	
		
		System.out.println("Registrado con éxito: "+alumno);
		
	
		
		return new ModelAndView("redirect:form");					   
		
	}

}
