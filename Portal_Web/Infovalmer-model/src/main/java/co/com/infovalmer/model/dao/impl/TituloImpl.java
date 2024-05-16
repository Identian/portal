package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.TituloDto;
import co.com.infovalmer.dto.enums.TituloEnum;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.TituloDao;
import co.com.infovalmer.model.mapper.NemotecnicosMapper;
import co.com.infovalmer.model.mapper.TituloMapper;
import co.com.infovalmer.model.properties.LecturaArchivoPropiedades;

public class TituloImpl extends ConnectionConfig implements TituloDao {
	
	LecturaArchivoPropiedades archivoPropiedades = new LecturaArchivoPropiedades();
	
	JdbcTemplate jdbcTemplateObject;
	
	public TituloImpl() {
		this.jdbcTemplateObject = super.getConexion();
	} 

	public List<TituloDto> consultaTitulosIndicadores() throws Exception {
		List<TituloDto> listaTitulos = null;
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT ");
		sql.append(" c_nemotecnico, ");
		sql.append(" c_emisor, ");
		sql.append(" c_tipotitulo, ");
		sql.append(" c_codigosuper, ");
		sql.append(" c_serie, ");
		sql.append(" c_clase, ");
		sql.append(" c_emision, ");
		sql.append(" c_riesgo, ");
		sql.append(" c_aval, ");
		sql.append(" c_admini, ");
		sql.append(" c_expedicion, ");
		sql.append(" c_tipomoneda, ");
		sql.append(" i_plazominimo, ");
		sql.append(" i_plazomaximo, ");
		sql.append(" c_tipotasa, ");
		sql.append(" e_amortizacion, ");
		sql.append(" e_tasamax, ");
		sql.append(" e_tasamin, ");
		sql.append(" i_nrocupones, ");
		sql.append(" i_nroflujos, ");
		sql.append(" c_modalidad, ");
		sql.append(" c_reinv, ");
		sql.append(" c_tasareferencia, ");
		sql.append(" c_baseint, ");
		sql.append(" d_fechaemision, ");
		sql.append(" d_fechavencimiento, ");
		sql.append(" d_fechainscripcion, ");
		sql.append(" d_fechacolmax, ");
		sql.append(" c_dia1flujo, ");
		sql.append(" i_mes1flujo, ");
		sql.append(" c_enirbb, ");
		sql.append(" c_enixtit, ");
		sql.append(" c_estado, ");
		sql.append(" i_calculo, ");
		sql.append(" c_caja, ");
		sql.append(" c_mercado, ");
		sql.append(" c_tabladesarrollo, ");
		sql.append(" c_codisin1, ");
		sql.append(" c_codisin2, ");
		sql.append(" c_periodicidad, ");
		sql.append(" c_metodovaloriza, ");
		sql.append(" c_plazo, ");
		sql.append(" c_bcalificador, ");
		sql.append(" e_tasa, ");
		sql.append(" c_usotasa, ");
		sql.append(" c_tipvaloracion, ");
		sql.append(" i_base360, ");
		sql.append(" i_grucalificacion, ");
		sql.append(" i_grutipotasa, ");
		sql.append(" i_grumoneda, ");
		sql.append(" i_tipocalificion1, ");
		sql.append(" i_tipocalificion2, ");
		sql.append(" c_sneg, ");
		sql.append(" e_portajelquidz, ");
		sql.append(" i_timpocorriento, ");
		sql.append(" i_codigofiltro, ");
		sql.append(" i_metodfiltrprecio, ");
		sql.append(" i_metodfiltrtasa, ");
		sql.append(" c_curvacerocupon, ");
		sql.append(" c_nemotecnico2, ");
		sql.append(" c_tiptitulo, ");
		sql.append(" c_nemocompleto, ");
		sql.append(" c_sistema, ");
		sql.append(" i_numemis, ");
		sql.append(" i_flujosreinv, ");
		sql.append(" d_fecmaxreinv, ");
		sql.append(" c_flagreinv, ");
		sql.append(" e_tasasec, ");
		sql.append(" e_tasareinversion, ");
		sql.append(" c_metodovalgarantia, ");
		sql.append(" c_codisin3, ");
		sql.append(" i_expresatasa, ");
		sql.append(" i_pagopflujo, ");
		sql.append(" c_codigo, ");
		sql.append(" c_muestra_titulo ");
		sql.append(" FROM sp_titulo");
		sql.append(" WHERE c_nemotecnico LIKE 'TFI%' OR");
		sql.append(" c_nemotecnico LIKE 'TUV%' OR");
		sql.append(" c_nemotecnico LIKE 'TCO%' ");
		// sql.append(" AND c_estado = 'A'");
		sql.append(" ORDER BY d_fechainscripcion");

		listaTitulos = jdbcTemplateObject.query(sql.toString(),
				new TituloMapper());
		return listaTitulos;
	}

