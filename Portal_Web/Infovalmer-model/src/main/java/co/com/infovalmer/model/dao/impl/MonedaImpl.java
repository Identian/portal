package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.TipoMonedaDto;
import co.com.infovalmer.dto.ValorMonedaDto;
import co.com.infovalmer.dto.enums.TipoMonedaEnum;
import co.com.infovalmer.dto.vistas.HistoricoMonedasVista;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.MonedaDao;
import co.com.infovalmer.model.mapper.MonedaMapper;
import co.com.infovalmer.model.mapper.ValorMonedaMapper;

public class MonedaImpl extends ConnectionConfig implements MonedaDao {

	JdbcTemplate jdbcTemplateObject;
	
	public MonedaImpl() {
		this.jdbcTemplateObject = super.getConexion();
	} 
	
	public List<TipoMonedaDto> consultarTipoMoneda() throws Exception {
		// TODO Auto-generated method stub
		List<TipoMonedaDto> listMonedas = null;
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT");
		sql.append(" c_tipomoneda, ");
		sql.append(" i_grupomoneda, ");
		sql.append(" c_nombre, ");
		sql.append(" d_fechaini, ");
		sql.append(" d_fechafin, ");
		sql.append(" c_estado, ");
		sql.append(" c_vigencia, ");
		sql.append(" c_casoespecial, ");
		sql.append(" c_descripcion, ");
		sql.append(" c_muestra_moneda ");
		sql.append(" FROM sp_tipomoneda ");

		listMonedas = jdbcTemplateObject.query(sql.toString(),
				new MonedaMapper());

		return listMonedas;
	}

	public void actulizarTipoMoneda(TipoMonedaDto tipoMonedaDto)
			throws Exception {
		StringBuilder sql = new StringBuilder();
		Object[] parametros = null;
		sql.append("UPDATE sp_tipomoneda SET ");
		if (tipoMonedaDto != null) {
			sql.append(" i_grupomoneda = ?, ");
			sql.append(" c_nombre = ?, ");
			sql.append(" d_fechaini = ?, ");
			sql.append(" d_fechafin = ?, ");
			sql.append(" c_estado = ?, ");
			sql.append(" c_vigencia = ?, ");
			sql.append(" c_casoespecial = ?, ");
			sql.append(" c_descripcion = ?,");
			sql.append(" c_muestra_moneda = ?");
			sql.append(" WHERE c_tipomoneda = ?");

			parametros = new Object[] { tipoMonedaDto.getiGrupomoneda(),
					tipoMonedaDto.getcNombre(), tipoMonedaDto.getdFechaini(),
					tipoMonedaDto.getdFechafin(), tipoMonedaDto.getcEstado(),
					tipoMonedaDto.getcVigencia(),
					tipoMonedaDto.getcCasoespecial(),
					tipoMonedaDto.getcDescripcion(),
					tipoMonedaDto.getcMuestramoneda(),
					tipoMonedaDto.getcTipomoneda() };

		} else {
			sql.append("c_muestra_moneda = ?");
			parametros = new Object[] { TipoMonedaEnum.NO_MUESTRA_MONEDA_PARAMETRIA
					.getValor() };
		}

		jdbcTemplateObject.update(sql.toString(), parametros);
	}

	public List<ValorMonedaDto> consultarValorMoneda() throws Exception {
		StringBuilder sql = new StringBuilder();
		Object[] parametros = null;
		List<ValorMonedaDto> listValorMonedas = null;
		String muestraMoneda = TipoMonedaEnum.MUESTA_MONEDA_PARAMETRIA
				.getValor();

		sql.append(" SELECT vm.c_tipomoneda, vm.d_fecha , vm.e_valormoneda, ");
		sql.append(" (SELECT vmoneda.e_valormoneda FROM sp_tipomoneda tmoneda inner join sp_valormoneda vmoneda ");
		sql.append(" on (tmoneda.c_tipomoneda = vmoneda.c_tipomoneda) WHERE tmoneda.c_muestra_moneda = ? ");
		sql.append(" AND tmoneda.c_tipomoneda = tm.c_tipomoneda ");
		sql.append(" AND vmoneda.d_fecha = (SELECT date_sub(MAX(d_fecha),INTERVAL 1 DAY) FROM sp_valormoneda)) ");
		sql.append(" AS valor_moneda_anterior");
		sql.append(" FROM sp_tipomoneda tm inner join sp_valormoneda vm on (tm.c_tipomoneda = vm.c_tipomoneda) ");
		sql.append(" AND tm.c_muestra_moneda = ? AND vm.d_fecha = (SELECT MAX(d_fecha) FROM sp_valormoneda) ");

		parametros = new Object[] { muestraMoneda, muestraMoneda };

		listValorMonedas = jdbcTemplateObject.query(sql.toString(), parametros,
				new ValorMonedaMapper());

		return listValorMonedas;
	}

	public List<ValorMonedaDto> consultarValorMonedaPorId(
			HistoricoMonedasVista monedasVista) throws Exception {

		List<ValorMonedaDto> listaValorMonedas = null;
		Object[] parametros = null;
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT c_tipomoneda, d_fecha, e_valormoneda ,null ");
		sql.append(" FROM sp_valormoneda ");
		sql.append(" WHERE c_tipomoneda = ? AND d_fecha BETWEEN ? AND ?");
		sql.append(" ORDER BY d_fecha");

		parametros = new Object[] { monedasVista.getTipoMoneda(),
				monedasVista.getFechaInicial(), monedasVista.getFechaFinal() };

		listaValorMonedas = jdbcTemplateObject.query(sql.toString(),
				parametros, new ValorMonedaMapper());
		return listaValorMonedas;
	}
}
