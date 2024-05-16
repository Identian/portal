package co.com.infovalmer.jpa.no_model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the sp_titulocalif database table.
 * 
 */
@Entity
@Table(name="sp_titulocalif")
@NamedQuery(name="SpTitulocalif.findAll", query="SELECT s FROM SpTitulocalif s")
public class SpTitulocalif implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Temporal(TemporalType.DATE)
	@Column(name="d_fecha")
	private Date dFecha;

	@Column(name="c_calificacp")
	private String cCalificacp;

	@Column(name="c_calificalp")
	private String cCalificalp;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;


	public SpTitulocalif() {
	}

	public String getCCalificacp() {
		return this.cCalificacp;
	}

	public void setCCalificacp(String cCalificacp) {
		this.cCalificacp = cCalificacp;
	}

	public String getCCalificalp() {
		return this.cCalificalp;
	}

	public void setCCalificalp(String cCalificalp) {
		this.cCalificalp = cCalificalp;
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public Date getDFecha() {
		return this.dFecha;
	}

	public void setDFecha(Date dFecha) {
		this.dFecha = dFecha;
	}

}