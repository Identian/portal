package co.com.infovalmer.dto;

import java.math.BigDecimal;
import java.util.Date;

public class BetaDto {

		private String c_curcerocupon;
		
		private Date d_fecha;
		
		private String cMuestraalterna;

		private String cNomindicador;

		private BigDecimal eBeta0;

		private BigDecimal eBeta1;

		private BigDecimal eBeta2;

		private BigDecimal eBeta3;

		public BetaDto() {
		}


		public String getCMuestraalterna() {
			return this.cMuestraalterna;
		}

		public void setCMuestraalterna(String cMuestraalterna) {
			this.cMuestraalterna = cMuestraalterna;
		}

		public String getCNomindicador() {
			return this.cNomindicador;
		}

		public void setCNomindicador(String cNomindicador) {
			this.cNomindicador = cNomindicador;
		}

		public BigDecimal getEBeta0() {
			return this.eBeta0;
		}

		public void setEBeta0(BigDecimal eBeta0) {
			this.eBeta0 = eBeta0;
		}

		public BigDecimal getEBeta1() {
			return this.eBeta1;
		}

		public void setEBeta1(BigDecimal eBeta1) {
			this.eBeta1 = eBeta1;
		}

		public BigDecimal getEBeta2() {
			return this.eBeta2;
		}

		public void setEBeta2(BigDecimal eBeta2) {
			this.eBeta2 = eBeta2;
		}

		public BigDecimal getEBeta3() {
			return this.eBeta3;
		}

		public void setEBeta3(BigDecimal eBeta3) {
			this.eBeta3 = eBeta3;
		}


		public String getC_curcerocupon() {
			return c_curcerocupon;
		}


		public void setC_curcerocupon(String c_curcerocupon) {
			this.c_curcerocupon = c_curcerocupon;
		}


		public Date getD_fecha() {
			return d_fecha;
		}


		public void setD_fecha(Date d_fecha) {
			this.d_fecha = d_fecha;
		}
		
		

	}
	

