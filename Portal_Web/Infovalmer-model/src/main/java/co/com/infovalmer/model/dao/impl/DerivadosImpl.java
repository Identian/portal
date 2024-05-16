package co.com.infovalmer.model.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import co.com.infovalmer.dto.TipoCurvaAgrupadorDto;
import co.com.infovalmer.dto.TipoCurvaDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.DerivadosDao;
import co.com.infovalmer.utilidades.LOGS;


public class DerivadosImpl extends ConnectionConfig implements DerivadosDao{
	
	JdbcTemplate jdbcTemplateObject;
	
	public DerivadosImpl() {
		this.jdbcTemplateObject = super.getConexion();
	}

	public List<TipoCurvaDto> listaArchivos(Integer idAgrupador,Integer iUsuario) throws Exception {
		try{
			StringBuilder sb = new StringBuilder();
			Object[] parameters = new Object[0];
//			sb.append(" select (i_archivo,");
//			sb.append("c_nombrearchivo,");
//			sb.append("i_motivorechazo,");
//			sb.append("c_tipointerfaz,");
//			sb.append("i_numsecuencia,");
//			sb.append("d_fechagenerado,");
//			sb.append("d_fecharadicacion,");
//			sb.append("dt_horaradicacion,");
//			sb.append("dt_horatransmision,");
//			sb.append("i_cantregistros,");
//			sb.append("e_valorregistros,");
//			sb.append("i_consecpaquete,");
//			sb.append("e_cifracontrol)");
			
			LOGS.LOG_DEBUG.debug("INICIA LA CREACION DE LA TERCER CONSULTA "+idAgrupador + " - "+iUsuario);
			if(idAgrupador != null && iUsuario == 0 ){
				parameters = new Object[1];
				parameters[0] = idAgrupador;
				sb.append(" select ptc.* from  po_tipocurva ptc where ptc.i_agrupador = ? ");
				
			}else if (iUsuario != 0 && idAgrupador != null){
				parameters = new Object[2];
				parameters[0] = iUsuario;
				parameters[1] = idAgrupador;
				sb.append(" select ptc.* from po_tipocurva ptc ");
						sb.append(" inner join po_perfil_tipocurva ppt on ppt.i_tipocurva = ptc.i_tipocurva ");
						sb.append(" where ppt.i_usuario =  ? and ptc.i_agrupador = ? ");
			}else{
				sb.append(" select * from po_tipocurva po ");
			}
			
			sb.append(" order by ptc.c_nombre asc ");

			return this.jdbcTemplateObject.query(sb.toString(),parameters, new RowMapper<TipoCurvaDto>() {
				public TipoCurvaDto mapRow(ResultSet rs, int rowNum) throws SQLException {
					TipoCurvaDto tipoCurvaDto = new TipoCurvaDto();
					tipoCurvaDto.setiTipocurva(rs.getInt(1));
					tipoCurvaDto.setcNombre(rs.getString(2));
					tipoCurvaDto.setcDescripcion(rs.getString(3));
					tipoCurvaDto.setcEjex(rs.getString(4));
					tipoCurvaDto.setcEjey(rs.getString(5));
					tipoCurvaDto.setcPrefijoArchivo(rs.getString(6));
					tipoCurvaDto.setiAgrupador(rs.getInt(7));
					tipoCurvaDto.setiOrden(rs.getInt(8));
					
					return tipoCurvaDto;
				}
			});
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error("SE GENERA UN ERROR AL INTENTAR EJECUTAR LA TERCERA CONSULTA "+e.getMessage());
			throw e;
		}
	}


	public List<TipoCurvaAgrupadorDto> buscarAgrupadorPorDescripcion(String desc) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("select * from po_tipocurva_agrupador po where po.c_nombre like '%");
        sb.append(desc);
        sb.append("%'");
        
        return this.jdbcTemplateObject.query(sb.toString(), new RowMapper<TipoCurvaAgrupadorDto>() {
			public TipoCurvaAgrupadorDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				TipoCurvaAgrupadorDto tipoCurvaAgrupadorDto = new TipoCurvaAgrupadorDto();
				 tipoCurvaAgrupadorDto = new TipoCurvaAgrupadorDto();
		            tipoCurvaAgrupadorDto.setIAgrupador(rs.getInt(1));
		            tipoCurvaAgrupadorDto.setcNombre(rs.getString(2));
		            tipoCurvaAgrupadorDto.setCEtiqueta(rs.getString(3));
		            tipoCurvaAgrupadorDto.setCDirectorio(rs.getString(4));
				
				return tipoCurvaAgrupadorDto;
			}
		});
	}

	public TipoCurvaAgrupadorDto buscarPorId(Integer id) throws Exception {
		 StringBuilder sb = new StringBuilder();
	     sb.append("select * from po_tipocurva_agrupador po where po.i_agrupador = ");
	     sb.append(id);
	     
	     return this.jdbcTemplateObject.queryForObject(sb.toString(), new RowMapper<TipoCurvaAgrupadorDto>() {
				public TipoCurvaAgrupadorDto mapRow(ResultSet rs, int rowNum) throws SQLException {
					TipoCurvaAgrupadorDto tipoCurvaAgrupadorDto = new TipoCurvaAgrupadorDto();
					 tipoCurvaAgrupadorDto = new TipoCurvaAgrupadorDto();
			            tipoCurvaAgrupadorDto.setIAgrupador(rs.getInt(1));
			            tipoCurvaAgrupadorDto.setcNombre(rs.getString(2));
			            tipoCurvaAgrupadorDto.setCEtiqueta(rs.getString(3));
			            tipoCurvaAgrupadorDto.setCDirectorio(rs.getString(4));
					
					return tipoCurvaAgrupadorDto;
				}
			});
	}

	
}
