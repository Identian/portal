package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_catfaq database table.
 * 
 */
@Entity
@Table(name="sp_catfaq")
@NamedQuery(name="SpCatfaq.findAll", query="SELECT s FROM SpCatfaq s")
public class SpCatfaq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_categfaq")
	private byte iCategfaq;

	@Column(name="c_nombrecategfaq")
	private String cNombrecategfaq;

	public SpCatfaq() {
	}

	public byte getICategfaq() {
		return this.iCategfaq;
	}

	public void setICategfaq(byte iCategfaq) {
		this.iCategfaq = iCategfaq;
	}

	public String getCNombrecategfaq() {
		return this.cNombrecategfaq;
	}

	public void setCNombrecategfaq(String cNombrecategfaq) {
		this.cNombrecategfaq = cNombrecategfaq;
	}

}