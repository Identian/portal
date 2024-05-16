package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the vd_logoperinc database table.
 * 
 */
@Entity
@Table(name="vd_logoperinc")
@NamedQuery(name="VdLogoperinc.findAll", query="SELECT v FROM VdLogoperinc v")
public class VdLogoperinc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VdLogoperincPK id;

	@Lob
	@Column(name="c_causal")
	private byte[] cCausal;

	@Column(name="c_nemotecnico")
	private String cNemotecnico;

	@Column(name="c_usuario")
	private String cUsuario;

	@Column(name="dt_fechahoralog")
	private Timestamp dtFechahoralog;

	public VdLogoperinc() {
	}

	public VdLogoperincPK getId() {
		return this.id;
	}

	public void setId(VdLogoperincPK id) {
		this.id = id;
	}

	public byte[] getCCausal() {
		return this.cCausal;
	}

	public void setCCausal(byte[] cCausal) {
		this.cCausal = cCausal;
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getCUsuario() {
		return this.cUsuario;
	}

	public void setCUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}

	public Timestamp getDtFechahoralog() {
		return this.dtFechahoralog;
	}

	public void setDtFechahoralog(Timestamp dtFechahoralog) {
		this.dtFechahoralog = dtFechahoralog;
	}

}