package laboratorio8;

import laboratorio5.list.IList;
import laboratorio5.stack.IStack;
import laboratorio5.stack.Stack;
import laboratorio5.stack.StackArray;

public class StackHTMLPrinter implements StackFormatPrinter{

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
		StringBuilder html = new StringBuilder();
		String header = "HEADER";
		String body = "BODY";
		String ul = "ul";
		String li = "li";
		String title = "TITLE";
		String h1 = "h1";
		
        html.append(abrirEtiqueta("HTML"));
		html.append("\n");

		html.append("\t" + abrirEtiqueta(header));
		html.append("\n");
    
		html.append("\t\t" + etiquetaConContenido(title, ETIQUETA_TITULO));
		html.append("\n");
        
		html.append("\t" + cerrarEtiqueta(header));
		html.append("\n");
        
		html.append("\t" + abrirEtiqueta(body));
		html.append("\n");
        
		html.append("\t\t" + etiquetaConContenido(h1, ETIQUETA_TITULO));
		html.append("\n");
        
		html.append("\t\t" + abrirEtiqueta(ul));
		html.append("\n");
        for (int i = 0; i < stack.size(); i++) {
        	html.append("\t\t\t" + etiquetaConContenido(li, stack.get(i)));
        	html.append("\n");
        }

        html.append("\t\t</ul>");
		html.append("\n");
		
        html.append("\t</body>");
		html.append("\n");
        html.append(cerrarEtiqueta("HTML"));
		
		return html.toString();
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
