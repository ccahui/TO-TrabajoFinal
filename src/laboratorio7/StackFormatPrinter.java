package laboratorio7;

import laboratorio5.stack.IStack;

public interface StackFormatPrinter {
	public final String ETIQUETA_TITULO = "stack";
	public  final String ETIQUETA_SIZE = "size";
	public final String ETIQUETA_ELEMENTOS = "items";
	public final String ETIQUETA_ELMENTO = "item";
	
	public void print(IStack stack);
	public String toString(IStack stack);
}
