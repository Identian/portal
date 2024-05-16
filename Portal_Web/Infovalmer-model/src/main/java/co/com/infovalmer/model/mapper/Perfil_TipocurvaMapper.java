package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.Perfil_TipocurvaDto;

public class Perfil_TipocurvaMapper implements RowMapper<Perfil_TipocurvaDto>{

	public Perfil_TipocurvaDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		Perfil_TipocurvaDto perfil_TipoCurva = new Perfil_TipocurvaDto();
		perfil_TipoCurva.setI_perfil_tipocurva(rs.getInt(1));
		perfil_TipoCurva.setI_perfil(rs.getInt(2));
		perfil_TipoCurva.setI_tipocurva(rs.getInt(3));
		return perfil_TipoCurva;
	}

	
}
