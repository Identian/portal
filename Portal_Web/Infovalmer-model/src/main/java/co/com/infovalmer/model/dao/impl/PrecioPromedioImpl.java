package co.com.infovalmer.model.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.PrecioPromedioDto;
import co.com.infovalmer.dto.enums.TituloEnum;
import co.com.infovalmer.dto.vistas.HistoricoPrecioVista;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.PrecioPromedioDao;
import co.com.infovalmer.model.mapper.PrecioPromedioMapper;

public class PrecioPromedioImpl extends ConnectionConfig implements PrecioPromedioDao {

	JdbcTemplate jdbcTemplateObject;
	
	public PrecioPromedioImpl() {
		this.jdbcTemplateObject = super.getConexion();
	} 
	
	public List<PrecioPromedioDto> consultarPrecioNemotecnico()
			throws Exception {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder();
		List<PrecioPromedioDto> listaPrecioPromedio = null;
		Object[] parametros = null;
		sql.append(" SELECT ");
		sql.append(" distinct (pp.c_nemotecnico), ");
		sql.append(" pp.c_isin, ");
		sql.append(" pp.e_numemision, ");
		sql.append(" pp.c_estado, ");
		sql.append(" pp.d_fecharegistro, ");
		sql.append(" pp.d_fechaemistit, ");
		sql.append(" pp.d_fechavenctit, ");
		sql.append(" pp.c_periodmodali, ");
		sql.append(" pp.i_diasvencimiento, ");
		sql.append(" pp.c_moneda, ");
		sql.append(" pp.c_tipotasa, ");
		sql.append(" pp.c_tipotasaref, ");
		sql.append(" pp.e_spread, ");
		sql.append(" pp.i_tipocalculo, ");
		sql.append(" pp.i_basecalculo, ");
		sql.append(" pp.e_preciopromedio, ");
		sql.append(" pp.d_fecultmprecio, ");
		sql.append(" pp.e_ultmprecio, ");
		sql.append(" pp.e_preciolimpio, ");
		sql.append(" pp.c_vigente, ");
		sql.append(" pp.d_fechainicio, ");
		sql.append(" pp.d_fechafin, ");
		sql.append(" pp.e_precioanterior, ");
		sql.append(" pp.e_variacion, ");
		sql.append(" pp.i_rangovencimiento, ");
		sql.append(" pp.e_margen, ");
		sql.append(" pp.e_tir, ");
		sql.append(" pp.e_margenequivalente, ");
		sql.append(" pp.e_duracion, ");
		sql.append(" pp.e_duracionmod, ");
		sql.append(" pp.e_convexidad, ");
		sql.append(" pp.e_cuponcorrido, ");
		sql.append(" pp.c_calificacion ");
		sql.append(" FROM sp_precioprodio pp INNER JOIN sp_titulo t ");
		sql.append(" ON (pp.c_nemotecnico = t.c_nemotecnico) ");
		sql.append(" WHERE t.c_muestra_titulo = ? ");
		sql.append(" AND pp.d_fecharegistro = (select c_valor from sp_parametro where  i_parametro = ?) ");
		sql.append(" GROUP BY pp.c_nemotecnico ");
//		sql.append(" AND pp.d_fecharegistro = (SELECT MAX(d_fecharegistro) FROM sp_precioprodio )");
//		sql.append(" ORDER BY  pp.c_nemotecnico, pp.d_fecharegistro ASC ");

		parametros = new Object[] { TituloEnum.MUESTA_TITULO_PARAMETRIA.getValor(),
				Integer.parseInt(TituloEnum.FECHAINICIOSISTEMA.getValor())};

		listaPrecioPromedio = jdbcTemplateObject.query(sql.toString(),
				parametros, new PrecioPromedioMapper());

		return listaPrecioPromedio;
	}

