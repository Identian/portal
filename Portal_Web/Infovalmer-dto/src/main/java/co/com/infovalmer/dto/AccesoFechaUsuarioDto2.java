package co.com.infovalmer.dto;

import java.io.Serializable;
import java.util.Date;

public class AccesoFechaUsuarioDto2  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8285971538953961033L;
	private int idUsuarioOpcion;
	private Date ultimaFecha;
	private int intentos;
	private int intentosMax;
	public int getIdUsuarioOpcion() {
		return idUsuarioOpcion;
	}
	public void setIdUsuarioOpcion(int idUsuarioOpcion) {
		this.idUsuarioOpcion = idUsuarioOpcion;
	}
	public Date getUltimaFecha() {
		return ultimaFecha;
	}
	public void setUltimaFecha(Date ultimaFecha) {
		this.ultimaFecha = ultimaFecha;
	}
	public int getIntentos() {
		return intentos;
	}
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	public int getIntentosMax() {
		return intentosMax;
	}
	public void setIntentosMax(int intentosMax) {
		this.intentosMax = intentosMax;
	}
	
	
}
