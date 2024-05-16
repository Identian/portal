package co.com.infovalmer.model.dao.impl;


import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.DesarrolloDto;
import co.com.infovalmer.dto.vistas.TablaAmortizacionVista;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.DesarrolloDao;
import co.com.infovalmer.model.mapper.DesarrolloMapper;
import co.com.infovalmer.model.mapper.TotalesTablaAmortizacionMapper;

public class DesarrolloImpl extends ConnectionConfig implements DesarrolloDao {

	JdbcTemplate jdbcTemplateObject;
	
	public DesarrolloImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}
	
	public List<DesarrolloDto> consultarTablaAmortizacion(
			TablaAmortizacionVista tablaAmortizacionVista) throws Exception {
		StringBuilder sql = new StringBuilder();
		List<DesarrolloDto> listaDesarrollo = null;
		Object[] parametros = null;

		sql.append("SELECT ");
		sql.append("d.c_nemotecnico, ");
		sql.append("d.i_numerocupon, ");
		sql.append("d.e_amortizacion, ");
		sql.append("d.d_fechapago, ");
		sql.append("d.e_flujototal, ");
		sql.append("d.e_interes, ");
		sql.append("d.e_saldoamortizar, ");
		sql.append("d.d_fechainivig, ");
		sql.append("d.d_fechafinvig ");
		sql.append("FROM sp_desarrollo d inner join sp_titulo t ");
		sql.append("ON (d.c_nemotecnico = t.c_nemotecnico2) ");
		sql.append("WHERE ? BETWEEN d.d_fechainivig AND d.d_fechafinvig ");
		sql.append("AND t.c_nemotecnico = ? ORDER BY d.i_numerocupon");

		parametros = new Object[] { tablaAmortizacionVista.getFechaFinal(),
				tablaAmortizacionVista.getNemotecnico() };

		listaDesarrollo = jdbcTemplateObject.query(sql.toString(), parametros,
				new DesarrolloMapper());

		return listaDesarrollo;
	}

	public List<DesarrolloDto> consultarTotalesTablaAmortizacion(
			TablaAmortizacionVista tablaAmortizacionVista) throws Exception {
		StringBuilder sql = new StringBuilder();
		Object[] parametros = null;
		List<DesarrolloDto> listaTotalesDesarrollo = null;

		sql.append("SELECT SUM(d.i_numerocupon), SUM(d.e_amortizacion), SUM(d.e_flujototal), SUM(d.e_interes), ");
		sql.append("MIN(d_fechainivig), MAX(d_fechafinvig) ");
		sql.append("FROM sp_desarrollo d inner join sp_titulo t ");
		sql.append("ON (d.c_nemotecnico = t.c_nemotecnico2) ");
		sql.append("WHERE ? BETWEEN d.d_fechainivig AND d.d_fechafinvig ");
		sql.append("AND t.c_nemotecnico = ? ORDER BY d.i_numerocupon");

		parametros = new Object[] { tablaAmortizacionVista.getFechaFinal(),
				tablaAmortizacionVista.getNemotecnico() };

		listaTotalesDesarrollo = jdbcTemplateObject.query(sql.toString(),
				parametros, new TotalesTablaAmortizacionMapper());

		return listaTotalesDesarrollo;
	}
}