	public List<PrecioPromedioDto> consultarHistoricoPrecio(
			HistoricoPrecioVista historicoPrecioVista) throws Exception {
		List<PrecioPromedioDto> listaResult = null;
		List<Object> listParam = new ArrayList<Object>();
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT ");
		sql.append(" pp.c_nemotecnico, ");
		sql.append(" pp.c_isin, ");
		sql.append(" pp.e_numemision, ");
		sql.append(" pp.c_estado, ");
		sql.append(" pp.d_fecharegistro, ");
		sql.append(" pp.d_fechaemistit, ");
		sql.append(" pp.d_fechavenctit, ");
		sql.append(" pp.c_periodmodali, ");
		sql.append(" pp.i_diasvencimiento, ");
		sql.append(" pp.c_moneda, ");
		sql.append(" pp.c_tipotasa, ");
		sql.append(" pp.c_tipotasaref, ");
		sql.append(" pp.e_spread, ");
		sql.append(" pp.i_tipocalculo, ");
		sql.append(" pp.i_basecalculo, ");
		sql.append(" pp.e_preciopromedio, ");
		sql.append(" pp.d_fecultmprecio, ");
		sql.append(" pp.e_ultmprecio, ");
		sql.append(" pp.e_preciolimpio, ");
		sql.append(" pp.c_vigente, ");
		sql.append(" pp.d_fechainicio, ");
		sql.append(" pp.d_fechafin, ");
		sql.append(" pp.e_precioanterior, ");
		sql.append(" pp.e_variacion, ");
		sql.append(" pp.i_rangovencimiento, ");
		sql.append(" pp.e_margen, ");
		sql.append(" pp.e_tir, ");
		sql.append(" pp.e_margenequivalente, ");
		sql.append(" pp.e_duracion, ");
		sql.append(" pp.e_duracionmod, ");
		sql.append(" pp.e_convexidad, ");
		sql.append(" pp.e_cuponcorrido, ");
		sql.append(" pp.c_calificacion ");
		sql.append(" FROM sp_titulo ti ");
		sql.append(" inner join sp_precioprodio pp on  ti.c_nemotecnico = pp.c_nemotecnico ");
		sql.append(" left join sp_nemoisin ne on  ne.c_nemotecnico = ti.c_nemotecnico AND pp.c_isin = ne.c_isin  AND ti.c_emisor = ne.c_emisor ");
		sql.append(" inner join sp_emisor em on em.c_emisor = ti.c_emisor ");
		sql.append(" WHERE 0 = 0 ");
		
		if(historicoPrecioVista.getTipoTasa() != null && !"".equals(historicoPrecioVista.getTipoTasa())){
			listParam.add(historicoPrecioVista.getTipoTasa());
			sql.append(" and pp.c_tipotasaref = ? ");
		}
		
		if(historicoPrecioVista.getEmisor() != null && !"".equals(historicoPrecioVista.getEmisor())){
			listParam.add(historicoPrecioVista.getEmisor());
			sql.append(" and ne.c_emisor = ? ");
		}
		
		if(historicoPrecioVista.getNemotecnico() != null && !"".equals(historicoPrecioVista.getNemotecnico())){
			listParam.add(historicoPrecioVista.getNemotecnico());
			sql.append(" AND pp.c_nemotecnico = ? ");
		}
		
		if(historicoPrecioVista.getIsin() != null && !"".equals(historicoPrecioVista.getIsin())){
			listParam.add(historicoPrecioVista.getIsin());
			sql.append(" AND pp.c_isin = ? ");
		}
		
		if(historicoPrecioVista.getFechaFinal() != null && historicoPrecioVista.getFechaInicial() != null){
			listParam.add(historicoPrecioVista.getFechaInicial());
			listParam.add(historicoPrecioVista.getFechaFinal());
			sql.append(" AND pp.d_fecharegistro BETWEEN ? AND ?");		
		}
		if(historicoPrecioVista.getCampoOrden()!= null  && historicoPrecioVista.getFormaOrden() !=null){
			sql.append(" ORDER BY pp." + historicoPrecioVista.getCampoOrden() + " " + historicoPrecioVista.getFormaOrden() );
		}else{
			sql.append(" ORDER BY pp.d_fecharegistro ");
		}
		
		
		if(historicoPrecioVista.getLazyDesde() > -1 && historicoPrecioVista.getLazyFilasPorQuery() > 0){
			listParam.add(historicoPrecioVista.getLazyDesde());
			listParam.add(historicoPrecioVista.getLazyFilasPorQuery());
			sql.append(" limit ? , ?");		
		}
		
		Object[] arrayParam = new Object[listParam.size()];
		arrayParam = listParam.toArray(arrayParam);
		
		listaResult= jdbcTemplateObject.query(sql.toString(), arrayParam,
				new PrecioPromedioMapper());

		return listaResult;
	}

}
