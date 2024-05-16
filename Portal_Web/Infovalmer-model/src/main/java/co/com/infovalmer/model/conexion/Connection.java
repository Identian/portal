package co.com.infovalmer.model.conexion;

import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import co.com.infovalmer.utilidades.LOGS;

public class Connection {
	private DataSource dataSource;
	private DataSource dataSourceWP;
	private JdbcTemplate jdbcTemplateObject;
	private JdbcTemplate jdbcTemplateObjectWP;

	
	public Connection() {
		try {
			Context ctx = new InitialContext();
			this.dataSource = (DataSource) ctx.lookup("java:/datasource/infovalmerDS");
			//this.dataSourceWP = (DataSource) ctx.lookup("java:/datasource/wordpressDS");
			this.jdbcTemplateObject = new JdbcTemplate(this.dataSource);
			//this.jdbcTemplateObjectWP = new JdbcTemplate(this.dataSourceWP);
		} catch (Exception e) {
			LOGS.LOG_ERRORES.error("SE PRESENTO UN ERROR AL TRAER EL DATASOURCE, DECRIPCION: " + e);
		}
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public JdbcTemplate getJdbcTemplateObject() {
		return jdbcTemplateObject;
	}

	public void roollback() throws SQLException {
		this.dataSource.getConnection().rollback();
	}

	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}

	public DataSource getDataSourceWP() {
		return dataSourceWP;
	}

	public void setDataSourceWP(DataSource dataSourceWP) {
		this.dataSourceWP = dataSourceWP;
	}

	public JdbcTemplate getJdbcTemplateObjectWP() {
		return jdbcTemplateObjectWP;
	}

	public void setJdbcTemplateObjectWP(JdbcTemplate jdbcTemplateObjectWP) {
		this.jdbcTemplateObjectWP = jdbcTemplateObjectWP;
	}
	
	public void roollbackWP() throws SQLException {
		this.dataSourceWP.getConnection().rollback();
	}
	

}
