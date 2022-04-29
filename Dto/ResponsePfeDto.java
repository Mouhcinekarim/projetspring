package basic.Dto;

import javax.persistence.Lob;

public class ResponsePfeDto {
	   private String title;
	   
	   private String niveau;
	   @Lob
	   private String description;
	   
	   private int annee;
	   
       private boolean isString;
	   
	   private byte[] photo;
	   
	   private byte[] rapport;
	   
	   private String nom_departement;
	   
	   private String nom;
	   
	   private String prenom;
	   
	   private String email;
	   
	   
	   
}
