package basic.module;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Professeur")
@Data 
@AllArgsConstructor
@NoArgsConstructor
public class Professeur implements Serializable{
	
	@Id()
	@GeneratedValue(strategy=GenerationType.AUTO)
     private Integer profId;
     private String nom;
     private String prenom;
     private String email;
     private String password;
     
     public Professeur(String nom, String prenom, String password,Departement departement,String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.email=email;
		this.departement = departement;
	}
	@OneToMany(mappedBy="prof",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
     private List<PfeInfo> listPFE;
 	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
 	Departement departement;
 	
}
