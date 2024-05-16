package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.HcalemisorDto;
import co.com.infovalmer.dto.enums.TipoPlazoEnum;

public class HCalEmisorMapper implements RowMapper<HcalemisorDto> {
	StringBuilder sql = new StringBuilder();

	public HcalemisorDto mapRow(ResultSet rs, int arg1) throws SQLException{
		HcalemisorDto hcalemisorDto = new HcalemisorDto();
		hcalemisorDto.setdFechaasignada(rs.getDate(1));
		hcalemisorDto.setcEmisor(rs.getString(2));
		hcalemisorDto.setiTipcalificaci(rs.getInt(3));
		hcalemisorDto.setcCalificacion(rs.getString(4));
		hcalemisorDto.setdFechaini(rs.getDate(5));
		hcalemisorDto.setdFechafin(rs.getDate(6));
		hcalemisorDto.setcVigente(rs.getString(7));
		hcalemisorDto.setiTipoplazo(rs.getInt(8));
		if(hcalemisorDto.getiTipoplazo() == 1){
			hcalemisorDto.setEtiquetaPlazo(TipoPlazoEnum.CORTO_PLAZO.getValor());
		}else{
			hcalemisorDto.setEtiquetaPlazo(TipoPlazoEnum.LARGO_PLAZO.getValor());
		}
		hcalemisorDto.setiCalificadora(rs.getInt(9));
		hcalemisorDto.setNombreCalificadora(rs.getString(10));
		
		return hcalemisorDto;
}

}
