package co.com.infovalmer.model.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.CurvaCeroCuponDto;

public class CurvaCeroCuponMapper implements RowMapper<CurvaCeroCuponDto> {

	public CurvaCeroCuponDto mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		CurvaCeroCuponDto curvaCeroCuponDto = new CurvaCeroCuponDto();
		curvaCeroCuponDto.setcCurcerocupon(rs.getString(1));
		curvaCeroCuponDto.setcNombre(rs.getString(2));
		curvaCeroCuponDto.setcMetodocalculo(rs.getString(3));
		curvaCeroCuponDto.setiDiasciclo(rs.getInt(4));
		curvaCeroCuponDto.setiMinfecvcto(rs.getInt(5));
		curvaCeroCuponDto.setiMaxdiasatras(rs.getInt(6));
		curvaCeroCuponDto.setcTipocurva(rs.getString(7));
		curvaCeroCuponDto.setiUltimosndias(rs.getInt(8));
		curvaCeroCuponDto.setcIncluyefechvcto(rs.getString(9));
		curvaCeroCuponDto.setiNdiascorridos(rs.getInt(10));
		curvaCeroCuponDto.setePromediocantidad(rs.getBigDecimal(11));
		curvaCeroCuponDto.setiMaxoperaciones(rs.getInt(12));
		curvaCeroCuponDto.seteTolerancia1(rs.getBigDecimal(13));
		curvaCeroCuponDto.seteTolerancia2(rs.getBigDecimal(14));
		curvaCeroCuponDto.setiMaxiteraciones(rs.getInt(15));

		return curvaCeroCuponDto;
	}

}
