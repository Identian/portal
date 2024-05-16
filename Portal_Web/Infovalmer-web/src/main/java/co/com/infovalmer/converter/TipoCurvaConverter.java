package co.com.infovalmer.converter;

import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import co.com.infovalmer.dto.TipoCurvaDto;
import co.com.infovalmer.controller.derivados.HistoricoDerivadosController;

public class TipoCurvaConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext ctx, UIComponent uiComponent,
			String value) {
		ValueExpression vex = ctx
				.getApplication()
				.getExpressionFactory()
				.createValueExpression(ctx.getELContext(),
						"#{historicoDerivadosController}", HistoricoDerivadosController.class);

		HistoricoDerivadosController curvas = (HistoricoDerivadosController) vex.getValue(ctx
				.getELContext());
		return curvas.getTipoCurva(Integer.valueOf(value));
	}

	public String getAsString(FacesContext fc, UIComponent uic, Object object) {
		if (object != null) {
			return String.valueOf(((TipoCurvaDto) object).getiTipocurva());
		} else {
			return null;
		}
	}

}
