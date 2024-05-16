package co.com.infovalmer.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_tmparchivo database table.
 * 
 */
@Entity
@Table(name="sp_tmparchivo")
@NamedQuery(name="SpTmparchivo.findAll", query="SELECT s FROM SpTmparchivo s")
public class SpTmparchivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_secuetmparchiv")
	private byte iSecuetmparchiv;

	@Column(name="c_lineatexto")
	private String cLineatexto;

	@Column(name="c_nombrearchivo")
	private String cNombrearchivo;

	@Column(name="c_patharchivo")
	private String cPatharchivo;

	public SpTmparchivo() {
	}

	public byte getISecuetmparchiv() {
		return this.iSecuetmparchiv;
	}

	public void setISecuetmparchiv(byte iSecuetmparchiv) {
		this.iSecuetmparchiv = iSecuetmparchiv;
	}

	public String getCLineatexto() {
		return this.cLineatexto;
	}

	public void setCLineatexto(String cLineatexto) {
		this.cLineatexto = cLineatexto;
	}

	public String getCNombrearchivo() {
		return this.cNombrearchivo;
	}

	public void setCNombrearchivo(String cNombrearchivo) {
		this.cNombrearchivo = cNombrearchivo;
	}

	public String getCPatharchivo() {
		return this.cPatharchivo;
	}

	public void setCPatharchivo(String cPatharchivo) {
		this.cPatharchivo = cPatharchivo;
	}

}