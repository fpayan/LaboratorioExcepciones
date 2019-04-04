package es.softwar.exception.verificados;

public class LanzaNuevaException {
	
	public void lanzaExceptionEjemplo() throws NuevaException {
		throw new NuevaException("Lanzando nueva exception..");
	}
}
