package laboratorio6.treEnRaya;


public class Tablero {
	private static final char VACIO = ' ';
	
	char [][] array;
	private int filas;
	private int columnas;
	
	public Tablero(int filas, int columnas) {
		this.filas = filas;
		this.columnas = columnas;
		this.inicializarTablero();
	}
	
	public Tablero() {
		this.filas = 3;
		this.columnas = 3;
		this.inicializarTablero();
	}
	
	private void inicializarTablero() {
		this.array = new char[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				array[i][j] = VACIO;
			}
		}
	}
	
	public void insertar(Cordenada coordenada, char elemento) {
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
	
	public char getElemento(Cordenada coordenada) {
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
	            System.out.println("-----------"); 
	         }
	      }
	      System.out.println();
	}
	
	public void printContenido(char content) {
		System.out.print(" "+content+" ");
	}
	
	
	
	
}
