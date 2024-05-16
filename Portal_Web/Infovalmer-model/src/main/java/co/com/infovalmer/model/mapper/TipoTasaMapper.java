package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.TipoTasaDto;

public class TipoTasaMapper implements RowMapper<TipoTasaDto>{

	public TipoTasaDto mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		TipoTasaDto tipoTasaDto = new TipoTasaDto();
		tipoTasaDto.setcTipotasa(rs.getString(1));
		tipoTasaDto.setiGrupotasa(rs.getByte(2));
		tipoTasaDto.setdFechaini(rs.getDate(3));
		tipoTasaDto.setdFechafin(rs.getDate(4));
		tipoTasaDto.setcPeriodmodali(rs.getString(5));
		tipoTasaDto.setcEquivalencia(rs.getString(6));
		tipoTasaDto.setcCtipo(rs.getString(7));
		tipoTasaDto.setiOperador(rs.getByte(8));
		tipoTasaDto.setiCodtiptasa(rs.getByte(9));
		tipoTasaDto.setcEstado(rs.getString(10));
		tipoTasaDto.setcVigencia(rs.getString(11));
		tipoTasaDto.setcCasoespecial(rs.getString(12));
		tipoTasaDto.setcDescripcion(rs.getString(13));
		tipoTasaDto.setcMuestraTasa(rs.getString(14));
		
		return tipoTasaDto;
	}
}
