package simulador_juego.solucion;

/**
 * Clase ActividadAliada
 * @author <a href="mailto:xvs1001@alu.ubu.es">Álvaro Vázquez</a>
 *
 */
import java.util.concurrent.TimeUnit;
//DONE Implementar ActividadAliada
public class ActividadAliada implements Runnable{
		
		// DONE Definir los atributos de la clase
		private int tipoEnemigo;
		private IJuego juego;

		
		// DONE Implementar el constructor de la clase con sus atributos
		public ActividadAliada(int tipoEnemigo, IJuego juego) {
			this.tipoEnemigo = tipoEnemigo;
			this.juego = juego;
		}
		// DONE Implementar la actividad aliada (eliminar un enemigo de X tipo)
		public void run() {
			try {
				juego.eliminarEnemigo(tipoEnemigo);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				TimeUnit.MILLISECONDS.sleep((long) (Math.random()*5));
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
}
