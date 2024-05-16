package co.com.infovalmer.model.dao;
import java.util.Date;
import java.util.List;

import co.com.infovalmer.dto.BetaDto;;

public interface BetaDao {

	List<BetaDto> consultaHistoricoBeta(String curva, Date Fechaini, Date Fechafin) throws Exception; 
	
}
