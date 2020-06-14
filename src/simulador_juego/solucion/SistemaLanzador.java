package simulador_juego.solucion;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
/**
 * Clase del sistema lanzador del juego
 * 
 * @author <a href="mailto:xvs1001@alu.ubu.es">Álvaro Vázquez</a>
 */

public class SistemaLanzador {

		public static void main(String[] args) {
			int maxEnemigos = 20;
			int tiposEnemigos = 4;
			
			/* 
			 * DONE Crear un diccionario con la estrutura: 
			 * 		Clave - tipo de enemigo
			 * 		Valor - número de enemigos de ese tipo que se deben generar
			 */
			Map<Integer,Integer> enemigos = new HashMap<>();
			
			for (int tipo = 0; tipo < tiposEnemigos; tipo++) {
				enemigos.put(tipo,0);
			}
			/* 
			 * DONE Inicializar juego
			 */
			IJuego juego= new Juego(maxEnemigos, tiposEnemigos);
			

			/* 
			 * DONE Crear los hilos para la actividad aliada y enemiga (por pares) iterando sobre el diccionario anterior.
			 */
			
				for(int i=0; i<tiposEnemigos - 1; i++) {
					for(int j = 0; j< enemigos.size(); j++){
					Thread eliminar =new Thread(new ActividadAliada(i, juego));
					Thread generar = new Thread(new ActividadEnemiga(i,juego));
					generar.start();
					eliminar.start();
				}
			}
		}	

}
