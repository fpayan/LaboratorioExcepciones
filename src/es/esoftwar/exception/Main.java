package es.esoftwar.exception;

import es.softwar.exception.noverificados.LanzaNuevaRuntimeException;
import es.softwar.exception.noverificados.NuevaRuntimeException;
import es.softwar.exception.verificados.LanzaNuevaException;
import es.softwar.exception.verificados.NuevaException;

public class Main {

	public static void main(String[] args) {
		LanzaNuevaException lanzaNuevaException = new LanzaNuevaException();
		try {
			lanzaNuevaException.lanzaExceptionEjemplo();
		} catch (NuevaException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}finally {
			System.out.println("Me ejecuto siempre.. \n");
		}
		siguienteCodigo();
		System.out.println("---------------- \n");
		//
		LanzaNuevaRuntimeException nuevaRuntime = new LanzaNuevaRuntimeException();
		try {
			nuevaRuntime.lanzaExceptionEjemplo();
		}catch(NuevaRuntimeException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Me ejecuto siempre, ahora con RuntimeException.. \n");
		}
		
		// Después de la RuntimeException
		siguienteCodigo();
	}

	public static void siguienteCodigo() {
		System.out.println("\n Este código se ejecuta después de capturar la exception..");
	}
}
