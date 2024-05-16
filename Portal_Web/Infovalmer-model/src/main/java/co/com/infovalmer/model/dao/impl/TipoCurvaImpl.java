package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.TipoCurvaDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.TipoCurvaDao;
import co.com.infovalmer.model.mapper.TipoCurvaMapper;
import co.com.infovalmer.utilidades.LOGS;

public class TipoCurvaImpl extends ConnectionConfig implements TipoCurvaDao {

	JdbcTemplate jdbcTemplateObject;
	
	public TipoCurvaImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}
	
	public List<TipoCurvaDto> consultaTipoCurvaPorAgrupador(int i_Agrupador)
			throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT i_tipocurva,c_nombre,c_descripcion,c_ejex,c_ejey,c_prefijo_archivo,i_agrupador,i_orden ");
		sql.append("FROM po_tipocurva");
		sql.append("WHERE i_agrupador = ?");
		Object[] parametros = new Object[] { i_Agrupador };
		List<TipoCurvaDto> listTipoCurva = jdbcTemplateObject.query(
				sql.toString(), parametros, new TipoCurvaMapper());
		return listTipoCurva;
	}

	public int cuentaTipoCurvaPorAgrupador(int i_Agrupador) throws Exception {
		int resp = 1;
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT COUNT(*) FROM po_tipocurva ");
		sql.append("where i_agrupador = ?");
		Object[] parameters = new Object[] { i_Agrupador };
		try {
			resp = jdbcTemplateObject.queryForInt(sql.toString(), parameters);
		} catch (Exception e) {
			throw e;
		}
		return resp;
	}

	public List<TipoCurvaDto> consultaTipoCurvaPorPerfil(int i_Agrupador,
			int i_perfil) throws Exception {
		List<TipoCurvaDto> tipoCurvaList = null;
		StringBuilder query = new StringBuilder();
		query.append("select TC.* from  po_tipocurva TC ");
		query.append("inner join po_perfil_tipocurva PT on PT.i_tipocurva = TC.i_tipocurva ");
		query.append("where PT.i_usuario = ? and TC.i_agrupador = ? ");
		Object[] parameters = new Object[] { i_perfil, i_Agrupador };
		LOGS.LOG_DEBUG.debug("INICIA LA EJECUCION DE LA 4 CONSULTA "+i_Agrupador+" - "+i_perfil);
		try {
			tipoCurvaList = jdbcTemplateObject.query(query.toString(),
					parameters, new TipoCurvaMapper());
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error("SE EGENERA ERROR AL INTENTAR EJECUTAR LA 4 CONSULTA "+e.getMessage());
			throw e;
		}
		return tipoCurvaList;
	}

	public List<TipoCurvaDto> consultarTipoCurva(Integer iAgrupador,
			Integer tipoConsulta) throws Exception {

		List<TipoCurvaDto> tipoCurvaList = null;
		StringBuilder query = new StringBuilder();
		if (tipoConsulta.equals(0)) {
			query.append("select TC.* from  po_tipocurva TC  ");
			tipoCurvaList = jdbcTemplateObject.query(query.toString(),
					new TipoCurvaMapper());
		} else {
			query.append("select TC.* from  po_tipocurva TC where i_agrupador = ? or i_agrupador IS  null ");
			Object[] parameters = new Object[1];
			parameters[0] = iAgrupador;
			tipoCurvaList = jdbcTemplateObject.query(query.toString(),parameters,
					new TipoCurvaMapper());
		}
			

		return tipoCurvaList;
	}

	public int existeTipoCurva(String cNombre) throws Exception {

		int curva = 0;
		StringBuilder query = new StringBuilder();
		query.append("select COUNT(*) from  po_tipocurva TC ");
		query.append("where TC.c_nombre ='" + cNombre + "' ");
		try {
			curva = jdbcTemplateObject.queryForInt(query.toString());
		} catch (Exception e) {
			throw e;
		}
		return curva;
	}

	public void registrarCurva(TipoCurvaDto curvaDto) throws Exception {

		try {
			StringBuilder sb = new StringBuilder();
			sb.append("insert into po_tipocurva (");
			sb.append("c_nombre,c_descripcion,c_ejex,c_ejey,c_prefijo_archivo,i_orden,c_muestra_curva)");
			sb.append("values (?,?,?,?,?,?,?)");
			Object[] parameters = new Object[7];
			parameters[0] = curvaDto.getcNombre();
			parameters[1] = curvaDto.getcDescripcion();
			parameters[2] = curvaDto.getcEjex();
			parameters[3] = curvaDto.getcEjey();
			parameters[4] = curvaDto.getcPrefijoArchivo();
			parameters[5] = curvaDto.getiOrden();
			parameters[6] = curvaDto.getMuestraCurva();
			this.jdbcTemplateObject.update(sb.toString(), parameters);
		} catch (Exception e) {
			throw e;
		}
	}

	public void modificarCurva(TipoCurvaDto curvaDto) throws Exception {

		try {
			StringBuilder sb = new StringBuilder();
			sb.append("update po_tipocurva set ");
			sb.append("c_nombre = ?,c_descripcion = ?,c_ejex = ?,c_ejey = ?,c_prefijo_archivo = ?,i_orden = ?,c_muestra_curva = ? ");
			sb.append("where i_tipocurva =  ? ");
			Object[] parameters = new Object[8];
			parameters[0] = curvaDto.getcNombre();
			parameters[1] = curvaDto.getcDescripcion();
			parameters[2] = curvaDto.getcEjex();
			parameters[3] = curvaDto.getcEjey();
			parameters[4] = curvaDto.getcPrefijoArchivo();
			parameters[5] = curvaDto.getiOrden();
			parameters[6] = curvaDto.getMuestraCurva();
			parameters[7] = curvaDto.getiTipocurva();
			this.jdbcTemplateObject.update(sb.toString(), parameters);
		} catch (Exception e) {
			throw e;
		}
	}

	public void eliminarCurva(TipoCurvaDto curvaDto) throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("delete from po_tipocurva ");
		sb.append("where i_tipocurva =  ?");
		Object[] parameters = new Object[] { curvaDto.getiTipocurva() };
		this.jdbcTemplateObject.update(sb.toString(), parameters);

	}

	public void asociarCurvaAgrupador(List<TipoCurvaDto> listCurvaDtos,
			Integer iAgrupador) throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("update po_tipocurva set ");
		sb.append(" i_agrupador = null ");
		sb.append("where i_agrupador =   "+iAgrupador);
		
		this.jdbcTemplateObject.update(sb.toString());
		for (TipoCurvaDto tipoCurvaDto : listCurvaDtos) {
			sb = new StringBuilder();
			sb.append("update po_tipocurva set ");
			sb.append(" i_agrupador = ? ");
			sb.append("where i_tipocurva =  ? ");
			Object[] parameters = new Object[2];
			parameters[0] = iAgrupador;
			parameters[1] = tipoCurvaDto.getiTipocurva();
			this.jdbcTemplateObject.update(sb.toString(), parameters);
		}

	}

	public List<TipoCurvaDto> consultarCurvasPorAgrupador(Integer iAgrupadorDto)
			throws Exception {

		List<TipoCurvaDto> tipoCurvaList = null;
		StringBuilder query = new StringBuilder();
		query.append("select TC.* from  po_tipocurva TC where TC.i_agrupador = ? ");
		Object[] parameters = new Object[1];
		parameters[0] = iAgrupadorDto;
		tipoCurvaList = jdbcTemplateObject.query(query.toString(), parameters,
				new TipoCurvaMapper());

		return tipoCurvaList;
	}
}
