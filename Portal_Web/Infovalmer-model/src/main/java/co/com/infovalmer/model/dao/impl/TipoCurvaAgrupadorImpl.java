package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.TipoCurvaAgrupadorDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.TipoCurvaAgrupadorDao;
import co.com.infovalmer.model.mapper.TipoCurvaAgrupadorMapper;
import co.com.infovalmer.utilidades.LOGS;

public class TipoCurvaAgrupadorImpl extends ConnectionConfig implements TipoCurvaAgrupadorDao {

	JdbcTemplate jdbcTemplateObject;
	
	public TipoCurvaAgrupadorImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}
	
	public List<TipoCurvaAgrupadorDto> consultarTipoCurva() throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT i_agrupador,c_nombre,c_etiqueta,c_directorio ");
		sql.append("FROM po_tipocurva_agrupador ORDER BY c_nombre ASC");
		
		LOGS.LOG_DEBUG.debug("SE LANZA LA PRIMERA CONSULTA PARA CONSULTAR AGRUPADOR");
		List<TipoCurvaAgrupadorDto> listTipoCurva = jdbcTemplateObject.query(sql.toString(),
				new TipoCurvaAgrupadorMapper());
		return listTipoCurva;

	}

	public void registrarAgrupador(TipoCurvaAgrupadorDto agrupadorDTO) throws Exception {
		try {
			StringBuilder sb = new StringBuilder();
			sb.append("insert into po_tipocurva_agrupador (");
			sb.append("c_nombre, ");
			sb.append("c_etiqueta, ");
			sb.append("c_directorio )");
			sb.append("values (?,?,?)");
			Object[] parameters = new Object[3];
			parameters[0] = agrupadorDTO.getcNombre();
			parameters[1] = agrupadorDTO.getCEtiqueta();
			parameters[2] = agrupadorDTO.getCDirectorio();
			this.jdbcTemplateObject.update(sb.toString(), parameters);
		} catch (Exception e) {
			throw e;
		}

	}

	public int consultaAgrupador(String descripcionAgrupador) throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT count(*)");
		sql.append("FROM po_tipocurva_agrupador where c_nombre = ?");
		Object[] parametros = new Object[] { descripcionAgrupador };

		int res = jdbcTemplateObject.queryForInt(sql.toString(), parametros);
		return res;
	}

	public void actualizarAgrupador(TipoCurvaAgrupadorDto agrupadorDTO) throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("update po_tipocurva_agrupador set ");
		sb.append("c_nombre = ?, ");
		sb.append("c_etiqueta = ?, ");
		sb.append("c_directorio = ? ");
		sb.append("where i_agrupador = ?; ");
		Object[] parameters = new Object[] { agrupadorDTO.getcNombre(), agrupadorDTO.getCEtiqueta(),
				agrupadorDTO.getCDirectorio(),agrupadorDTO.getIAgrupador() };
		try {
			this.jdbcTemplateObject.update(sb.toString(), parameters);
		} catch (Exception e) {
			throw e;
		}
	}

	public void eliminarAgrupador(int idAgrupador) throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("delete from po_tipocurva_agrupador ");
		sb.append("where i_agrupador = ?");
		Object[] parameters = new Object[] { idAgrupador };
		try {
			this.jdbcTemplateObject.update(sb.toString(), parameters);
		} catch (Exception e) {
			throw e;
		}
	}

	public List<TipoCurvaAgrupadorDto> consultaAgrupadorPerfil(int iPerfil) throws Exception {
		List<TipoCurvaAgrupadorDto> AgrupadorList = null;
		LOGS.LOG_DEBUG.debug("SE LANZA LA SEGUNDA CONSULTA AGRUPADOR POR PERFIL");
		StringBuilder query = new StringBuilder();
		query.append("select TA.* from po_tipocurva_agrupador TA ");
		query.append("inner join po_tipocurva TC on TA.i_agrupador = TC.i_agrupador ");
		query.append("inner join po_perfil_tipocurva PT on PT.i_tipocurva = TC.i_tipocurva ");
		query.append("where PT.i_usuario = ? ");
		query.append("group by i_agrupador");
		Object[] parameters = new Object[] { iPerfil };
		try {
			AgrupadorList = this.jdbcTemplateObject.query(query.toString(), parameters, new TipoCurvaAgrupadorMapper());
			LOGS.LOG_DEBUG.debug("CONSULTA SATISFACTORIO "+AgrupadorList.size());
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error("SE GENERA ERROR AL EJECUTAR LA CONSULTA EN CONSULTA AGRUPADO PERFIL "+e.getMessage());
			throw e;
		}
		return AgrupadorList;
	}

}