	public void actulizarTitulo(TituloDto tituloDto) {
		StringBuilder sql = new StringBuilder();
		Object[] parametros = null;
		sql.append("UPDATE sp_titulo SET ");
		if (tituloDto == null) {
			parametros = new Object[] { TituloEnum.NO_MUESTRA_TITULO_PARAMETRIA
					.getValor() };
			sql.append("c_muestra_titulo = ?");
		} else {
			parametros = new Object[] { tituloDto.getcMuestratitulo(),
					tituloDto.getcNemotecnico() };
			sql.append("c_muestra_titulo = ? ");
			sql.append("WHERE c_nemotecnico = ?");
		}

		jdbcTemplateObject.update(sql.toString(), parametros);
	}

	public List<TituloDto> listarTitulosPorEmisorPorTasa(String emisor,
			String tasa, String nemo, String isin, int limInicial,
			int limFinal, String campoOrden, String tipoOrden) throws Exception {
		StringBuilder sql = new StringBuilder();
		List<TituloDto> listaResult = null;
		Object parametros[] = null;

		sql.append(" SELECT distinct ");
		sql.append(" t.c_nemotecnico, ");
		sql.append(" t.c_emisor, ");
		sql.append(" t.c_tipotitulo, ");
		sql.append(" t.c_codigosuper, ");
		sql.append(" t.c_serie, ");
		sql.append(" t.c_clase, ");
		sql.append(" t.c_emision, ");
		sql.append(" t.c_riesgo, ");
		sql.append(" t.c_aval, ");
		sql.append(" t.c_admini, ");
		sql.append(" t.c_expedicion, ");
		sql.append(" t.c_tipomoneda, ");
		sql.append(" t.i_plazominimo, ");
		sql.append(" t.i_plazomaximo, ");
		sql.append(" t.c_tipotasa, ");
		sql.append(" t.e_amortizacion, ");
		sql.append(" t.e_tasamax, ");
		sql.append(" t.e_tasamin, ");
		sql.append(" t.i_nrocupones, ");
		sql.append(" t.i_nroflujos, ");
		sql.append(" t.c_modalidad, ");
		sql.append(" t.c_reinv, ");
		sql.append(" t.c_tasareferencia, ");
		sql.append(" t.c_baseint, ");
		sql.append(" case when t.d_fechaemision='0000-00-00'  then ni.d_fechaemision else t.d_fechaemision  end d_fechaemision , ");
		sql.append(" case when t.d_fechavencimiento='0000-00-00'  then ni.d_fechavencimiento else t.d_fechavencimiento end d_fechavencimiento, ");
		sql.append(" t.d_fechainscripcion, ");
		sql.append(" t.d_fechacolmax, ");
		sql.append(" t.c_dia1flujo, ");
		sql.append(" t.i_mes1flujo, ");
		sql.append(" t.c_enirbb, ");
		sql.append(" t.c_enixtit, ");
		sql.append(" t.c_estado, ");
		sql.append(" t.i_calculo, ");
		sql.append(" t.c_caja, ");
		sql.append(" t.c_mercado, ");
		sql.append(" t.c_tabladesarrollo, ");
		sql.append(" case when t.c_codisin1 is null then ni.c_isin else t.c_codisin1 end as c_codisin1, ");
		sql.append(" t.c_codisin2, ");
		sql.append(" t.c_periodicidad, ");
		sql.append(" t.c_metodovaloriza, ");
		sql.append(" t.c_plazo, ");
		sql.append(" t.c_bcalificador, ");
		sql.append(" t.e_tasa, ");
		sql.append(" t.c_usotasa, ");
		sql.append(" t.c_tipvaloracion, ");
		sql.append(" t.i_base360, ");
		sql.append(" t.i_grucalificacion, ");
		sql.append(" t.i_grutipotasa, ");
		sql.append(" t.i_grumoneda, ");
		sql.append(" t.i_tipocalificion1, ");
		sql.append(" t.i_tipocalificion2, ");
		sql.append(" t.c_sneg, ");
		sql.append(" t.e_portajelquidz, ");
		sql.append(" t.i_timpocorriento, ");
		sql.append(" t.i_codigofiltro, ");
		sql.append(" t.i_metodfiltrprecio, ");
		sql.append(" t.i_metodfiltrtasa, ");
		sql.append(" t.c_curvacerocupon, ");
		sql.append(" t.c_nemotecnico2, ");
		sql.append(" t.c_tiptitulo, ");
		sql.append(" t.c_nemocompleto, ");
		sql.append(" t.c_sistema, ");
		sql.append(" t.i_numemis, ");
		sql.append(" t.i_flujosreinv, ");
		sql.append(" t.d_fecmaxreinv, ");
		sql.append(" t.c_flagreinv, ");
		sql.append(" t.e_tasasec, ");
		sql.append(" t.e_tasareinversion, ");
		sql.append(" t.c_metodovalgarantia, ");
		sql.append(" t.c_codisin3, ");
		sql.append(" t.i_expresatasa, ");
		sql.append(" t.i_pagopflujo, ");
		sql.append(" t.c_codigo, ");
		sql.append(" t.c_muestra_titulo ");
		sql.append(" FROM sp_titulo t");
		sql.append(" LEFT JOIN sp_nemoisin ni on t.c_nemotecnico = ni.c_nemotecnico and ni.c_emisor  = t.c_emisor ");
		sql.append(" where ");
		sql.append(" (t.c_clase != null or t.c_clase != 0) ");
		//t.c_estado = 'A' and

		if (emisor != null && !"".equalsIgnoreCase(emisor)) {
			sql.append(" and t.c_emisor = '" + emisor + "'");

		}
		if (tasa != null && !"".equalsIgnoreCase(tasa)) {
			sql.append(" and t.c_tasareferencia = '" + tasa + "'");

		}

		if (nemo != null && !"".equalsIgnoreCase(nemo)) {
			sql.append(" and t.c_nemotecnico = '" + nemo + "'");
		}

		if (isin != null && !"".equalsIgnoreCase(isin)) {
			sql.append(" and ni.c_isin = '" + isin + "'");
		}

		if (campoOrden != null && tipoOrden != null) {
			sql.append(" order by  t." + campoOrden + " " + tipoOrden);
		} else {
			//sql.append(" order by  t.d_fechainscripcion DESC, t.c_nemotecnico ASC");
		}

		sql.append(" limit ? , ?");
		parametros = new Object[] { limInicial, limFinal };
		listaResult = jdbcTemplateObject.query(sql.toString(), parametros,new TituloMapper());
	

		return listaResult;

	}

