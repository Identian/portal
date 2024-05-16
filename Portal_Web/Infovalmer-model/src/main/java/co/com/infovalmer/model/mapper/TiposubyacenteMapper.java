package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.TiposubyacenteDto;

public class TiposubyacenteMapper implements RowMapper<TiposubyacenteDto>{
	public TiposubyacenteDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		TiposubyacenteDto tipoSubyacente = new TiposubyacenteDto();
		tipoSubyacente.setCNemosubyacente(rs.getString(1));
		tipoSubyacente.setCNombre(rs.getString(2));
		tipoSubyacente.setIGruposubyacente(rs.getInt(3));
		tipoSubyacente.setILastingdate(rs.getInt(4));
		return tipoSubyacente;
	}
}
