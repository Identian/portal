package co.com.infovalmer.model.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.ParametriaArchivoDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.ParametrizacionDao;
import co.com.infovalmer.model.mapper.ParametriaMapper;

public class ParametrizacionImpl extends ConnectionConfig implements
		ParametrizacionDao {

	JdbcTemplate jdbcTemplateObject;
	
	public ParametrizacionImpl() {
		this.jdbcTemplateObject = super.getConexion();
	} 
	
	public void crearParametrizacionArchivos(
			ParametriaArchivoDto parametriaArchivoDto) throws Exception {

		String sql = "INSERT INTO parametria_archivos (nombre_producto,ruta,descripcion,prefijo,agrupador)"
				+ "VALUES (?,?,?,?,?)";

		Object[] parametros = new Object[] {
				parametriaArchivoDto.getNombreProducto().trim(),
				parametriaArchivoDto.getRuta().trim(),
				parametriaArchivoDto.getDescripcion().trim(),
				parametriaArchivoDto.getPrefijo().trim(),
				parametriaArchivoDto.getAgrupador().getIAgrupador() };

		jdbcTemplateObject.update(sql, parametros);

	}

	public List<ParametriaArchivoDto> consultaParametriaArchivos(
			ParametriaArchivoDto filtroParametria) throws Exception {
		// TODO Auto-generated method stub
		List<ParametriaArchivoDto> listParametriaArchivo = null;
		StringBuilder sql = new StringBuilder();
		sql.append(" SELECT ");
		sql.append(" pa.id_parametria, ");
		sql.append(" pa.nombre_producto, ");
		sql.append(" pa.ruta, ");
		sql.append(" pa.descripcion, ");
		sql.append(" pa.prefijo, ");
		sql.append(" pa.agrupador, ");
		sql.append(" tc.c_nombre ");
		sql.append(" FROM parametria_archivos pa LEFT JOIN po_tipocurva_agrupador tc ");
		sql.append(" on (pa.agrupador = tc.i_agrupador)");

		if (filtroParametria != null) {
			Object[] parametros = new Object[] { filtroParametria
					.getNombreProducto() };
			sql.append(" WHERE pa.nombre_producto  =  ?");
			sql.append(" ORDER BY pa.nombre_producto asc");

			listParametriaArchivo = jdbcTemplateObject.query(sql.toString(),
					parametros, new ParametriaMapper());
		} else {
			sql.append("ORDER BY pa.nombre_producto asc");
			listParametriaArchivo = jdbcTemplateObject.query(sql.toString(),
					new ParametriaMapper());
		}

		return listParametriaArchivo;
	}

	public Long totalParametria(String columna, String valor) {
		String sql = "SELECT count(*) from parametria_archivos";
		sql += " WHERE replace((" + columna + "),' ','') = replace((?),' ','')";
		Object[] parametros = new Object[] { valor };
		long rowCount = jdbcTemplateObject.queryForLong(sql, parametros);
		return rowCount;
	}

	public void modificarParametria(ParametriaArchivoDto parametriaArchivoDTO)
			throws Exception {
		String sql = "UPDATE parametria_archivos SET nombre_producto = ?,"
				+ " ruta = ?, descripcion = ?, prefijo = ? , agrupador = ? "
				+ " WHERE id_parametria = ? ";
		Object[] parametros = new Object[] {
				parametriaArchivoDTO.getNombreProducto(),
				parametriaArchivoDTO.getRuta(),
				parametriaArchivoDTO.getDescripcion(),
				parametriaArchivoDTO.getPrefijo(),
				parametriaArchivoDTO.getAgrupador().getIAgrupador(),
				parametriaArchivoDTO.getIdParametria() };

		jdbcTemplateObject.update(sql, parametros);
	}

	public void eliminarParametria(ParametriaArchivoDto parametriaArchivoDTO)
			throws Exception {
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM parametria_archivos WHERE id_parametria = ?");
		Object[] parametros = new Object[] { parametriaArchivoDTO
				.getIdParametria() };

		jdbcTemplateObject.update(sql.toString(), parametros);
	}

}
