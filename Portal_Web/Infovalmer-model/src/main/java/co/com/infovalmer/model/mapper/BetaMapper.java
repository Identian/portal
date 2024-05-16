package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.BetaDto;

public class BetaMapper implements RowMapper<BetaDto>{

	public BetaDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		BetaDto beta = new BetaDto();
		beta.setC_curcerocupon(rs.getString(1));
		beta.setD_fecha(rs.getDate(2));
		beta.setCNomindicador(rs.getString(3));
		beta.setEBeta0(rs.getBigDecimal(4));
		beta.setEBeta1(rs.getBigDecimal(5));
		beta.setEBeta2(rs.getBigDecimal(6));
		beta.setEBeta3(rs.getBigDecimal(7));
		beta.setCMuestraalterna(rs.getString(8));
		return beta;		
		
	}

}
