package co.com.infovalmer.jpa;
//
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.Column;
import javax.persistence.Lob;
import java.math.BigDecimal;
//
//
///**
// * The persistent class for the sp_impugnamargen database table.
// * 
// */
@Entity
@Table(name="sp_impugnamargen")
@NamedQuery(name="SpImpugnamargen.findAll", query="SELECT s FROM SpImpugnamargen s")
public class SpImpugnamargen implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="i_impugnacion")
	private int iImpugnacion;
	
	@Column(name="c_nemotecnico")
	private String cNemotecnico;
	

	@Column(name="c_isin")
	private String cIsin;
	
	@Column(name="c_tasaref")
	private String cTasaref;

	@Column(name="c_tipomoneda")
	private String cTipomoneda;
	
	@Column(name="i_rangvencimi")
	private int iRangvencimi;
	
	@Lob
	@Column(name="c_descripcion")
	private String cDescripcion;
	
	@Lob
	@Column(name="c_razon")
	private String cRazon;

	@Lob
	@Column(name="c_respuesta")
	private String cRespuesta;

	@Column(name="e_valorimpugnado")
	private BigDecimal eValorimpugnado;

	@Column(name="e_valornuevo")
	private BigDecimal eValornuevo;

	public SpImpugnamargen() {
	}

	public String getCDescripcion() {
		return this.cDescripcion;
	}

	public void setCDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}

	public String getCIsin() {
		return this.cIsin;
	}

	public void setCIsin(String cIsin) {
		this.cIsin = cIsin;
	}

	public String getCNemotecnico() {
		return this.cNemotecnico;
	}

	public void setCNemotecnico(String cNemotecnico) {
		this.cNemotecnico = cNemotecnico;
	}

	public String getCRazon() {
		return this.cRazon;
	}

	public void setCRazon(String cRazon) {
		this.cRazon = cRazon;
	}

	public String getCRespuesta() {
		return this.cRespuesta;
	}

	public void setCRespuesta(String cRespuesta) {
		this.cRespuesta = cRespuesta;
	}

	public String getCTasaref() {
		return this.cTasaref;
	}

	public void setCTasaref(String cTasaref) {
		this.cTasaref = cTasaref;
	}

	public String getCTipomoneda() {
		return this.cTipomoneda;
	}

	public void setCTipomoneda(String cTipomoneda) {
		this.cTipomoneda = cTipomoneda;
	}

	public BigDecimal getEValorimpugnado() {
		return this.eValorimpugnado;
	}

	public void setEValorimpugnado(BigDecimal eValorimpugnado) {
		this.eValorimpugnado = eValorimpugnado;
	}

	public BigDecimal getEValornuevo() {
		return this.eValornuevo;
	}

	public void setEValornuevo(BigDecimal eValornuevo) {
		this.eValornuevo = eValornuevo;
	}

	public int getIImpugnacion() {
		return this.iImpugnacion;
	}

	public void setIImpugnacion(int iImpugnacion) {
		this.iImpugnacion = iImpugnacion;
	}

	public int getIRangvencimi() {
		return this.iRangvencimi;
	}

	public void setIRangvencimi(int iRangvencimi) {
		this.iRangvencimi = iRangvencimi;
	}

}