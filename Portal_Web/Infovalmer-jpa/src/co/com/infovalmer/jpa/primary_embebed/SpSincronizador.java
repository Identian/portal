package co.com.infovalmer.jpa.primary_embebed;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sp_sincronizador database table.
 * 
 */
@Entity
@Table(name="sp_sincronizador")
@NamedQuery(name="SpSincronizador.findAll", query="SELECT s FROM SpSincronizador s")
public class SpSincronizador implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="i_sincronizador")
	private int iSincronizador;

	@Column(name="c_database")
	private String cDatabase;

	@Column(name="c_nombre")
	private String cNombre;

	@Column(name="c_password")
	private String cPassword;

	@Column(name="c_tabla")
	private String cTabla;

	@Column(name="c_usuario")
	private String cUsuario;

	public SpSincronizador() {
	}

	public String getCDatabase() {
		return this.cDatabase;
	}

	public void setCDatabase(String cDatabase) {
		this.cDatabase = cDatabase;
	}

	public String getCNombre() {
		return this.cNombre;
	}

	public void setCNombre(String cNombre) {
		this.cNombre = cNombre;
	}

	public String getCPassword() {
		return this.cPassword;
	}

	public void setCPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	public String getCTabla() {
		return this.cTabla;
	}

	public void setCTabla(String cTabla) {
		this.cTabla = cTabla;
	}

	public String getCUsuario() {
		return this.cUsuario;
	}

	public void setCUsuario(String cUsuario) {
		this.cUsuario = cUsuario;
	}

	public int getISincronizador() {
		return this.iSincronizador;
	}

	public void setISincronizador(int iSincronizador) {
		this.iSincronizador = iSincronizador;
	}

}