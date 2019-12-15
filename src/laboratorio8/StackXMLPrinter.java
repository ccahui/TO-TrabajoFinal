package laboratorio8;

import laboratorio5.list.IList;
import laboratorio5.stack.IStack;
import laboratorio5.stack.Stack;
import laboratorio5.stack.StackArray;

public class StackXMLPrinter implements StackFormatPrinter {

	
	@Override
	public void print(IStack stack) {
		System.out.println(toString(stack));
		
	}

	@Override
	public String toString(IStack stack) {
		
		if(stack instanceof StackArray) {
			return tipoDeStack("stack-array", stack);
		}
		if(stack instanceof Stack) {
			return tipoDeStack("stack", stack);
		}
		return "";
		
	}
	
	private String tipoDeStack(String ETIQUETA_TITULO, IStack stack) {
StringBuilder xml = new StringBuilder();
		
		xml.append(abrirEtiqueta(ETIQUETA_TITULO));
		xml.append("\n");
		
		xml.append("\t" + etiquetaConContenido(ETIQUETA_SIZE, stack.size()));
		xml.append("\n");
		
		xml.append("\t" + abrirEtiqueta(ETIQUETA_ELEMENTOS));
		xml.append("\n");
		
		for (int i = 0; i < stack.size(); i++) {
			xml.append("\t\t" + etiquetaConContenido(ETIQUETA_ELMENTO, stack.get(i)));
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
