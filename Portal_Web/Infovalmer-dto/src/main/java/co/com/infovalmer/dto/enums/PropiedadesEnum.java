package co.com.infovalmer.dto.enums;

public enum PropiedadesEnum {
	
	FTP_HOST("ftp.host"), 
	FTP_PORT("ftp.port"), 
	FTP_USER("ftp.user"), 
	FTP_PASSWORD("ftp.password"), 
	FTP_PATH("ftp.path"),
	FTP_TYPE("ftp.type"),
	RUTA_IMAGENES_RESPUESTA_IMPUGNACIONE("path.directory.images"),
	PUNTO_MAXIMO_HISTORICO_DERIVADOS("historico.derivados.punto.maximo"),
	CORREO_ELECTRONICO_INFOVALMER("email.from.contact"),
	PASSWORD_CORREO_INFOVALMER("pass.mail.infovalmer"),
	MAIL_HOST("mail.host"),
	MAIL_SMTP_PORT("mail.smtp.port"),
	MAIL_SMTP_AUTH("mail.smtp.auth"),
	MAIL_DEBUG("mail.debug"),
	EMAIL_FROM_CONTACT("email.from.contact"),
	EMAIL_FROM_CONTACT_PSW("email.from.contact.psw"),
	EMAIL_NEW_IMPUGNACION("email.new.impugn"),
	EMAIL_FROM_MASTER("email.from.master"),
	EMAIL_FROM_NAME("email.from.name");
	
	
	
	private PropiedadesEnum(String valor) {
		this.valor = valor;
	}

	private String valor;

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
