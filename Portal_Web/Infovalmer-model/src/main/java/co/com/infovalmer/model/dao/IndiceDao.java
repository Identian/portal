package co.com.infovalmer.model.dao;
import java.util.List;

import co.com.infovalmer.dto.IndiceDto;

public interface IndiceDao {

	public List<IndiceDto> listarIndices() throws Exception;
}
