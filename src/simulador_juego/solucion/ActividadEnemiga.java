package simulador_juego.solucion;

import java.util.concurrent.TimeUnit;
/*
 * @author <a href="mailto:xvs1001@alu.ubu.es">Álvaro Vázquez</a>
 */

//DONE Implementar ActividadEnemiga
public class ActividadEnemiga implements Runnable{
		
		// DONE Definir los atributos de la clase

		private int tipoEnemigo;
		private IJuego juego;  
		// DONE Implementar el constructor de la clase con sus atributos
		public ActividadEnemiga(int tipoEnemigo,IJuego juego) {
			this.tipoEnemigo=tipoEnemigo;
			this.juego=juego;
		}
		
		// DONE Implementar la actividad enemiga (generar un enemigo de X tipo y esperar X tiempo)
		public void run() {
			juego.generarEnemigo(tipoEnemigo);
			try {
				TimeUnit.MILLISECONDS.sleep((long) (Math.random()*5));
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
}
