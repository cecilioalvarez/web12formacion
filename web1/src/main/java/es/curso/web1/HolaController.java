package es.curso.web1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaController {

	@GetMapping("/hola")
	public String hola() {
		
		return "hola.xhtml";
	}
}
