package basic.module;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name="PfeFichier")
@Data // getters et setterrs
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PfeFichier implements Serializable{
	
	@Id()
	@GeneratedValue(strategy=GenerationType.AUTO)
  private Integer pfeFichierId;
  
  private byte[] photo;
  
  private byte[] rapport;
  
  @OneToOne
  PfeInfo pfeinfo;
  
}
