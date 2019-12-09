package laboratorio6.treEnRaya;

public class Cordenada {

	private int x;
	private int y;
	
	public Cordenada(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public  Cordenada(Cordenada cordenada) {
		this.x  = cordenada.getX();
		this.y = cordenada.getY();
	}
	
	public Cordenada() {
		this.x = 0;
		this.y = 0;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
}
