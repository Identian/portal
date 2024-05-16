package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.TituloDto;

public class TituloMapper implements RowMapper<TituloDto> {
	StringBuilder sql = new StringBuilder();

	public TituloDto mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		TituloDto tituloDto = new TituloDto();
		tituloDto.setcNemotecnico(rs.getString(1));
		tituloDto.setcEmisor(rs.getString(2));
		tituloDto.setcTipotitulo(rs.getString(3));
		tituloDto.setcCodigosuper(rs.getString(4));
		tituloDto.setcSerie(rs.getString(5));
		tituloDto.setcClase(rs.getString(6));
		tituloDto.setcEmision(rs.getString(7));
		tituloDto.setcRiesgo(rs.getString(8));
		tituloDto.setcAval(rs.getString(9));
		tituloDto.setcAdmini(rs.getString(10));
		tituloDto.setcExpedicion(rs.getString(11));
		tituloDto.setcTipomoneda(rs.getString(12));
		tituloDto.setiPlazominimo(rs.getInt(13));
		tituloDto.setiPlazomaximo(rs.getInt(14));
		tituloDto.setcTipotasa(rs.getString(15));
		tituloDto.seteAmortizacion(rs.getBigDecimal(16));
		tituloDto.seteTasamax(rs.getBigDecimal(17));
		tituloDto.seteTasamin(rs.getBigDecimal(18));
		tituloDto.setiNrocupones(rs.getInt(19));
		tituloDto.setiNroflujos(rs.getInt(20));
		tituloDto.setcModalidad(rs.getString(21));
		tituloDto.setcReinv(rs.getString(22));
		tituloDto.setcTasareferencia(rs.getString(23));
		tituloDto.setcBaseint(rs.getString(24));
		tituloDto.setdFechaemision(rs.getDate(25));
		tituloDto.setdFechavencimiento(rs.getDate(26));
		tituloDto.setdFechainscripcion(rs.getDate(27));
		tituloDto.setdFechacolmax(rs.getDate(28));
		tituloDto.setcDia1flujo(rs.getString(29));
		tituloDto.setiMes1flujo(rs.getInt(30));
		tituloDto.setcEnirbb(rs.getString(31));
		tituloDto.setcEnixtit(rs.getString(32));
		tituloDto.setcEstado(rs.getString(33));
		tituloDto.setiCalculo(rs.getInt(34));
		tituloDto.setcCaja(rs.getString(35));
		tituloDto.setcMercado(rs.getString(36));
		tituloDto.setcTabladesarrollo(rs.getString(37));
		tituloDto.setcCodisin1(rs.getString(38));
		tituloDto.setcCodisin2(rs.getString(39));
		tituloDto.setcPeriodicidad(rs.getString(40));
		tituloDto.setcMetodovaloriza(rs.getString(41));
		tituloDto.setcPlazo(rs.getString(42));
		tituloDto.setcBcalificador(rs.getString(43));
		tituloDto.seteTasa(rs.getBigDecimal(44));
		tituloDto.setcUsotasa(rs.getString(45));
		tituloDto.setcTipvaloracion(rs.getString(46));
		tituloDto.setiBase360(rs.getInt(47));
		tituloDto.setiGrucalificacion(rs.getInt(48));
		tituloDto.setiGrutipotasa(rs.getInt(49));
		tituloDto.setiGrumoneda(rs.getInt(50));
		tituloDto.setiTipocalificion1(rs.getInt(51));
		tituloDto.setiTipocalificion2(rs.getInt(52));
		tituloDto.setcSneg(rs.getString(53));
		tituloDto.setePortajelquidz(rs.getBigDecimal(54));
		tituloDto.setiTimpocorriento(rs.getInt(55));
		tituloDto.setiCodigofiltro(rs.getInt(56));
		tituloDto.setiMetodfiltrprecio(rs.getInt(57));
		tituloDto.setiMetodfiltrtasa(rs.getInt(58));
		tituloDto.setcCurvacerocupon(rs.getString(59));
		tituloDto.setcNemotecnico2(rs.getString(60));
		tituloDto.setcTiptitulo(rs.getString(61));
		tituloDto.setcNemocompleto(rs.getString(62));
		tituloDto.setcSistema(rs.getString(63));
		tituloDto.setiNumemis(rs.getInt(64));
		tituloDto.setiFlujosreinv(rs.getInt(65));
		tituloDto.setdFecmaxreinv(rs.getDate(66));
		tituloDto.setcFlagreinv(rs.getString(67));
		tituloDto.seteTasasec(rs.getBigDecimal(68));
		tituloDto.seteTasareinversion(rs.getBigDecimal(69));
		tituloDto.setcMetodovalgarantia(rs.getString(70));
		tituloDto.setcCodisin3(rs.getString(71));
		tituloDto.setiExpresatasa(rs.getInt(72));
		tituloDto.setiPagopflujo(rs.getInt(73));
		tituloDto.setcCodigo(rs.getString(74));
		tituloDto.setcMuestratitulo(rs.getString(75));
		
		return tituloDto;
	}

}
