package laboratorio6.battleShip;

import java.util.Scanner;

public class BattleShip {
	public static final int FILAS = 3;
	public static final int COLUMNAS = 4;

	private Tablero tablero1;
	private Tablero tablero2;
	private Jugador jugador1;
	private Jugador jugador2;
	private int numNaves1;
	private int numNaves2;

	public BattleShip(Jugador jugador1, Jugador jugador2, int numNaves) {

		tablero1 = new Tablero(FILAS, COLUMNAS);
		tablero2 = new Tablero(FILAS, COLUMNAS);

		this.jugador1 = new Jugador(jugador1);
		this.jugador2 = new Jugador(jugador2);

		this.numNaves1 = this.numNaves2 = numNaves;
		
		inicializarUbicacionesRandom(tablero1);
		inicializarUbicacionesRandom(tablero2);
		
	}

	public void ubicacionesJugador1() {
		System.out.println("TABLERO JUGADOR 1: "+jugador1.getNombre());
		tablero1.printTablero();	
	}
	public void ubicacionesJugador2() {
		System.out.println("TABLERO JUGADOR 2: "+jugador2.getNombre());
		tablero2.printTablero();
		
	}
	
	public void iniciarJuego() {

		Cordenada ubicacion;
		Jugador turnoActual;
		
		for (int i = 0;; i++) {
			if (i % 2 == 0) {
				ubicacionesJugador2();
				ubicacion = movimiento(this.jugador1);	
				ataqueDelJugador1(ubicacion);
			
				if(numNaves2 == 0) {
					System.out.println("GANASTE: JUGADOR " + jugador1.getNombre());
					break;
				}
				
			} else {
				ubicacionesJugador1();
				ubicacion = movimiento(this.jugador2);	
				ataqueDelJugador2(ubicacion);
				
				if(numNaves1 == 0) {
					System.out.println("GANASTE: JUGADOR " + jugador2.getNombre());
					break;
				}
				
			}

		}
	}

	public void ataqueDelJugador1(Cordenada cordenada) {
			if (tablero2.getElemento(cordenada) == 1) {
				numNaves2--;
				
				System.out.println("Enemigo caido...");
				tablero2.insertar(cordenada, 0);
				System.out.println("Le quedan " + numNaves2 + " enemigos");
				
			
			} else {
				System.out.println("Fallaste...Sigue intentando!!");
			}
			System.out.println();
	}
	public void ataqueDelJugador2(Cordenada cordenada) {
			if (tablero1.getElemento(cordenada) == 1) {
				numNaves1--;
				
				System.out.println("Enemigo caido...");
				tablero1.insertar(cordenada, 0);
				System.out.println("Le quedan " + numNaves1 + " enemigos");
				
				
			} else {numNaves1--;
				System.out.println("Fallaste...Sigue intentando!!");
			}
			System.out.println();
	}

	
	public Cordenada movimiento(Jugador jugador) {

		Cordenada cordenada;
		boolean esValido = false;
		do {

			cordenada = recibirMovimiento(jugador);
			if (intervaloValido(cordenada)) {
				esValido = true;
			} else {
				System.out.println("Movimiento INVALIDO Intente Nuevamente");
			}

		} while (!esValido);
		return cordenada;
	}

	private Cordenada recibirMovimiento(Jugador jugador) {
		Scanner scan = new Scanner(System.in);
		System.out.println("JUGADOR '" + jugador.getNombre() + "', Fila [1 -3 ] Columna [1 - 5]");

		int row = scan.nextInt() - 1;
		int col = scan.nextInt() - 1;

		return new Cordenada(row, col);
	}

	private boolean intervaloValido(Cordenada cordenada) {
		if (cordenada.getX() >= 0 && cordenada.getX() < FILAS && cordenada.getY() >= 0
				&& cordenada.getY() <= COLUMNAS) {
			return true;
		}
		return false;
	}

	private void inicializarUbicacionesRandom(Tablero tablero) {
		int k = 0;
		int filas = tablero.getFilas();
		int columnas = tablero.getColumnas();
		
		Cordenada cordenada = new Cordenada();
		while(k < numNaves1){
			int x = aleatorio(filas);
			int y = aleatorio(columnas);
			
			cordenada.setX(x);
			cordenada.setY(y);
			
			if(tablero.getElemento(cordenada) != 1){
				tablero.insertar(cordenada, 1);;
				k++;
			}
		}
	}
	
	public int aleatorio(int _numero){
		int x=(int)(Math.random()*_numero);
		return x;
	}
}
