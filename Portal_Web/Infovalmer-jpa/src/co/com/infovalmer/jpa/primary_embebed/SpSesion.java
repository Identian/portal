package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the sp_sesion database table.
 * 
 */
@Entity
@Table(name = "sp_sesion")
@NamedQuery(name = "SpSesion.findAll", query = "SELECT s FROM SpSesion s")
public class SpSesion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SpSesionPK id;

	@Column(name = "c_sesion")
	private String cSesion;

	@Column(name = "i_diascumpliento")
	private int iDiascumpliento;

	@Column(name = "i_sube")
	private int iSube;

	public SpSesion() {
	}

	public String getCSesion() {
		return this.cSesion;
	}

	public void setCSesion(String cSesion) {
		this.cSesion = cSesion;
	}

	public int getIDiascumpliento() {
		return this.iDiascumpliento;
	}

	public void setIDiascumpliento(int iDiascumpliento) {
		this.iDiascumpliento = iDiascumpliento;
	}

	public int getISube() {
		return this.iSube;
	}

	public void setISube(int iSube) {
		this.iSube = iSube;
	}

	public SpSesionPK getId() {
		return id;
	}

	public void setId(SpSesionPK id) {
		this.id = id;
	}

}