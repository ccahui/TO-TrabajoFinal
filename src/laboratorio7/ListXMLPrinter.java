package laboratorio7;

import laboratorio5.list.IList;

public class ListXMLPrinter implements ListFormatPrinter {

	
	@Override
	public void print(IList lista) {
		System.out.println(toString(lista));
		
	}

	@Override
	public String toString(IList lista) {
		
		StringBuilder xml = new StringBuilder();
		
		xml.append(abrirEtiqueta(ETIQUETA_TITULO));
		xml.append("\n");
		
		xml.append("\t" + etiquetaConContenido(ETIQUETA_SIZE, lista.size()));
		xml.append("\n");
		
		xml.append("\t" + abrirEtiqueta(ETIQUETA_ELEMENTOS));
		xml.append("\n");
		
		for (int i = 0; i < lista.size(); i++) {
			xml.append("\t\t" + etiquetaConContenido(ETIQUETA_ELMENTO, lista.get(i)));
			xml.append("\n");
		}
		xml.append("\t" + cerrarEtiqueta(ETIQUETA_ELEMENTOS));
		xml.append("\n");
		
		xml.append(cerrarEtiqueta(ETIQUETA_TITULO));
		
		return xml.toString();
	}
	
	private String etiquetaConContenido(String etiqueta, Object contenido) {
		return abrirEtiqueta(etiqueta) + contenido.toString() + cerrarEtiqueta(etiqueta);
	}

	private String abrirEtiqueta(String etiqueta) {
		return "<" + etiqueta + ">";
	}

	private String cerrarEtiqueta(String etiqueta) {
		return "</" + etiqueta + ">";
	}

	
}
