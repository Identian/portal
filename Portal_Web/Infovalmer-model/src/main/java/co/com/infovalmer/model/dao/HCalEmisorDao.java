package co.com.infovalmer.model.dao;
import java.util.List;

import co.com.infovalmer.dto.HcalemisorDto;

public interface HCalEmisorDao {

public List<HcalemisorDto> consultarCalificacionEmisor(String emisor) throws Exception;
}
