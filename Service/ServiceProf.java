package basic.Service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import basic.CouchDao.DeparDao;
import basic.CouchDao.ProfDao;
import basic.Dto.ProfDto;
import basic.module.Departement;
import basic.module.Professeur;
 @Service()
public class ServiceProf {
	@Autowired
	DeparDao deparDao;
	@Autowired
	ProfDao profDao;
	@Autowired
    ModelMapper modelMapper;
    public Professeur save(ProfDto prof) {
    	Optional<Departement> Odepartemnt= deparDao.findById(prof.getDepartementId());
    	Departement departemnt;
    	Professeur prof1= modelMapper.map(prof, Professeur.class);	
    	
    	 departemnt=Odepartemnt.get();
    	
    	prof1.setDepartement(departemnt);
    	
    	
    	return profDao.save(prof1);
    	
    }
    
}
