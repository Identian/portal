package co.com.infovalmer.model.dao;
import java.util.List;

import co.com.infovalmer.dto.NemoIsinDto;

public interface NemoIsinDao {

public List<NemoIsinDto> consultarIsines(String cEmisor,String eTasa,String cNemotecnico) throws Exception;

}
