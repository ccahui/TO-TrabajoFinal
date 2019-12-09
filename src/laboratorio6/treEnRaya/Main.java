package laboratorio6.treEnRaya;

public class Main {

	public static void main(String args[]) {
		
		Jugador jugador1 = new Jugador('X');
		Jugador jugador2 = new Jugador('0');
 		TresEnRaya juego = new TresEnRaya(jugador1,jugador2);
 		
 		
 		juego.iniciarJuego();
 		
		
	}
}
