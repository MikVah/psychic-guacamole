package fi.hh.swd20.ekahelloprojekti.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody				// Metodien paluuarvo lähetetään selaimeen sellaisenaan
public class HelloController {

	@RequestMapping("*")	//*-merkintä --> sallii kaikki päätteet
	
	public String sayHello() {
		return "Why hello!";
	}
	
	
	/*Suoritetaan http://localhost:8080/hello eli endpointilla "/hello" */
	@RequestMapping("/hello")
	public String sayHi() {
		
		return "Hello, how do you do!";
	}
	
	
	/* Suoritetaan pyynnöllä http://localhost/hello2?fname=Nimi&sname=sukunimi */
	
	@RequestMapping(value="/hello2", method = RequestMethod.GET)
	public String sayPersonHello(@RequestParam(name = "fname") String firstname, 
			@RequestParam(name = "sname") String surname) {
		
		return "Hello "+ firstname + " " + surname + "!";
		
	}
	
}
