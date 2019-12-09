package laboratorio6.battleShip;

public class Main {

	public static void main(String args[]) {
		Jugador jugador1 = new Jugador("Jugador1");
		Jugador jugador2 = new Jugador("Jugador2");
		
		BattleShip battleShip = new BattleShip(jugador1, jugador2, 4);
		
		battleShip.iniciarJuego();
		
		
	}
}
