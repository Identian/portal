package co.com.infovalmer.model.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.HistoricoAccionesDto;
import co.com.infovalmer.dto.VaPrecioValoracionDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.VaPrecioValoracionDao;
import co.com.infovalmer.model.mapper.HistoricoAccionesMapper;
import co.com.infovalmer.model.mapper.VaPrecioValoracionMapper;

public class VaPrecioValoracionImpl extends ConnectionConfig implements
		VaPrecioValoracionDao {
	SimpleDateFormat formatoFechas = new SimpleDateFormat("yyyy-MM-dd");
	
	JdbcTemplate jdbcTemplateObject;
	
	public VaPrecioValoracionImpl() {
		this.jdbcTemplateObject = super.getConexion();
	} 
	
	public List<VaPrecioValoracionDto> consultaPrecioValoracion(
			String nemotecnico, Date fechaInicial, Date fechaFinal)
			throws Exception {
		String fechaIni = formatoFechas.format(fechaInicial);
		String fechaFin = formatoFechas.format(fechaFinal);
		//LOGS.LOG_DEBUG.info("fechaEnMetodofinal-->"+fechaInicial);
		//LOGS.LOG_DEBUG.info("fechaEnMetodofinal-->"+fechaFinal);
		StringBuilder sql = new StringBuilder();
		List<VaPrecioValoracionDto> listaPreciosValoracion = null;
		Object[] parametros = null;
		sql.append("SELECT ");
		sql.append("d_fecha, ");
		sql.append("c_nemotecnico, ");
		sql.append("c_bursatilidad, ");
		sql.append("e_preciopromedio, ");
		sql.append("e_preciovaloracion, ");
		sql.append("e_precioanterior, ");
		sql.append("e_variacion, ");
		sql.append("c_tipoprecio, ");
		sql.append("d_fechainicio, ");
		sql.append("d_fechafin, ");
		sql.append("c_vigente, ");
		sql.append("c_volumen ");
		sql.append("FROM va_preciovaloracion ");
		sql.append("WHERE c_nemotecnico = ? ");
		sql.append("AND d_fecha between ? and ? ");
		sql.append("ORDER BY d_fecha ");

		parametros = new Object[] { nemotecnico, fechaIni, fechaFin };

		listaPreciosValoracion = jdbcTemplateObject.query(sql.toString(),
				parametros, new VaPrecioValoracionMapper());
		//LOGS.LOG_DEBUG.info("sql en metodo consultaPrecioValoracion2-->"+sql.toString());
		return listaPreciosValoracion;
	}

	public List<HistoricoAccionesDto> historicoAcciones(String nemotecnico,
			String emisor, String mercado, Date fechaInicial, Date fechaFinal)
			throws Exception {
		String fechaIni = formatoFechas.format(fechaInicial);
		String fechaFin = formatoFechas.format(fechaFinal);
		Date now = new Date();
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		String fec = formateador.format(now);
		//LOGS.LOG_DEBUG.info("Envia esta fecha en la consulta"+fec);
		StringBuilder sql = new StringBuilder();
		List<HistoricoAccionesDto> listaHistoricoAcciones = null;
		Object[] parametros = null;

		if ((mercado != null)&&(mercado != "")) {
			sql.append("SELECT DISTINCT ");
			sql.append("p.e_preciovaloracion, i.e_frecuencia, p.e_precioanterior, i.e_capitalizacion, p.e_variacion, i.e_liquidez, ");
			sql.append("p.c_bursatilidad, i.e_tobin, 'ULTIMA MARCACION', 'SECTOR', p.c_volumen,  p.c_nemotecnico, p.d_fecha ");
			sql.append("FROM va_preciovaloracion p INNER JOIN va_indicadores i ON(p.c_nemotecnico = i.c_nemotecnico) ");
			sql.append("INNER JOIN va_especie e ON(p.c_nemotecnico = e.c_nemotecnico)");
			sql.append("WHERE p.d_fecha between ? and ?  ");
			sql.append("AND i.d_fecha between ? and ?  ");
			sql.append("AND e.c_mgc = ? ");
			
			if ((emisor != null)&& (emisor != "")) {
				sql.append("AND e.c_emisor = ? ");
				parametros = new Object[] { fechaIni, fechaFin,
						fechaIni, fechaFin, mercado, emisor };
			} else {
				parametros = new Object[] {fechaIni, fechaFin,
						fechaIni, fechaFin, mercado };
			}
			//LOGS.LOG_DEBUG.info("sql en historicoAcciones-->"+sql.toString());

		} else {
			sql.append("SELECT DISTINCT ");
			sql.append("p.e_preciovaloracion, i.e_frecuencia, p.e_precioanterior, i.e_capitalizacion, p.e_variacion, i.e_liquidez, ");
			sql.append("p.c_bursatilidad, i.e_tobin, 'ULTIMA MARCACION', 'SECTOR', p.c_volumen,  p.c_nemotecnico, p.d_fecha ");
			sql.append("FROM va_preciovaloracion p INNER JOIN va_indicadores i ON(p.c_nemotecnico = i.c_nemotecnico) ");
			sql.append("WHERE p.d_fecha between ? and ?  ");
			sql.append("AND i.d_fecha between ?  and ? ");

			if ((nemotecnico != null)&&(nemotecnico != "")) {
				sql.append("AND p.c_nemotecnico = ? ");
				parametros = new Object[] { fechaIni, fechaFin,
						fechaIni, fechaFin, nemotecnico };
			} else {
				parametros = new Object[] { fechaIni, fechaFin,
						fechaIni, fechaFin };
			}
		}

		sql.append("ORDER BY p.c_nemotecnico ASC, p.d_fecha DESC");

		listaHistoricoAcciones = jdbcTemplateObject.query(sql.toString(),
				parametros, new HistoricoAccionesMapper());
		//LOGS.LOG_DEBUG.info("sql en historicoAcciones3-->"+sql.toString());
		return listaHistoricoAcciones;
	}
	
	public List<HistoricoAccionesDto> historicoAccionesConFecha(String nemotecnico,
			String emisor, String mercado, Date fechaInicial, Date fechaFinal)
			throws Exception {
		
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
		String fecIni = formateador.format(fechaInicial);
		String fecFin = formateador.format(fechaFinal);
		//LOGS.LOG_DEBUG.info("Envia esta fecha en la consulta"+fecIni);
		//LOGS.LOG_DEBUG.info("Envia esta fecha en la consulta"+fecFin);
		StringBuilder sql = new StringBuilder();
		List<HistoricoAccionesDto> listaHistoricoAcciones = null;
		Object[] parametros = null;

		if ((mercado != null)&&(mercado != "")) {
			sql.append("SELECT DISTINCT ");
			sql.append("p.e_preciovaloracion, i.e_frecuencia, p.e_precioanterior, i.e_capitalizacion, p.e_variacion, i.e_liquidez, ");
			sql.append("p.c_bursatilidad, i.e_tobin, 'ULTIMA MARCACION', 'SECTOR', p.c_volumen,  p.c_nemotecnico, p.d_fecha ");
			sql.append("FROM va_preciovaloracion p INNER JOIN va_indicadores i ON(p.c_nemotecnico = i.c_nemotecnico) ");
			sql.append("INNER JOIN va_especie e ON(p.c_nemotecnico = e.c_nemotecnico)");
			sql.append("WHERE p.d_fecha between ? and ?  ");
			sql.append("AND i.d_fecha between ? and ?  ");
			sql.append("AND e.c_mgc = ? ");
			
			if ((emisor != null)&&(emisor != "")) {
				sql.append("AND e.c_emisor = ? ");
				parametros = new Object[] { fecIni, fecFin,
						fecIni, fecFin, mercado, emisor };
			} else {
				parametros = new Object[] { fecIni, fecFin,
						fecIni, fecFin, mercado };
			}
			//LOGS.LOG_DEBUG.info("sql en historicoAcciones-->"+sql.toString());

		} else {
			sql.append("SELECT DISTINCT ");
			sql.append("p.e_preciovaloracion, i.e_frecuencia, p.e_precioanterior, i.e_capitalizacion, p.e_variacion, i.e_liquidez, ");
			sql.append("p.c_bursatilidad, i.e_tobin, 'ULTIMA MARCACION', 'SECTOR', p.c_volumen,  p.c_nemotecnico, p.d_fecha ");
			sql.append("FROM va_preciovaloracion p INNER JOIN va_indicadores i ON(p.c_nemotecnico = i.c_nemotecnico) ");
			sql.append("WHERE p.d_fecha between ? and ?  ");
			sql.append("AND i.d_fecha between ?  and ? ");

			if ((nemotecnico != null)&&(nemotecnico != "")) {
				sql.append("AND p.c_nemotecnico = ? ");
				parametros = new Object[] { fecIni, fecFin,
						fecIni, fecFin, nemotecnico };
			} else {
				parametros = new Object[] { fecIni, fecFin,
						fecIni, fecFin };
			}
		}

		sql.append("ORDER BY p.c_nemotecnico ASC, p.d_fecha DESC");

		listaHistoricoAcciones = jdbcTemplateObject.query(sql.toString(),
				parametros, new HistoricoAccionesMapper());
		//LOGS.LOG_DEBUG.info("sql en historicoAcciones3-->"+sql.toString());
		//LOGS.LOG_DEBUG.info("listaHistoricoAcciones-->"+listaHistoricoAcciones);
		return listaHistoricoAcciones;
	}
}
