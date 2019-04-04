package es.softwar.exception.noverificados;

public class LanzaNuevaRuntimeException {
	
	public void lanzaExceptionEjemplo() throws NuevaRuntimeException {
		throw new NuevaRuntimeException("Lanzando nueva RuntimeException..");
	}
}
