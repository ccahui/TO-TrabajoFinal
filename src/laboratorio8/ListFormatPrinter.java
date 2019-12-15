package laboratorio8;

import laboratorio5.list.IList;

public interface ListFormatPrinter {
	
	public final String ETIQUETA_TITULO = "lista";
	public  final String ETIQUETA_SIZE = "size";
	public final String ETIQUETA_ELEMENTOS = "items";
	public final String ETIQUETA_ELMENTO = "item";
	
	public void print(IList lista);
	public String toString(IList lista);
}
