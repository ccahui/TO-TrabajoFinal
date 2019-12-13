package laboratorio5;

public abstract class Printer {

	public abstract void printXML();
	public abstract void printJSON();
	public abstract void printHTML();
	
	public abstract String toStringXML();
	public abstract String toStringJSON();
	public abstract String toStringHTML();
	
	protected String etiquetaConContenido(String etiqueta, Object contenido) {
		return abrirEtiqueta(etiqueta) + contenido.toString() + cerrarEtiqueta(etiqueta);
	}

	protected String abrirEtiqueta(String etiqueta) {
		return "<" + etiqueta + ">";
	}

	protected String cerrarEtiqueta(String etiqueta) {
		return "</" + etiqueta + ">";
	}

	protected String agregarComillas(Object texto) {
		return "\"" + texto.toString() + "\"";
	}

	protected String claveValorJson(String clave, Object valor) {
		return agregarComillas(clave) + ":" + agregarComillas(valor);
	}
}
