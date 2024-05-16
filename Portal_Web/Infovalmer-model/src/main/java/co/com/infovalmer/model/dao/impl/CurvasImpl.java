package co.com.infovalmer.model.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.CurvasDto;
import co.com.infovalmer.dto.PuntosCurvaDto;
import co.com.infovalmer.dto.TipoCurvaDto;
import co.com.infovalmer.dto.enums.TipoCurvaEnum;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.CurvasDao;
import co.com.infovalmer.model.mapper.PuntosCurvaMapper;
import co.com.infovalmer.model.mapper.TipoCurvaMapper;

public class CurvasImpl extends ConnectionConfig implements CurvasDao {
	
	JdbcTemplate jdbcTemplateObject;
	
	public CurvasImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}

	public List<TipoCurvaDto> listarTipoCurva() throws Exception {
		// TODO Auto-generated method stub
		List<TipoCurvaDto> listaTipoCurva = null;
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ");
		sql.append("i_tipocurva, ");
		sql.append("c_nombre, ");
		sql.append("c_descripcion, ");
		sql.append("c_ejex, ");
		sql.append("c_ejey, ");
		sql.append("c_prefijo_archivo, ");
		sql.append("i_agrupador, ");
		sql.append("i_orden, ");
		sql.append("c_muestra_curva ");
		sql.append("FROM po_tipocurva ");
		sql.append("ORDER BY c_nombre ");

		listaTipoCurva = jdbcTemplateObject.query(sql.toString(),
				new TipoCurvaMapper());

		return listaTipoCurva;
	}

	public List<PuntosCurvaDto> consultarPuntosCurvas(CurvasDto curvasDto)
			throws Exception {
		List<PuntosCurvaDto> listaPuntosCurva = null;
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT c.d_fecha, p.i_dias, p.e_valor, c.i_curva ");
		sql.append("FROM po_puntoscurva p, po_curva c ");
		sql.append("where p.i_curva = c.i_curva and c.i_tipocurva= ? ");
		sql.append("and c.d_fecha between ? and ?  order by c.d_fecha ");

		Object[] parametros = new Object[] {
				curvasDto.getInsumo().getiTipocurva(),
				curvasDto.getFechaInicial(), curvasDto.getFechaFinal() };

		listaPuntosCurva = jdbcTemplateObject.query(sql.toString(), parametros,
				new PuntosCurvaMapper());
		return listaPuntosCurva;
	}

	public Date ultimaFechaCurva() throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT ");
		sql.append("max(d_fecha) ");
		sql.append("FROM po_curva where i_tipocurva = ?");
		return null;
	}

	public void actulizarTipoCurva(TipoCurvaDto tipoCurvaDto) throws Exception {
		StringBuilder sql = new StringBuilder();
		Object[] parametros = null;
		sql.append("UPDATE po_tipocurva SET ");
		if (tipoCurvaDto == null) {
			parametros = new Object[] { TipoCurvaEnum.NO_MUESTRA_TIPO_CURVA_PARAMETRIA
					.getValor() };
			sql.append("c_muestra_curva = ?");
		} else {
			parametros = new Object[] { tipoCurvaDto.getMuestraCurva(),
					tipoCurvaDto.getiTipocurva() };
			sql.append("c_muestra_curva = ? ");
			sql.append("WHERE i_tipocurva = ?");
		}

		jdbcTemplateObject.update(sql.toString(), parametros);
	}

}