	public Long tamanoTitulosPorEmisorPorTasa(String emisor, String tasa,
			String nemo, String isin) throws Exception {
		StringBuilder sql = new StringBuilder();
		List<TituloDto> listaResult = null;

		sql.append(" select count(1) from ( select distinct  "
		  + "t.c_nemotecnico,  t.c_emisor,  t.c_tipotitulo,  t.c_codigosuper,  t.c_serie,  t.c_clase,  t.c_emision, " 
		  + " t.c_riesgo,  t.c_aval,  t.c_admini,  t.c_expedicion,  t.c_tipomoneda,  t.i_plazominimo,  t.i_plazomaximo,  t.c_tipotasa, "  
		  + " t.e_amortizacion,  t.e_tasamax,  t.e_tasamin,  t.i_nrocupones,  t.i_nroflujos,  t.c_modalidad,  t.c_reinv, "  
		  + " t.c_tasareferencia,  t.c_baseint,  case when t.d_fechaemision='0000-00-00'  then ni.d_fechaemision else t.d_fechaemision "  
		  + " end d_fechaemision ,  case when t.d_fechavencimiento='0000-00-00'  then ni.d_fechavencimiento else t.d_fechavencimiento " 
		  + " end d_fechavencimiento,  t.d_fechainscripcion,  t.d_fechacolmax,  t.c_dia1flujo,  t.i_mes1flujo,  t.c_enirbb,  t.c_enixtit, "  
		  + " t.c_estado,  t.i_calculo,  t.c_caja,  t.c_mercado,  t.c_tabladesarrollo,  case when t.c_codisin1 is null then ni.c_isin else "
		  + " t.c_codisin1 end as c_codisin1,  t.c_codisin2,  t.c_periodicidad,  t.c_metodovaloriza,  t.c_plazo,  t.c_bcalificador, "  
		  + " t.e_tasa,  t.c_usotasa,  t.c_tipvaloracion,  t.i_base360,  t.i_grucalificacion,  t.i_grutipotasa,  t.i_grumoneda, "  
		  + " t.i_tipocalificion1,  t.i_tipocalificion2,  t.c_sneg,  t.e_portajelquidz,  t.i_timpocorriento,  t.i_codigofiltro, "  
		  + " t.i_metodfiltrprecio,  t.i_metodfiltrtasa,  t.c_curvacerocupon,  t.c_nemotecnico2,  t.c_tiptitulo,  t.c_nemocompleto, "  
		  + " t.c_sistema,  t.i_numemis,  t.i_flujosreinv,  t.d_fecmaxreinv,  t.c_flagreinv,  t.e_tasasec,  t.e_tasareinversion, "  
		  + " t.c_metodovalgarantia,  t.c_codisin3,  t.i_expresatasa,  t.i_pagopflujo,  t.c_codigo,  t.c_muestra_titulo   ");
		sql.append(" FROM sp_titulo t  ");
		sql.append(" LEFT JOIN (select distinct * from sp_nemoisin ) ni on t.c_nemotecnico = ni.c_nemotecnico and ni.c_emisor  = t.c_emisor ");
		sql.append(" where (t.c_clase != null or t.c_clase != 0) ");
				//t.c_estado = 'A' and 

		if (emisor != null && !"".equalsIgnoreCase(emisor)) {
			sql.append(" AND t.c_emisor = '" + emisor + "'");

		}
		if (tasa != null && !"".equalsIgnoreCase(tasa)) {
			sql.append(" AND t.c_tasareferencia = '" + tasa + "'");

		}
		if (nemo != null && !"".equalsIgnoreCase(nemo)) {
			sql.append(" AND t.c_nemotecnico = '" + nemo + "'");
		}
		if (isin != null && !"".equalsIgnoreCase(isin)) {
			sql.append(" AND ni.c_isin = '" + isin + "'");
		}
// order by  t.d_fechainscripcion DESC, t.c_nemotecnico ASC
		sql.append(")  COUNT ");
		long rowCount = jdbcTemplateObject.queryForLong(sql.toString());

		return rowCount;
	}

