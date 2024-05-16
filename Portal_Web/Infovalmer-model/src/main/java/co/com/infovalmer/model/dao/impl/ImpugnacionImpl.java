package co.com.infovalmer.model.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.ImpugnacionDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.ImpugnacionDao;

public class ImpugnacionImpl extends ConnectionConfig implements ImpugnacionDao {

	JdbcTemplate jdbcTemplateObject;
	
	public ImpugnacionImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}
	
	public void registrarImpugnacion(ImpugnacionDto impugnacionDto)
			throws Exception {
		
		Date fechaImpugna =new Date();
		SimpleDateFormat formatImp=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		
		
		try {
			StringBuilder sb = new StringBuilder("insert into po_impugnacion (")
					.append("i_impugnacion,")
					.append("c_causa,")
					.append("c_clase,")
					.append("c_moneda,")
					.append("c_descripcion,")
					.append("c_telefono,")
					.append("c_isin,")
					.append("c_tipotasa,")
					.append("c_nemotecnico,")
					.append("d_fechaproceso,")
					.append("c_usuario,")
					.append("i_suscriptor,")
					.append("i_mercado,")
					.append("c_correo,")
					.append("dt_horarespuesta,")
					.append("c_respuesta,")
					.append("c_curvas,")
					.append("c_estado,")
					.append("i_consec,")
					.append("i_tipocurva)")
					.append(" values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			Object[] parameters = new Object[20];
			parameters[0] = null;
			parameters[1] = impugnacionDto.getCCausa();
			parameters[2] = impugnacionDto.getCClase();
			parameters[3] = impugnacionDto.getCMoneda();
			parameters[4] = impugnacionDto.getCDescripcion();
			parameters[5] = impugnacionDto.getCTelefono();
			parameters[6] = impugnacionDto.getCIsin();
			parameters[7] = impugnacionDto.getcTipotasa();
			parameters[8] = impugnacionDto.getCNemotecnico();
			parameters[9] = formatImp.format(fechaImpugna);
			//parameters[9] = impugnacionDto.getDFechaproceso();
			parameters[10] = impugnacionDto.getCUsuario();
			parameters[11] = impugnacionDto.getISuscriptor();
			parameters[12] = impugnacionDto.getIMercado();
			parameters[13] = impugnacionDto.getCCorreo();
			parameters[14] = impugnacionDto.getDtHorarespuesta();
			parameters[15] = impugnacionDto.getCRespuesta();
			parameters[16] = impugnacionDto.getCCurvas();
			parameters[17] = impugnacionDto.getiEstado();
			parameters[18] = impugnacionDto.getiConsec();
			parameters[19] = impugnacionDto.getiTipoCurva();

			this.jdbcTemplateObject.update(sb.toString(), parameters);

		} catch (Exception e) {
			throw e;
		}
	}

	public void actualizarEstadoImpugnacion(ImpugnacionDto impugnacionDto)
			throws Exception {
		StringBuilder sb = new StringBuilder();
		try {
			sb.append("update po_impugnacion pi set pi.dt_horarespuesta = ? , pi.c_respuesta = ? , pi.c_estado = ? where pi.i_impugnacion = ? ");
			this.jdbcTemplateObject.update(sb.toString(),
					impugnacionDto.getDtHorarespuesta(),
					impugnacionDto.getCRespuesta(),
					impugnacionDto.getiEstado(),
					impugnacionDto.getIImpugnacion());

		} catch (Exception e) {
			this.jdbcTemplateObject.getDataSource().getConnection().rollback();
			throw e;
		}
	}

	public void revertirCambios() throws SQLException {
		this.jdbcTemplateObject.getDataSource().getConnection().rollback();
	}

	public Integer consultarConsecutivoImpugnaciones() throws Exception {
		return this.jdbcTemplateObject.queryForObject(
				"select max(i_consec) from po_impugnacion", Integer.class);
	}

	public List<ImpugnacionDto> listarImpugnacionesSinAtender()
			throws Exception {

		StringBuilder sb = new StringBuilder();
		sb.append("select ").append(" pi.i_impugnacion, ")
				.append(" pi.i_consec, ").append(" pm.c_nombre, ")
				.append(" pi.c_estado, ").append(" pi.c_descripcion, ")
				.append(" pi.c_correo, ").append(" pi.d_fechaproceso ")
				.append(" from po_impugnacion pi ")
				.append(" inner join po_mercado pm ")
				.append(" on pi.i_mercado = pm.I_MERCADO ")
				.append(" where pi.c_estado = 2 ");

		return this.jdbcTemplateObject.query(sb.toString(),
				new RowMapper<ImpugnacionDto>() {
					public ImpugnacionDto mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						ImpugnacionDto impugnacionDto = new ImpugnacionDto();
						impugnacionDto.setIImpugnacion(rs.getInt(1));
						impugnacionDto.setiConsec(rs.getInt(2));
						impugnacionDto.setC_mercado(rs.getString(3));
						impugnacionDto.setiEstado(rs.getInt(4));
						impugnacionDto.setCDescripcion(rs.getString(5));
						impugnacionDto.setCCorreo(rs.getString(6));
						impugnacionDto.setDFechaproceso(rs.getDate(7));
						return impugnacionDto;
					}
				});
	}

	public ImpugnacionDto consultarImpugnacionAtendida(
			ImpugnacionDto impugnacionDto) throws Exception {

		StringBuilder sb = new StringBuilder();
		sb.append("select ").append(" pi.i_impugnacion, ")
				.append(" pi.i_consec, ").append(" pm.c_nombre, ")
				.append(" pi.c_estado, ").append(" pi.c_descripcion, ")
				.append(" pi.c_correo, ").append(" pi.c_respuesta, ")
				.append(" pi.dt_horarespuesta ")
				.append(" from po_impugnacion pi ")
				.append(" inner join po_mercado pm ")
				.append(" on pi.i_mercado = pm.I_MERCADO ")
				.append(" where pi.i_impugnacion = ? and pi.c_estado = 1 ");

		return this.jdbcTemplateObject.queryForObject(sb.toString(),
				new RowMapper<ImpugnacionDto>() {
					public ImpugnacionDto mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						ImpugnacionDto impugnacionDto = new ImpugnacionDto();
						impugnacionDto.setIImpugnacion(rs.getInt(1));
						impugnacionDto.setiConsec(rs.getInt(2));
						impugnacionDto.setC_mercado(rs.getString(3));
						impugnacionDto.setiEstado(rs.getInt(4));
						impugnacionDto.setCDescripcion(rs.getString(5));
						impugnacionDto.setCCorreo(rs.getString(6));
						impugnacionDto.setCRespuesta(rs.getString(7));
						impugnacionDto.setDtHorarespuesta(rs.getDate(8));
						return impugnacionDto;
					}
				}, impugnacionDto.getIImpugnacion());
	}

}
