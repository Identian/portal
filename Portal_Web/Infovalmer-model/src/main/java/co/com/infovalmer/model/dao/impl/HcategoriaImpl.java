package co.com.infovalmer.model.dao.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.HcategoriaDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.HcategoriaDao;
import co.com.infovalmer.model.mapper.HcategoriaMapper;
import co.com.infovalmer.utilidades.LOGS;

public class HcategoriaImpl extends ConnectionConfig implements HcategoriaDao {
	
	JdbcTemplate jdbcTemplateObject;
	
	public HcategoriaImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}

	public List<HcategoriaDto> consultarMargenDeValoracion(
			HcategoriaDto categoriaFilt) {
		
		List<HcategoriaDto> hcategoria = null;
	

			StringBuilder sb = new StringBuilder(50);
			ArrayList<Object> parametrosarray = new ArrayList<Object>();
			
			parametrosarray.add(categoriaFilt.getDFechainicio());
			parametrosarray.add(categoriaFilt.getDFechafin());
			sb.append(" select ");
			sb.append(" hc.d_fecha               ");
			sb.append(" ,hc.c_nemotecnico         ");
			sb.append(" ,hc.c_clase               ");
			sb.append(" ,hc.i_rangovencimiento    ");
			sb.append(" ,hc.i_grupomoneda         ");
			sb.append(" ,hc.i_grupotasa           ");
			sb.append(" ,hc.i_codigo              ");
			sb.append(" ,hc.i_grupocalificador    ");
			sb.append(" ,hc.c_isin                ");
			sb.append(" ,hc.c_estado              ");
			sb.append(" ,hc.d_fecharegistro       ");
			sb.append(" ,hc.d_fechaemision        ");
			sb.append(" ,hc.d_fechavencimiento    ");
			sb.append(" ,hc.i_diasvencimiento     ");
			sb.append(" ,hc.c_moneda              ");
			sb.append(" ,hc.c_tasa                ");
			sb.append(" ,hc.c_plazo               ");
			sb.append(" ,hc.e_margen              ");
			sb.append(" ,hc.c_tipomargen          ");
			sb.append(" ,hc.c_vigente             ");
			sb.append(" ,hc.d_fechainicio         ");
			sb.append(" ,hc.d_fechafin            ");
			sb.append(" ,hc.e_cotacalificamax     ");
			sb.append(" ,hc.e_cotaminima          ");
			sb.append(" ,hc.e_margenanterior      ");
			sb.append(" ,hc.e_variacion           ");
			sb.append(" ,hc.e_tasareferencia      ");
			sb.append(" ,hc.e_tasadescuento       ");
			sb.append(" ,hc.c_tipomargenanterior  ");
			sb.append(" ,hc.c_vigenteanterior     ");
			sb.append(" ,hc.d_fechainicioanterior ");
			sb.append(" ,hc.d_fechafinanterior    ");
			sb.append(" from sp_hcategoria hc ");
			sb.append(" where hc.d_fecha between ? and ? ");
			
			if ((categoriaFilt.getCNemotecnico() != null) && !(categoriaFilt.getCNemotecnico().isEmpty()))  {
				sb.append(" and hc.c_nemotecnico = ? ");
				parametrosarray.add(categoriaFilt.getCNemotecnico());
			}
			if (categoriaFilt.getIRangovencimiento() != 0) {
				sb.append(" and hc.i_rangovencimiento = ? ");
				parametrosarray.add(categoriaFilt.getIRangovencimiento());
			}
			if (categoriaFilt.getCClase() != null) {
				parametrosarray.add(categoriaFilt.getCClase());
				sb.append(" and hc.c_clase = ? ");
			}
			if (categoriaFilt.getCMoneda() != null) {
				sb.append(" and hc.c_moneda = ? ");
				parametrosarray.add(categoriaFilt.getCMoneda());
			}
			if (categoriaFilt.getIGrupocalificador() != 0) {
				sb.append(" and hc.i_grupocalificador = ? ");
				parametrosarray.add(categoriaFilt.getIGrupocalificador());
			}
			if (categoriaFilt.getIGrupotasa() != 0) {
				sb.append(" and hc.i_grupotasa = ? ");
				parametrosarray.add(categoriaFilt.getIGrupotasa());
			}
			
			sb.append("ORDER BY hc.d_fecha ");
			int i = 0;
			
			Object[] parametros = new Object[parametrosarray.size()];
			for(Object param : parametrosarray){
				parametros[i] = param;
				i++;
			}
		
			hcategoria = jdbcTemplateObject.query(sb.toString(), parametros,
					new HcategoriaMapper());
		return hcategoria;

	}
}
