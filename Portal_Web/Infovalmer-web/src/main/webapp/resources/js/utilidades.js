// Calendario PrimeFaces en español.
PrimeFaces.locales['es'] = {
	closeText : 'Cerrar',
	prevText : 'Anterior',
	nextText : 'Siguiente',
	monthNames : [ 'Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio',
			'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre',
			'Diciembre' ],
	monthNamesShort : [ 'Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago',
			'Sep', 'Oct', 'Nov', 'Dic' ],
	dayNames : [ 'Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves',
			'Viernes', 'Sábado' ],
	dayNamesShort : [ 'Dom', 'Lun', 'Mar', 'Mie', 'Jue', 'Vie', 'Sab' ],
	dayNamesMin : [ 'D', 'L', 'M', 'M', 'J', 'V', 'S' ],
	weekHeader : 'Semana',
	firstDay : 1,
	isRTL : false,
	showMonthAfterYear : false,
	yearSuffix : '',
	timeOnlyTitle : 'Sólo hora',
	timeText : 'Tiempo',
	hourText : 'Hora',
	minuteText : 'Minuto',
	secondText : 'Segundo',
	currentText : 'Fecha actual',
	ampm : false,
	month : 'Mes',
	week : 'Semana',
	day : 'Día',
	allDayText : 'Todo el día'
};

/**
 * Metodo que permite limpiar los campos de un formulario.
 * @param nombreFormulario
 */
function limpiarForm(nombreFormulario) {
	document.getElementById(nombreFormulario).reset();
}

/**
 * Metodo que elimina el error por defecto de Prime Faces, para generar un nuevo
 * estilo de error.
 */
function addStyleRequiered() {
	$('.ui-state-error').removeClass('ui-state-error');
	var labels = $('.ui-outputlabel-rfi').parent();
	$.each(labels, function(index, label) {
		var id = $(this).attr('for');
		var campoTexto = document.getElementById(id);
		if (campoTexto.value == "") {
			$(this).addClass("styleRequiered");
		} else {
			$(this).removeClass('styleRequiered');
		}
	});
}

var alfaNumerico = [ 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
		'l', 'm', 'n', '�', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
		'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '-',
		'_', '+', '.', '/' ];
function campoAlfaNumerico(object) {
	var value = object.value;
	var let = value.split("");
	var newvalue = "";
	var errorcn = 'error';
	var valueAccepted = false;
	for (var i = 0; i < let.length; i++) {
		valueAccepted = false;
		for (var j = 0; j < alfaNumerico.length; j++) {
			if (let[i].toLowerCase() == alfaNumerico[j]) {
				newvalue += let[i];
				valueAccepted = true;
				break;
			}
		}
	}
	if (newvalue.trim() == "") {
		newvalue = "";
	}

	if (object.value != newvalue) {
		object.value = newvalue;
	}
}

function showLoading() {
	jQuery(".imgLoading").css({
		left : (jQuery(window).width() - jQuery(".imgLoading").width()) / 2,
		top : (jQuery(window).height() - jQuery(".imgLoading").height()) / 2
	});
	jQuery("body").addClass("loading");
}

function hideLoading() {
	jQuery("body").removeClass("loading");
}

window.onload = mostrarMensaje();

function mostrarMensaje() {
	// var iframe_id = "myIframe";
	var updateIframeHeight = "true";
	var keepOverflowHidden = "false";
	var hide_page_until_loaded_external = "false";
}

/**
 * Metodo que genera el reloj regresivo para la impugnacion.
 * 
 * @param id
 * @param fechaLimiteImpugnacion
 */
