package basic.module;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name="Departement")
@Data // getters et setterrs
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Departement implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private  Integer departementId;
  private String nom_departement;
  
  public Departement(String nom_departement) {
	super();
	this.nom_departement = nom_departement;
}

//@OneToMany(mappedBy="departement",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//  List<Professeur> listProf;
  
  
  
  
  
}
