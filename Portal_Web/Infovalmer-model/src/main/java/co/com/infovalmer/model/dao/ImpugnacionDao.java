package co.com.infovalmer.model.dao;

import java.sql.SQLException;
import java.util.List;

import co.com.infovalmer.dto.ImpugnacionDto;

public interface ImpugnacionDao {

	public void registrarImpugnacion(ImpugnacionDto impugnacionDto)
			throws Exception;

	public Integer consultarConsecutivoImpugnaciones() throws Exception;

	public List<ImpugnacionDto> listarImpugnacionesSinAtender()
			throws Exception;

	public void actualizarEstadoImpugnacion(ImpugnacionDto impugnacionDto)
			throws Exception;

	public void revertirCambios() throws SQLException;

	public ImpugnacionDto consultarImpugnacionAtendida(
			ImpugnacionDto impugnacionDto) throws Exception;
}
