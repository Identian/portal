package co.com.infovalmer.model.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.BetaDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.BetaDao;
import co.com.infovalmer.model.mapper.BetaMapper;

public class BetaImpl extends ConnectionConfig implements BetaDao {

	JdbcTemplate jdbcTemplateObject;
	
	public BetaImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}
	
	public List<BetaDto> consultaHistoricoBeta(String curva, Date Fechaini, Date Fechafin) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT * FROM sp_betas ");
		sql.append("WHERE c_curcerocupon = ? ");
		sql.append("AND d_fecha BETWEEN ? AND ? ");
		Object [] parameters = new Object[] { curva, Fechaini, Fechafin };
		List<BetaDto> Betalist = this.jdbcTemplateObject.query(sql.toString(),parameters,new BetaMapper());

		return Betalist;

	}

}
