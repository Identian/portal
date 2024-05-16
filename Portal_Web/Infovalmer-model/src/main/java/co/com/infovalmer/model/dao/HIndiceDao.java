package co.com.infovalmer.model.dao;
import java.util.List;

import co.com.infovalmer.dto.HIndiceDto;
import co.com.infovalmer.dto.vistas.HistoricoIndicesVista;

public interface HIndiceDao {

public List<HIndiceDto> consultarHisotoricoIndices(HistoricoIndicesVista historicoIndicesVista) throws Exception;
}
