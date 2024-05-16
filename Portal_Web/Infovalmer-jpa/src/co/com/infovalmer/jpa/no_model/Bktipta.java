package co.com.infovalmer.jpa.no_model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//import java.io.Serializable;
//import javax.persistence.*;
//import java.math.BigDecimal;
//import java.util.Date;
//
//
///**
// * The persistent class for the bktiptas database table.
// * 
// */
//@Entity
@Table(name="bktiptas")
@NamedQuery(name="Bktipta.findAll", query="SELECT b FROM Bktipta b")
public class Bktipta implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Temporal(TemporalType.DATE)
//	private Date fecha;
//
//	private String tasa;
//
//	private BigDecimal valor;
//
//	public Bktipta() {
//	}
//
//	public Date getFecha() {
//		return this.fecha;
//	}
//
//	public void setFecha(Date fecha) {
//		this.fecha = fecha;
//	}
//
//	public String getTasa() {
//		return this.tasa;
//	}
//
//	public void setTasa(String tasa) {
//		this.tasa = tasa;
//	}
//
//	public BigDecimal getValor() {
//		return this.valor;
//	}
//
//	public void setValor(BigDecimal valor) {
//		this.valor = valor;
//	}
//
}