package simulador_juego.solucion;
/*
 * @author Álvaro Vázquez Suárez
 * @date 14/06/2020
 * @name Práctica Programación Concurrente 2C
 */
import java.util.concurrent.TimeUnit;

public class ActividadEnemiga implements Runnable{
	
	//Definir los atributos de la clase
	
	private int tipoEnemigo;
	private IJuego juego;
	
	//Implementar el constructor de la clase con sus atributos
	
	public ActividadEnemiga(int tipoEnemigo,IJuego juego) {
		this.tipoEnemigo=tipoEnemigo;
		this.juego=juego;
	}
	
	//Implementar la actividad aliada (eliminar un enemigo de X tipo)
	
	public void run() {
		juego.generarEnemigo(tipoEnemigo);
		try {
			TimeUnit.MILLISECONDS.sleep((long) (Math.random()*5));
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	

}
