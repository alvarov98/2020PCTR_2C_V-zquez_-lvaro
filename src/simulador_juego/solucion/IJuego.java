package simulador_juego.solucion;
/*
 * @author <a href="mailto:xvs1001@alu.ubu.es">Álvaro Vázquez</a>
 */

public interface IJuego {
	// DONE Definir los métodos de la Interfaz
	public void generarEnemigo(int tipoEnemigo);
	public void eliminarEnemigo(int tipoEnemigo) throws InterruptedException;
}
