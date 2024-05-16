package co.com.infovalmer.dto;

import java.io.Serializable;
import java.util.Date;

public class AccesoFechaUsuarioDto  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5420974103678495353L;
	private int id;
	private int idUsuarioOpcion;
	private int ultimo_mes;
	private int ultimo_dia;
	
	private Date ultima_fecha;
	private int dias_permitidos;
	private int dia_contador;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUsuarioOpcion() {
		return idUsuarioOpcion;
	}
	public void setIdUsuarioOpcion(int idUsuarioOpcion) {
		this.idUsuarioOpcion = idUsuarioOpcion;
	}
	public int getUltimo_mes() {
		return ultimo_mes;
	}
	public void setUltimo_mes(int ultimo_mes) {
		this.ultimo_mes = ultimo_mes;
	}
	public int getUltimo_dia() {
		return ultimo_dia;
	}
	public void setUltimo_dia(int ultimo_dia) {
		this.ultimo_dia = ultimo_dia;
	}
	
		
	//Toca Borrarlo
	private Date fecha_permitida;
	private int dia_permitido;
	
	public Date getFecha_permitida() {
		return fecha_permitida;
	}
	public void setFecha_permitida(Date fecha_permitida) {
		this.fecha_permitida = fecha_permitida;
	}
	public int getDia_permitido() {
		return dia_permitido;
	}
	public void setDia_permitido(int dia_permitido) {
		this.dia_permitido = dia_permitido;
	}
	
	public Date getUltima_fecha() {
		return ultima_fecha;
	}
	public void setUltima_fecha(Date ultima_fecha) {
		this.ultima_fecha = ultima_fecha;
	}
	public int getDias_permitidos() {
		return dias_permitidos;
	}
	public void setDias_permitidos(int dias_permitidos) {
		this.dias_permitidos = dias_permitidos;
	}

	public int getDia_contador() {
		return dia_contador;
	}
	public void setDia_contador(int dia_contador) {
		this.dia_contador = dia_contador;
	}	

	

	@Override
	public String toString() {
		return "AccesoFechaUsuarioDto [idUsuarioOpcion=" + idUsuarioOpcion + ", ultima_fecha=" + ultima_fecha
				+ ", dias_permitidos=" + dias_permitidos + ", dia_contador=" + dia_contador + ", ultimo_mes="
				+ ultimo_mes + ", fecha_permitida=" + fecha_permitida + ", dia_permitido=" + dia_permitido + "]";
	}
	
	
	
	
}
