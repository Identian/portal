package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.CurvaCeroCuponDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.CurvaCeroCuponDao;
import co.com.infovalmer.model.mapper.CurvaCeroCuponMapper;

public class CurvaCeroCuponImpl extends ConnectionConfig implements CurvaCeroCuponDao {
	
	JdbcTemplate jdbcTemplateObject;
	
	public CurvaCeroCuponImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}

	public List<CurvaCeroCuponDto> consultaCurvaCeroCupon() throws Exception {
		StringBuilder sql = new StringBuilder();
		List<CurvaCeroCuponDto> listaCurvaCeroCupon = null;
		sql.append(" SELECT ");
		sql.append(" c_curcerocupon, ");
		sql.append(" c_nombre,");
		sql.append(" c_metodocalculo,");
		sql.append(" i_diasciclo,");
		sql.append(" i_minfecvcto,");
		sql.append(" i_maxdiasatras,");
		sql.append(" c_tipocurva,");
		sql.append(" i_ultimosndias,");
		sql.append(" c_incluyefechvcto,");
		sql.append(" i_ndiascorridos,");
		sql.append(" e_promediocantidad,");
		sql.append(" i_maxoperaciones,");
		sql.append(" e_tolerancia1,");
		sql.append(" e_tolerancia2,");
		sql.append(" i_maxiteraciones");
		sql.append(" FROM sp_curcerocupon ");

		listaCurvaCeroCupon = jdbcTemplateObject.query(sql.toString(),
				new CurvaCeroCuponMapper());
		return listaCurvaCeroCupon;
	}
}
