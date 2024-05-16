package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.EmisorDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.EmisorDao;
import co.com.infovalmer.model.mapper.EmisorMapper;

public class EmisorImpl  extends ConnectionConfig implements EmisorDao {
	

	JdbcTemplate jdbcTemplateObject;
	
	public EmisorImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}
	
	public List<EmisorDto> consultaEmisor() throws Exception {
		List<EmisorDto> listaEmisor = null;
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT ");
		sql.append(" c_emisor, ");
		sql.append(" c_nemotecnico, ");
		sql.append(" c_nombre, ");
		sql.append(" c_razonsocial, ");
		sql.append(" c_situacion, ");
		sql.append(" d_fecharegistro ");
		sql.append(" from sp_emisor ");
		sql.append(" group by c_emisor desc");
		sql.append(" order by c_nombre asc");


		listaEmisor = jdbcTemplateObject.query(sql.toString(),
				new EmisorMapper());
		
		return listaEmisor;
	}

	public List<EmisorDto> consultaEmisorPorTipo(String tipoMercado) throws Exception {
		List<EmisorDto> listaEmisor = null;
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT spe.c_emisor, spe.c_nemotecnico, spe.c_nombre, spe.c_razonsocial, spe.c_situacion, spe.d_fecharegistro ");
		sql.append("FROM sp_emisor spe ");
		sql.append("INNER JOIN va_especie vae ON (vae.c_emisor = spe.c_emisor) ");
		sql.append("WHERE vae.c_estado != ? AND vae.c_mgc = ? order by c_nombre");
		Object[] parameters = new Object[]{"E",tipoMercado};
		listaEmisor = jdbcTemplateObject.query(sql.toString(),parameters,new EmisorMapper());
			
		return listaEmisor;
	}
	
}
