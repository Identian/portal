package co.com.infovalmer.utilidades;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;

public class LOGS {

//	public final static Logger LOG_DEBUG = LoggerFactory.getLogger(LOGS.class);
	public final static Logger LOG_DEBUG = LoggerFactory.getLogger("filelogger");
	public final static Logger LOG_ERRORES = LoggerFactory.getLogger("fileloggerErrores");
	
	public final static LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();

}