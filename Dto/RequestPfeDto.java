package basic.Dto;

import javax.persistence.Lob;

import lombok.Data;
@Data
public class RequestPfeDto {
	   private Integer idProf;
	
	   private String title;
	   
	   private String niveau;
	   
	   @Lob
	   private String description;
	   
	   private int annee;
	   
	   private boolean isString;
	   
	   private byte[] photo;
	   
	   private byte[] rapport;
}
