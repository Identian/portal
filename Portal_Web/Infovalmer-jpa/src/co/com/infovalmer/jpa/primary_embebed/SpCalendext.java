package co.com.infovalmer.jpa.primary_embebed;
//
import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_calendext database table.
 * 
 */
@Entity
@Table(name="sp_calendext")
@NamedQuery(name="SpCalendext.findAll", query="SELECT s FROM SpCalendext s")
public class SpCalendext implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private SpCalendextPK id; 
	
	public SpCalendext(){
	}

	public SpCalendextPK getId() {
		return id;
	}

	public void setId(SpCalendextPK id) {
		this.id = id;
	}

}