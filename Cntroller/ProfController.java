package basic.Cntroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import basic.Dto.ProfDto;
import basic.Service.ServiceProf;
import basic.module.Professeur;
@RestController
@RequestMapping("Professeur")
public class ProfController {
	@Autowired()
	ServiceProf serviceprof;
	
	@PostMapping("")
	Professeur Add(@RequestBody()ProfDto prof ) {
		System.out.println(prof.toString());
		return serviceprof.save(prof);
		
	}
}