	public List<TituloDto> listarNemos(String emisor, String tasa, String nemo) throws Exception {
		StringBuilder sql = new StringBuilder();
		List<TituloDto> listaResult = null;
		try {

			sql.append(" SELECT distinct ");
			sql.append(" t.c_nemotecnico ");
			sql.append(" FROM sp_titulo t ");
			//sql.append(" left join  sp_nemoisin ni on t.c_nemotecnico = ni.c_nemotecnico ");
			//sql.append(" where t.c_estado = 'A' ");
			sql.append(" where (t.c_clase != null or t.c_clase != 0) ");

			if (emisor != null && !"".equalsIgnoreCase(emisor)) {
				sql.append(" and t.c_emisor = '" + emisor + "'");

			}
			if (tasa != null && !"".equalsIgnoreCase(tasa)) {
				sql.append(" and t.c_tasareferencia = '" + tasa + "'");

			}

			if (nemo != null && !"".equalsIgnoreCase(nemo)) {
				sql.append(" and t.c_nemotecnico = '" + nemo + "'");
			}

			sql.append(" order by c_nemotecnico asc ");
			//sql.append(" limit " + archivoPropiedades.consultaMaximoResultados());

			listaResult = jdbcTemplateObject.query(sql.toString(),
					new NemotecnicosMapper());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listaResult;

	}
}