function conteoRegresivoHora(id, fechaLimiteImpugnacion) {
	// console.log("Fecha limite impugnacion: "+fechaLimiteImpugnacion)
	var fecha = new Date(fechaLimiteImpugnacion);
	var hoy = new Date();
	var dias = 0;
	var horas = 0;
	var minutos = 0;
	var segundos = 0;
	var texto = "";
	console.log("fecha:  " + fecha);
	console.log("hoy:  " + hoy);
	console.log("fechaLimiteImpugnacion:  " + fechaLimiteImpugnacion);
	if (fecha > hoy) {
		var diferencia = (fecha.getTime() - hoy.getTime()) / 1000;
		dias = Math.floor(diferencia / 86400);
		diferencia = diferencia - (86400 * dias);
		horas = Math.floor(diferencia / 3600);
		diferencia = diferencia - (3600 * horas);
		minutos = Math.floor(diferencia / 60);
		diferencia = diferencia - (60 * minutos);
		segundos = Math.floor(diferencia);
		texto = "Dias: " + dias + ", "+ formatoHora(horas)
		+ ":" + formatoHora(minutos) + ":" + formatoHora(segundos)
		console.log(texto);
		document.getElementById(id + ":labelRestante").innerText = texto;

		if (dias > 0 || horas > 0 || minutos > 0 || segundos > 0) {
			setTimeout(function(){conteoRegresivoHora( id,fechaLimiteImpugnacion) }, 1000);
		} else {
			document.getElementById(id + ":btnGuardar").disabled = true;
			document.getElementById(id + ":btnGuardar").className += " ui-state-disabled";
			document.getElementById(id + ":messages").innerHTML = '<div class="ui-messages-warn ui-corner-all">'
					+ '<a href="#" class="ui-messages-close" onclick="$(this).parent().slideUp();return false;">'
					+ '<span class="ui-icon ui-icon-close"></span>'
					+ '</a>'
					+ '<span class="ui-messages-warn-icon"></span>'
					+ '<ul>'
					+ '<li>'
					+ '<span class="ui-messages-warn-summary">Aviso! El período de impugnación ha terminado</span>'
					+ '</li>' + '</ul>' + '</div>';
		}
	}
}

function formatoHora(numero) {
	var numeroFormato = '';
	var tamanoNumero = numero.toString().length;
	if (tamanoNumero < 2)
		numeroFormato = "0" + numero;
	else
		numeroFormato = numero;

	return numeroFormato;
}

/**
 * Metodo que permite quitar el fondo de los dialog
 */
function eliminarFondoDialog() {
	$('.ui-widget-overlay').removeClass('ui-widget-overlay');
	$('.ui-dialog-mask').removeClass('ui-dialog-mask');
}

$(document).ready(function() {

	// Metodo que se ejecuta cuando se da click en el span de un arbol.
	$('.ui-tree-toggler').click(function() {
		setTimeout(function() {
			aiExecuteWorkaround_advanced_iframe();
		}, 100);
	});

	var variableIntervalo = "";
	var cantidadCargadosAnterior = 0;

	// Metodo que se ejecuta cuando se da click sobre el boton de carga de
	// archivos.
	$("#formCargarArchivos\\:j_idt11_input").click(function() {
		if (variableIntervalo == "") {
			cantidadCargadosAnterior = $('.ui-fileupload-preview').length;
			variableIntervalo = setInterval(function() {
				ejecutarIntervaloActualizarIframe();
			}, 300);
		}
	});
	
	// Metodo que se ejecuta cuando se da click sobre el boton de carga de
	// archivos.
	$("#formCargarArchivosOTC\\:j_idt11_input").click(function() {
		if (variableIntervalo == "") {
			cantidadCargadosAnterior = $('.ui-fileupload-preview').length;
			variableIntervalo = setInterval(function() {
				ejecutarIntervaloActualizarIframe();
			}, 300);
		}
	});

	// Funcion que ejecuta el intervalo cada segundo y permite actualizar el
	// iframe para no visualizar el scroll
	function ejecutarIntervaloActualizarIframe() {
		var cantidadCargados = $('.ui-fileupload-preview').length;
		if (cantidadCargados > cantidadCargadosAnterior) {
			aiExecuteWorkaround_advanced_iframe();
			detenerIntervalor();
		}
	}

	// Funcion que permite detener el la ejecucion de la funcion
	// ejecutarIntervaloActualizarIframe;
	function detenerIntervalor() {
		clearInterval(variableIntervalo);
		variableIntervalo = "";
	}
});
