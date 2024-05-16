package co.com.infovalmer.model.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.HIndiceDto;
import co.com.infovalmer.dto.vistas.HistoricoIndicesVista;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.HIndiceDao;
import co.com.infovalmer.model.mapper.HIndiceMapper;

public class HIndiceImpl extends ConnectionConfig implements HIndiceDao {

	JdbcTemplate jdbcTemplateObject;
	
	public HIndiceImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}
	
	public List<HIndiceDto> consultarHisotoricoIndices(
			HistoricoIndicesVista historicoIndicesVista) throws Exception {
		List<Object> listParam = new ArrayList<Object>();
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT ");
		sql.append(" c_nombre, ");
		sql.append(" d_fechaindice, ");
		sql.append(" e_valor, ");
		sql.append(" d_fechavcto, ");
		sql.append(" c_tipohcal, ");
		sql.append(" c_indice, ");
		sql.append(" i_diasvencimiento ");
		sql.append(" from sp_hindice ");
		sql.append(" where 0 = 0 ");
		
		if(historicoIndicesVista.getIndice() != null && !"".equals(historicoIndicesVista.getIndice())){
			listParam.add(historicoIndicesVista.getIndice());
			sql.append(" AND c_indice = ? ");
		}
		if(historicoIndicesVista.getFechaInicial() != null && historicoIndicesVista.getFechaFinal() != null){
			listParam.add(historicoIndicesVista.getFechaInicial());
			listParam.add(historicoIndicesVista.getFechaFinal());
			sql.append(" AND d_fechaindice BETWEEN ? AND ? ");
		}
		
		sql.append(" ORDER BY d_fechaindice");
		
		Object[] arrayParam = new Object[listParam.size()];
		arrayParam = listParam.toArray(arrayParam);
		
		return jdbcTemplateObject.query(sql.toString(),arrayParam, new HIndiceMapper());
	}
}
