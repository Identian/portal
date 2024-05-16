package co.com.infovalmer.dto;

import java.io.Serializable;
import java.util.Date;

public class TipoMonedaDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String cTipomoneda;

	private int iGrupomoneda;

	private String cCasoespecial;

	private String cDescripcion;

	private String cEstado;

	private String cNombre;

	private String cVigencia;

	private Date dFechafin;

	private Date dFechaini;
	
	private String cMuestramoneda;

	public String getcTipomoneda() {
		return cTipomoneda;
	}

	public void setcTipomoneda(String cTipomoneda) {
		this.cTipomoneda = cTipomoneda;
	}

	public String getcCasoespecial() {
		return cCasoespecial;
	}

	public void setcCasoespecial(String cCasoespecial) {
		this.cCasoespecial = cCasoespecial;
	}

	public String getcDescripcion() {
		return cDescripcion;
	}

	public void setcDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getcEstado() {
		return cEstado;
	}

	public void setcEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getcNombre() {
		return cNombre;
	}

	public void setcNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getcVigencia() {
		return cVigencia;
	}

	public void setcVigencia(String cVigencia) {
		this.cVigencia = cVigencia;
	}

	public Date getdFechafin() {
		return dFechafin;
	}

	public void setdFechafin(Date dFechafin) {
		this.dFechafin = dFechafin;
	}

	public Date getdFechaini() {
		return dFechaini;
	}

	public void setdFechaini(Date dFechaini) {
		this.dFechaini = dFechaini;
	}

	public int getiGrupomoneda() {
		return iGrupomoneda;
	}

	public void setiGrupomoneda(int iGrupomoneda) {
		this.iGrupomoneda = iGrupomoneda;
	}

	public String getcMuestramoneda() {
		return cMuestramoneda;
	}

	public void setcMuestramoneda(String cMuestramoneda) {
		this.cMuestramoneda = cMuestramoneda;
	}
	
	

}
