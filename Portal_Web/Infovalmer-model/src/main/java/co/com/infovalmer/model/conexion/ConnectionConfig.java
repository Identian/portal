package co.com.infovalmer.model.conexion;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.utilidades.LOGS;

public class ConnectionConfig {
	
	private Context ctx;
	java.sql.Connection con;

	public ConnectionConfig() {
		try {
			ctx = new InitialContext();
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error("SE PRESENTO UN ERROR AL TRAER EL DATASOURCE, DECRIPCION: " + e);
		}
	}

	protected JdbcTemplate getConexion() {
		DataSource dataSource = null;
		JdbcTemplate jdbcTemplateObject = null;
		try {
			dataSource = (DataSource) this.ctx.lookup("java:/datasource/infovalmerDS");
			jdbcTemplateObject = new JdbcTemplate(dataSource);
		} catch (Exception e) {
			e.printStackTrace();
			LOGS.LOG_ERRORES.error("SE PRESENTO UN ERROR AL TRAER EL DATASOURCE, DECRIPCION: " + e);
		}
		return jdbcTemplateObject;
	}
	
	protected JdbcTemplate getConexionWPS() {
		DataSource dataSource = null;
		JdbcTemplate jdbcTemplateObject = null;
		try {
			dataSource = (DataSource) ctx.lookup("java:/datasource/wordpressDS");
			jdbcTemplateObject = new JdbcTemplate(dataSource);
		} catch (Exception e) {
			e.printStackTrace();
			LOGS.LOG_ERRORES.error("SE PRESENTO UN ERROR AL TRAER EL DATASOURCE, DECRIPCION: " + e);
		}
		return jdbcTemplateObject;
	}
	
}
