package laboratorio6.battleShip;


public class Tablero {
	private static final int VACIO = 0;
	
	private int [][] array;
	private int filas;
	private int columnas;
	
	public Tablero(int filas, int columnas) {
		this.filas = filas;
		this.columnas = columnas;
		this.array = new int[filas][columnas]; 
	}
	
	public Tablero() {
		this.filas = 3;
		this.columnas = 3;
		this.array = new int[filas][columnas];
	}
	
	public void insertar(Cordenada coordenada, int elemento) {
		int x = coordenada.getX();
		int y = coordenada.getY();
		array[x][y] = elemento;
	}
	
	public boolean estaVacioLaPosicion(Cordenada coordenada) {
		int x = coordenada.getX();
		int y = coordenada.getY();

		if(array[x][y] == VACIO) {
			return true;
		}
		return false;
	}
	
	public int getElemento(Cordenada coordenada) {
		int x = coordenada.getX();
		int y = coordenada.getY();
		return array[x][y];
	}
	
	public int getFilas() {
		return filas;
	}
	
	public void setFilas(int filas) {
		this.filas = filas;
	}
	
	public int getColumnas() {
		return columnas;
	}
	
	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}
	
	public void printTablero() {
		for (int row = 0; row < filas; ++row) {
	         for (int col = 0; col < columnas; ++col) {
	            printContenido(array[row][col]); 
	            if (col != columnas - 1) {
	               System.out.print("|");   
	            }
	         }
	         System.out.println();
	         if (row != filas - 1) {
	            System.out.println("--------------------"); 
	         }
	      }
	      System.out.println();
	}
	
	public void printContenido(int content) {
		System.out.print(" "+content+" ");
	}
	
}
