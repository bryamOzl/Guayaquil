package ec.edu.ups.guayaquil.negocio;

import java.sql.SQLException;

import javax.ejb.Local;

import ec.edu.ups.guayaquil.modelo.Cuenta;
import ec.edu.ups.guayaquil.modelo.Movimiento;


@Local
public interface MovimientoONLocal {
	public boolean movimiento(Movimiento movimiento) throws Exception;
	public int movimientoN () throws SQLException;
	public Cuenta cuenta(String nCuenta) throws SQLException;
	public boolean actualizarCuenta(Cuenta cuenta) throws SQLException;
}
