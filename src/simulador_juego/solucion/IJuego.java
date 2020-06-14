package simulador_juego.solucion;

/*
 * @author Álvaro Vázquez Suárez
 * @date 14/06/2020
 * @name Práctica Programación Concurrente 2C
 */

public interface IJuego {

	// Definir los métodos de la Interfaz

	public void generarEnemigo(int tipoEnemigo);

	public void eliminarEnemigo(int tipoEnemigo);
}
