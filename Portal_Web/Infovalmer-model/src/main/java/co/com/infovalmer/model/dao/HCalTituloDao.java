package co.com.infovalmer.model.dao;
import java.util.List;

import co.com.infovalmer.dto.HcaltituloDto;

public interface HCalTituloDao {

public List<HcaltituloDto> consultarCalificacionTitulo(String nemotecnico) throws Exception;
}
