package basic.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import basic.CouchDao.PfeFichierDao;
import basic.CouchDao.PfeInfoDao;
import basic.CouchDao.ProfDao;
import basic.Dto.RequestPfeDto;
import basic.Dto.ResponsePfeDto;
import basic.module.PfeFichier;
import basic.module.PfeInfo;
import basic.module.Professeur;

@Service
public class ServicePFE {
	@Autowired
	PfeInfoDao pfeDao;
	@Autowired
	PfeFichierDao daofichier;
	@Autowired
	ProfDao profdao;
	@Autowired
    ModelMapper modelMapper;
	
	ResponsePfeDto  Ajouter(RequestPfeDto  pfetdo){
		Professeur prof =profdao.findById(pfetdo.getIdProf()).get();
		PfeFichier fichiers=modelMapper.map(pfetdo, PfeFichier.class);
		PfeInfo    pfeinfo=modelMapper.map(pfetdo, PfeInfo.class);
		
		pfeinfo.setProf(prof);
		pfeinfo.setFichier(fichiers);
		PfeInfo saved =pfeDao.save(pfeinfo);
		
		ResponsePfeDto respo= modelMapper.map(saved, ResponsePfeDto.class);
		 return respo;
		
	}
	
	
	
	
}
