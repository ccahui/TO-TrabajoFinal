package laboratorio6.treEnRaya;

public class Jugador {
	
	private char ficha;
	
	public Jugador () {
		this.ficha = 'X';
	}
	
	public Jugador(char ficha) {
		this.ficha = ficha;
	}
	
	public Jugador(Jugador jugador) {
		this.ficha = jugador.getFicha();
	}
	public char getFicha() {
		return ficha;
	}
	public void setFicha(char ficha) {
		this.ficha = ficha;
	}
	

}
