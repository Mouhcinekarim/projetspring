package basic.Dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class ProfDto {
	 private String nom;
     private String prenom;
     private String email;
     private String password;
     private Integer departementId;
	public ProfDto(String nom, String prenom, String email, String password, Integer departementId) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.departementId = departementId;
	}
     
}
