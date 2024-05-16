package co.com.infovalmer.model.dao;

import java.util.Date;
import java.util.List;

import co.com.infovalmer.dto.CurvasDto;
import co.com.infovalmer.dto.PuntosCurvaDto;
import co.com.infovalmer.dto.TipoCurvaDto;

public interface CurvasDao {
	public List<TipoCurvaDto> listarTipoCurva() throws Exception;

	public List<PuntosCurvaDto> consultarPuntosCurvas(CurvasDto curvasDto)
			throws Exception;

	public Date ultimaFechaCurva() throws Exception;
	
	public void actulizarTipoCurva(TipoCurvaDto tipoCurvaDto) throws Exception;
	
	
}
