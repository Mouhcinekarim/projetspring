package basic.CouchDao;

import org.springframework.data.jpa.repository.JpaRepository;

import basic.module.Departement;
import basic.module.Professeur;

public interface ProfDao extends JpaRepository<Professeur,Integer>{
	

}
