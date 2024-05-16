package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_titulsaplicacr database table.
 * 
 */
@Entity
@Table(name="sp_titulsaplicacr")
@NamedQuery(name="SpTitulsaplicacr.findAll", query="SELECT s FROM SpTitulsaplicacr s")
public class SpTitulsaplicacr implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private SpTitulsaplicacrPK id;

	@Column(name="c_curcerocupon")
	private String cCurcerocupon;

	
	public SpTitulsaplicacr() {
	}

	public String getCCurcerocupon() {
		return this.cCurcerocupon;
	}

	public void setCCurcerocupon(String cCurcerocupon) {
		this.cCurcerocupon = cCurcerocupon;
	}

}