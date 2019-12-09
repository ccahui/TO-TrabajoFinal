package laboratorio6.treEnRaya;

import java.util.Scanner;

public class TresEnRaya {

	private final int CANTIDAD_MAXIMA_MOVIMIENTOS = 9;
	private Tablero tablero;
	private Jugador jugador1;
	private Jugador jugador2;
	
	public TresEnRaya() {
		tablero = new Tablero(3,3);
		this.jugador1 = new Jugador('X');
		this.jugador2 = new Jugador('O');
	}
	
	public TresEnRaya(Jugador jugador1, Jugador jugador2) {
		tablero = new Tablero(3,3);
		this.jugador1 = new Jugador(jugador1);
		this.jugador2 = new Jugador(jugador2);
	}
	
	public void dibujarEstado() {
		tablero.printTablero();
	}
	
	public void iniciarJuego() {
		
		Cordenada movimiento;
		Jugador turnoActual;
		
		for(int i = 0; i < CANTIDAD_MAXIMA_MOVIMIENTOS; i++) {
			
			if(i%2 == 0) {
				turnoActual = jugador1;
				
			} else {
				turnoActual = jugador2;
			}
			
			movimiento = movimiento(turnoActual);
			insertarMovimientoAlTablero(turnoActual, movimiento);
			dibujarEstado();
			
			if(esUnMovimientoGanador(turnoActual, movimiento)) {
				System.out.println("GANASTE: JUGADOR "+turnoActual.getFicha());
				break;
			}
			
			
		}
	}
	
	
	
	public Cordenada movimiento(Jugador jugador) {

		Cordenada cordenada;
		boolean esValido = false;
		do {
			
	        cordenada = recibirMovimiento(jugador);
	        if(esUnMovimientoValido(cordenada)) {
	        	esValido = true;
	        } else {
	        	System.out.println("Movimiento INVALIDO Intente Nuevamente");
	        }
	        
		} while(!esValido);
		return cordenada;
	}
	
	public void insertarMovimientoAlTablero(Jugador jugador, Cordenada cordenada) {
		tablero.insertar(cordenada, jugador.getFicha());
	}
	
	private boolean esUnMovimientoValido(Cordenada cordenada) {
		if(intervaloValido(cordenada) && tablero.estaVacioLaPosicion(cordenada)) {
			return true;
		}
		return false;
	}
	
	private boolean intervaloValido(Cordenada cordenada) {
		if(cordenada.getX() >=0 && cordenada.getX() <=2 && cordenada.getY() >=0 && cordenada.getY() <= 2) {
			return true;
		}
		return false;
	}
	
	private Cordenada recibirMovimiento(Jugador jugador) {
		Scanner scan = new Scanner(System.in);		
		System.out.println("JUGADOR '"+jugador.getFicha()+"', Fila [1 -3 ] Columna [1 - 3]");
		
		int row = scan.nextInt() - 1;
        int col = scan.nextInt() - 1;
        
        return new Cordenada(row, col);
	}
	
	 public boolean esUnMovimientoGanador(Jugador jugador, Cordenada cordenada) {
	      
		 int currentRow = cordenada.getX();
		 int currentCol = cordenada.getY();
		 
		 char theSeed = jugador.getFicha();
		
		 char[][] board = this.tablero.array;
		 return (board[currentRow][0] == theSeed         // 3-in-the-row
	                   && board[currentRow][1] == theSeed
	                   && board[currentRow][2] == theSeed
	              || board[0][currentCol] == theSeed      // 3-in-the-column
	                   && board[1][currentCol] == theSeed
	                   && board[2][currentCol] == theSeed
	              || currentRow == currentCol            // 3-in-the-diagonal
	                   && board[0][0] == theSeed
	                   && board[1][1] == theSeed
	                   && board[2][2] == theSeed
	              || currentRow + currentCol == 2  // 3-in-the-opposite-diagonal
	                   && board[0][2] == theSeed
	                   && board[1][1] == theSeed
	                   && board[2][0] == theSeed);
	   }
	
	
}
