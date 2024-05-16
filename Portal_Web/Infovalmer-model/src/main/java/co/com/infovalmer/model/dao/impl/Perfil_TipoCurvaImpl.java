package co.com.infovalmer.model.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.dto.Perfil_TipocurvaDto;
import co.com.infovalmer.model.conexion.ConnectionConfig;
import co.com.infovalmer.model.dao.Perfil_TipocurvaDao;
import co.com.infovalmer.utilidades.LOGS;

public class Perfil_TipoCurvaImpl extends ConnectionConfig implements Perfil_TipocurvaDao {

	JdbcTemplate jdbcTemplateObject;
	
	public Perfil_TipoCurvaImpl() {
		this.jdbcTemplateObject = super.getConexion();
	} 
	
	public void registrarPerfil_TipoCurva(Perfil_TipocurvaDto perfil_TipoCurva) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append("Insert into po_perfil_tipocurva ");
		query.append("(i_usuario,i_tipocurva) ");
		query.append("values (?,?) ");
		Object[] parameters = new Object[]{perfil_TipoCurva.getI_perfil(),perfil_TipoCurva.getI_tipocurva()};
		LOGS.LOG_DEBUG.debug("perfil: "+perfil_TipoCurva.getI_perfil());
		LOGS.LOG_DEBUG.debug("tiposcurva: "+perfil_TipoCurva.getI_tipocurva());
		try{
			this.jdbcTemplateObject.update(query.toString(),parameters);
		}catch(Exception e){
			LOGS.LOG_ERRORES.error("Excepcion en el guardado de os datos "+e.getMessage());
			throw e;
		}
	}

	public void eliminarPerfil_TipoCurvaPorPerfil(int i_Perfil) throws Exception {
		StringBuilder query = new StringBuilder();
		query.append("Delete from po_perfil_tipocurva ");
		query.append(" where i_usuario = ? ");
		Object[] parameters = new Object[]{i_Perfil};
		LOGS.LOG_DEBUG.debug("eliminarPerfil_TipoCurvaPorPerfil"+i_Perfil);
		try{
			this.jdbcTemplateObject.update(query.toString(), parameters);
		}catch(Exception e){
			LOGS.LOG_ERRORES.error("SE GENERA UN ERROR EN eliminarPerfil_TipoCurvaPorPerfil"+e.getMessage());
			throw e;
		}
		
	}

}
