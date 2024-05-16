package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.HcategoriaDto;

public class HcategoriaMapper implements RowMapper<HcategoriaDto> {

	public HcategoriaDto mapRow(ResultSet rs, int arg1) throws SQLException{
		HcategoriaDto hcategoria =new HcategoriaDto();
		hcategoria.setDFecha(rs.getDate(1));
		hcategoria.setCNemotecnico(rs.getString(2));
		hcategoria.setCClase(rs.getString(3));
		hcategoria.setIRangovencimiento(rs.getInt(4));
		hcategoria.setIGrupomoneda(rs.getInt(5));
		hcategoria.setIGrupotasa(rs.getInt(6));
		hcategoria.setICodigo(rs.getInt(7));
		hcategoria.setIGrupocalificador(rs.getInt(8));
		hcategoria.setCIsin(rs.getString(9));
		hcategoria.setCEstado(rs.getString(10));
		hcategoria.setDFecharegistro(rs.getDate(11));
		hcategoria.setDFechaemision(rs.getDate(12));
		hcategoria.setDFechavencimiento(rs.getDate(13));
		hcategoria.setIDiasvencimiento(rs.getInt(14));
		hcategoria.setCMoneda(rs.getString(15));
		hcategoria.setCTasa(rs.getString(16));
		hcategoria.setCPlazo(rs.getString(17));
		hcategoria.setEMargen(rs.getBigDecimal(18));
		hcategoria.setCTipomargen(rs.getString(19));
		hcategoria.setCVigente(rs.getString(20));
		hcategoria.setDFechainicio(rs.getDate(21));
		hcategoria.setDFechafin(rs.getDate(22));
		hcategoria.setECotacalificamax(rs.getBigDecimal(23));
		hcategoria.setECotaminima(rs.getBigDecimal(24));
		hcategoria.setEMargenanterior(rs.getBigDecimal(25));
		hcategoria.setEVariacion(rs.getBigDecimal(26));
		hcategoria.setETasareferencia(rs.getBigDecimal(27));
		hcategoria.setETasadescuento(rs.getBigDecimal(28));
		hcategoria.setCTipomargen(rs.getString(29));
		hcategoria.setCVigenteanterior(rs.getString(30));
		hcategoria.setDFechainicioanterior(rs.getDate(31));
		hcategoria.setDFechafinanterior(rs.getDate(32));
		return hcategoria;
	}
}
