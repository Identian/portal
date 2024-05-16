package co.com.infovalmer.model.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.GrupCalificaDto;
import co.com.infovalmer.dto.MercadosDto;
import co.com.infovalmer.dto.RangoVencimientoDto;
import co.com.infovalmer.dto.SpClaseDto;
import co.com.infovalmer.dto.TipoMonedaDto;
import co.com.infovalmer.dto.TipoTasaDto;
import co.com.infovalmer.dto.enums.EstadosPortalEnum;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.GeneralesDao;
import co.com.infovalmer.model.mapper.ClaseMapper;
import co.com.infovalmer.model.mapper.GrupCalificaMapper;
import co.com.infovalmer.model.mapper.RangoVencimientoMapper;
import co.com.infovalmer.model.mapper.TipoTasaMapper;
import co.com.infovalmer.utilidades.LOGS;

public class GeneralesImpl extends ConnectionConfig implements GeneralesDao {

	JdbcTemplate jdbcTemplateObject;
	
	public GeneralesImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}
	
	public List<TipoMonedaDto> consultarTipoMoneda() throws Exception {
		MonedaImpl monedaImpl = new MonedaImpl();
		return monedaImpl.consultarTipoMoneda();
	}

	public List<TipoTasaDto> consultaTipoTasa() throws Exception {
		TipoTasaImpl tipoTasaImpl = new TipoTasaImpl();
		return tipoTasaImpl.consultaTipoTasa();
	}

//	public List<EspecieDto> listarNemotecnicos() {
//		StringBuilder sb = new StringBuilder();
//		sb.append(" select * ")
//		// sb.append("select (")
//		// .append("c_nemotecnico,")
//		// .append("c_titulo,")
//		// .append("c_emisor,")
//		// .append("c_codigosuper,")
//		// .append("c_razonsocial,")
//		// .append("d_fechainscripcion,")
//		// .append("d_fechapatrimonial,")
//		// .append("e_valorpatrimonial,")
//		// .append("d_fechadividendo,")
//		// .append("d_fechacausacion,")
//		// .append("e_valordividendo,")
//		// .append("d_fechanominal,")
//		// .append("e_valornominal,")
//		// .append("d_fechasuscripcion,")
//		// .append("e_valorsuscripcion,")
//		// .append("i_numacciones,")
//		// .append("e_valorfiscal,")
//		// .append("c_estado,")
//		// .append("c_suspension,")
//		// .append("dt_fecvigultestado,")
//		// .append("e_preciobase,")
//		// .append("e_preciominimo,")
//		// .append("e_preciomaximo,")
//		// .append("d_fechapreciobase,")
//		// .append("e_precionalbase,")
//		// .append("e_precionalminimo,")
//		// .append("e_precionalmaximo,")
//		// .append("i_maxnumdecimal,")
//		// .append("c_sistnegcion,")
//		// .append("c_suspensiones,")
//		// .append("c_bursatilidad,")
//		// .append("c_clase,")
//		// .append("c_suspendidahoy,")
//		// .append("c_activaayer,")
//		// .append("d_fechafinsusp,")
//		// .append("t_horafinsusp,")
//		// .append("e_precioajustsusp,")
//		// .append("c_pertenecesector,")
//		// .append("c_pertenececanasta,")
//		// .append("c_codisin1,")
//		// .append("c_codisin2,")
//		// .append("c_sector,")
//		// .append("c_bursatilidadanterior,")
//		// .append("c_mgc,")
//		// .append("c_bolsapaisorigen,")
//		// .append("c_modenaorigen,")
//		// .append("c_codigoric)")
//				.append(" from va_especie ");
//
//		return this.jdbcTemplateObject.query(sb.toString(), new EspecieMapper());
//	}

	public Integer consultarConsecutivoImpugnaciones() {
		return this.jdbcTemplateObject.queryForObject(
				"select max(i_impugnacion) from po_impugnacion", Integer.class);
	}

	public List<MercadosDto> listaMercados() throws Exception {
		return this.jdbcTemplateObject.query("select * from po_mercado",
				new RowMapper<MercadosDto>() {
					public MercadosDto mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						MercadosDto mercadosDto = new MercadosDto();
						mercadosDto.setIMercado(rs.getInt(1));
						mercadosDto.setCNombre(rs.getString(2));
						return mercadosDto;
					}
				});
	}

	public List<RangoVencimientoDto> listaRangoDiasVencimiento()
			throws Exception {
		List<RangoVencimientoDto> lRangoVencimiento = null;
		LOGS.LOG_DEBUG.debug("Inicia contruccion de consulta SQL en listaRangoDiasVencimiento()");
		StringBuilder sb = new StringBuilder();
		sb.append(" select i_rangvencimi,i_rangoinicio,i_rangofin,c_nombre ");
		sb.append(" from sp_rangvencimi ");
		sb.append(" order by i_rangofin");
		lRangoVencimiento = jdbcTemplateObject.query(sb.toString(),
				new RangoVencimientoMapper());
		LOGS.LOG_DEBUG.debug("Resultado de la consulta:");
		for(RangoVencimientoDto rangoVencimiento:lRangoVencimiento) {
			LOGS.LOG_DEBUG.debug(rangoVencimiento.getCNombre());
		}
		return lRangoVencimiento;
	}

	public List<TipoTasaDto> consultartasaPorEmisor(String cEmisor)
			throws Exception {
		List<TipoTasaDto> lTasaDtos = null;

		try {

			StringBuilder sb = new StringBuilder(50);

			sb.append(" select ");
			sb.append(" distinct ");
			sb.append(" ti.* ");
			sb.append(" from sp_titulo t" + " inner join sp_tipotasa ti "
					+ " on t.c_tasareferencia = ti.c_tipotasa "
					+ " where (ti.c_estado = ? or i_grupotasa > 0) ");

			Object[] params = new Object[] { EstadosPortalEnum.ACTIVE_STATUS
					.getNombre() };

			if (cEmisor != null && !"".equals(cEmisor)) {
				params = new Object[] {
						EstadosPortalEnum.ACTIVE_STATUS.getNombre(), cEmisor };
				sb.append(" and t.c_emisor=? ");
			}

			lTasaDtos = jdbcTemplateObject.query(sb.toString(), params,
					new TipoTasaMapper());
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error("SE PRESENTO UN ERROR AL LAS TASAS POR EMISOR: " + e);
		}
		return lTasaDtos;
	}

	public List<GrupCalificaDto> consultarCalificacion() {
		List<GrupCalificaDto> grupCalifica = null;

		try {

			StringBuilder sb = new StringBuilder(50);

			sb.append(" SELECT i_grupcalifica,");
			sb.append(" i_escalavalor,");
			sb.append(" c_nombre,");
			sb.append(" c_estado,");
			sb.append(" c_descripcion FROM sp_grupcalifica ");

			grupCalifica = jdbcTemplateObject.query(sb.toString(),
					new GrupCalificaMapper());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return grupCalifica;

	}
	
	public List<SpClaseDto> listarClases(){
		List<SpClaseDto> spClase = null; 
		StringBuilder sb = new StringBuilder(50);

		sb.append(" SELECT ");
		sb.append(" c_clase,");
		sb.append(" c_nombre,");
		sb.append(" c_estado,");
		sb.append(" c_descripcion");
		sb.append(" FROM sp_clase ");
		sb.append(" group by c_nombre desc ");
		return spClase= jdbcTemplateObject.query(sb.toString(),
				new ClaseMapper());
	}
}
