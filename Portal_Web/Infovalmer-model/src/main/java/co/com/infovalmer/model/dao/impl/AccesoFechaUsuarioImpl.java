package co.com.infovalmer.model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import co.com.infovalmer.dto.AccesoFechaUsuarioDto;
import co.com.infovalmer.dto.Usuario;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.AccesoFechaUsuarioDao;
import co.com.infovalmer.model.mapper.AccesoFechaUsuarioMapper;

public class AccesoFechaUsuarioImpl extends ConnectionConfig implements
		AccesoFechaUsuarioDao {
	
	JdbcTemplate jdbcTemplateObjectWP;
	
	public AccesoFechaUsuarioImpl() {
		this.jdbcTemplateObjectWP = super.getConexionWPS();
	}
	
	public List<AccesoFechaUsuarioDto> consultarFechasAcceso(Usuario usuario,String url)
			throws Exception {
		StringBuilder sql = new StringBuilder();
		List<AccesoFechaUsuarioDto> accesoFechaUsuario = null;
		Object[] parametros = null;

		sql.append(" select wafu.idUsuarioOpcion,wafu.fecha_permitida,wafu.dia_permitido  ");
		sql.append(" from wp_acceso_fecha_usuario wafu ");
		sql.append(" inner join wp_usuario_opcion wuo on wuo.idUsuarioOpcion = wafu.idUsuarioOpcion ");
		sql.append(" inner join wp_subproducto wsp on wsp.idsubproducto = wuo.idsubproducto ");
		sql.append(" where wuo.idusuario = ? and wsp.url = ? ");

		parametros = new Object[] { usuario.getUserId(), url };

		accesoFechaUsuario = this.jdbcTemplateObjectWP.query(sql.toString(),parametros, new AccesoFechaUsuarioMapper());

		return accesoFechaUsuario;
	}

	public List<AccesoFechaUsuarioDto> consultarFechasAccesov1(Usuario usuario,String url, int mes)
			throws Exception {
		StringBuilder sql = new StringBuilder();
		List<AccesoFechaUsuarioDto> accesoFechaUsuario = null;
		Object[] parametros = null;

		sql.append(" select wafu.id_acceso_fecha_usuario, wafu.idUsuarioOpcion,wafu.ultimo_mes, wrf.id_dia");
		sql.append(" from wp_acceso_mes_usuario wafu ");
		sql.append(" inner join wp_usuario_opcion wuo on wuo.idUsuarioOpcion = wafu.idUsuarioOpcion ");
		sql.append(" inner join wp_subproducto wsp on wsp.idsubproducto = wuo.idsubproducto ");
		sql.append(" inner join wp_acceso_dia_usuario wrf on wafu.id_acceso_fecha_usuario = wrf.id_acceso_fecha_usuario ");
		sql.append(" where wuo.idusuario = ? and wsp.url = ? and wafu.ultimo_mes = ?");

		parametros = new Object[] { usuario.getUserId(), url, mes };

		accesoFechaUsuario = this.jdbcTemplateObjectWP.query(sql.toString(),parametros, new AccesoFechaUsuarioMapper());

		return accesoFechaUsuario;
	}
	
	public Integer LimiteAccesoFecha(Usuario usuario,String url) throws Exception{
		StringBuilder sql = new StringBuilder();
		Object[] parametros = null;
		
		sql.append(" select conteo from wp_usuario_opcion wuo ");
		sql.append(" inner join wp_subproducto wsp on wsp.idsubproducto = wuo.idsubproducto ");
		sql.append(" where wuo.idusuario = ? and wsp.url = ? ");
		sql.append(" limit 1 ");
		
		parametros = new Object[] {  usuario.getUserId(), url};
		
		return this.jdbcTemplateObjectWP.queryForInt(sql.toString(),parametros);
	}
	
	public void registrarFechaAccesoUsuario(AccesoFechaUsuarioDto accesoFechaUsuarioDto) throws Exception{
		StringBuilder sql = new StringBuilder();
		Object[] parametros = null;
		
		sql.append(" INSERT INTO wp_acceso_fecha_usuario (idUsuarioOpcion,fecha_permitida,dia_permitido) VALUES (?,?,?) ");
		parametros = new Object[] {  accesoFechaUsuarioDto.getIdUsuarioOpcion(),accesoFechaUsuarioDto.getFecha_permitida(),accesoFechaUsuarioDto.getDia_permitido()};
		
		this.jdbcTemplateObjectWP.update(sql.toString(),parametros);
	}
	
	public void registrarFechaAccesoUsuariov1(final AccesoFechaUsuarioDto accesoFechaUsuarioDto) throws Exception{
		final String sql = " INSERT INTO wp_acceso_mes_usuario (idUsuarioOpcion,ultimo_mes) VALUES (?,?) ";		
		KeyHolder keyHolder = new GeneratedKeyHolder();

		this.jdbcTemplateObjectWP.update(new PreparedStatementCreator() {           

            public PreparedStatement createPreparedStatement(Connection connection)
                    throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql.toString(),
                    Statement.RETURN_GENERATED_KEYS); 
                ps.setInt(1, accesoFechaUsuarioDto.getIdUsuarioOpcion());
                ps.setInt(2, accesoFechaUsuarioDto.getUltimo_mes());
                return ps;
            }
        }, keyHolder);
		
		int key = keyHolder.getKey().intValue();
		
		String sql_ = "INSERT INTO wp_acceso_dia_usuario(id_acceso_fecha_usuario,id_dia) VALUES(?,?) ";
		
		Object[] parametros_ = new Object[] {key, accesoFechaUsuarioDto.getUltimo_dia()};
		this.jdbcTemplateObjectWP.update(sql_.toString(),parametros_);
	}

	public void updateAccesoUsuario(AccesoFechaUsuarioDto accesoFechaUsuarioDto) throws Exception {
		Object[] parametros = null;
		
		String sql_ = "INSERT INTO wp_acceso_dia_usuario(id_acceso_fecha_usuario,id_dia) VALUES(?,?) ";
		parametros = new Object[] {  accesoFechaUsuarioDto.getId(), accesoFechaUsuarioDto.getUltimo_dia()};
		
		this.jdbcTemplateObjectWP.update(sql_.toString(),parametros);
		
	}
}
