package co.com.infovalmer.dto;
import java.io.Serializable;
import java.util.Date;

public class CurvasDto implements Serializable {

	private static final long serialVersionUID = 4873535656836097809L;

	public CurvasDto() {
	}

	private Date fechaInicial;
	private Date fechaFinal;
	private TipoCurvaDto insumo;

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public TipoCurvaDto getInsumo() {
		return insumo;
	}

	public void setInsumo(TipoCurvaDto insumo) {
		this.insumo = insumo;
	}

	@Override
	public String toString() {
		return "CurvasDto [fechaInicial=" + fechaInicial + ", fechaFinal="
				+ fechaFinal + ", insumo=" + insumo + "]";
	}
	
}
