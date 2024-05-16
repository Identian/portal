package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.EtiquetaDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.EtiquetaDao;
import co.com.infovalmer.model.mapper.EtiquetaMapper;

public class EtiquetaImpl extends ConnectionConfig implements EtiquetaDao {

	JdbcTemplate jdbcTemplateObject;
	
	public EtiquetaImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}
	
	public List<EtiquetaDto> listaEtiqueta() throws Exception {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder(50);
		List<EtiquetaDto> listEtiquetas = null;
		sql.append("SELECT ");
		sql.append("c_etiqueta, c_idioma, c_valor ");
		sql.append("FROM po_etiqueta");

		listEtiquetas = jdbcTemplateObject.query(sql.toString(),
				new EtiquetaMapper());

		return listEtiquetas;
	}

}
