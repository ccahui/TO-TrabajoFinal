package laboratorio6.battleShip;

public class Jugador {
	
	private String nombre;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
	}
	
	public Jugador(Jugador jugador) {
		this.nombre = jugador.getNombre();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
