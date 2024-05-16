package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.NemoIsinDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.NemoIsinDao;
import co.com.infovalmer.model.mapper.IsinMapper;

public class NemoIsinImpl extends ConnectionConfig implements NemoIsinDao {

	JdbcTemplate jdbcTemplateObject;
	
	public NemoIsinImpl() {
		this.jdbcTemplateObject = super.getConexion();
	} 
	
	public List<NemoIsinDto> consultarIsines(String cEmisor, String eTasa,
			String cNemotecnico) throws Exception {
		List<NemoIsinDto> listaIsin = null;
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT ");
		sql.append(" c_isin, ");
		sql.append(" c_nemotecnico, ");
		sql.append(" c_emisor, ");
		sql.append(" d_fechaemision, ");
		sql.append(" d_fechavencimiento, ");
		sql.append(" c_periodicidad, ");
		sql.append(" e_tasa, ");
		sql.append(" c_tipotasa, ");
		sql.append(" e_spread, ");
		sql.append(" e_base360 ");
		sql.append(" from sp_nemoisin ");
		
		if (cEmisor != null && !"".equals(cEmisor)) {
			sql.append(" where c_emisor = '" + cEmisor + "'");
		}
		
		if (eTasa != null && !"".equals(eTasa)) {
			sql.append(" and c_tipotasa = '" + eTasa + "'");
		}
		
		if (cNemotecnico != null && !"".equals(cNemotecnico)) {
			sql.append(" and c_nemotecnico = '" + cNemotecnico + "'");
		}
		
		sql.append(" order by c_nemotecnico asc ");

		listaIsin = jdbcTemplateObject.query(sql.toString(), new IsinMapper());

		return listaIsin;
	}
	
	
}
