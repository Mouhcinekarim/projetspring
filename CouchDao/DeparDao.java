package basic.CouchDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import basic.module.Departement;


@Repository
public interface DeparDao extends JpaRepository<Departement,Integer>{

}
