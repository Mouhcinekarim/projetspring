package basic.Cntroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import basic.CouchDao.DeparDao;
import basic.module.Departement;
@RestController
@RequestMapping("departement")
public class DepartemtController {
	@Autowired()
	private  DeparDao daoDepar;
	
	@PostMapping("")
	Departement saveDepartement(@RequestBody()Departement departement) {
//	
		return daoDepar.save(departement);
	}
	
	
}
