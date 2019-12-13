package laboratorio5;

import laboratorio5.stack.IStack;

public class PrinterStack extends Printer {

	private final String ETIQUETA_TITULO = "stack";
	private final String ETIQUETA_SIZE = "size";
	private final String ETIQUETA_ELEMENTOS = "items";
	private final String ETIQUETA_ELMENTO = "items";

	private IStack stack;

	public PrinterStack( IStack stack) {
		this.stack = stack;
	}

	@Override
	public void printJSON() {
		System.out.println(toStringJSON());
	}

	@Override
	public void printHTML() {
		System.out.println(toStringXML());
	}

	@Override
	public String toStringXML() {
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

	@Override
	public String toStringJSON() {
		
		StringBuilder json = new StringBuilder();
		
		json.append("{");
		json.append("\n");
		
		json.append("\t" + agregarComillas(ETIQUETA_SIZE) + ":" + stack.size() + ",");
		json.append("\n");
		
		json.append("\t" + agregarComillas(ETIQUETA_ELEMENTOS) + ":[");
		json.append("\n");
		for (int i = 0; i < stack.size(); i++) {
			json.append("\t\t" + claveValorJson(ETIQUETA_ELMENTO, stack.get(i)));
			json.append("\n");
		}
		json.append("\t]");
		json.append("\n");
		json.append("}");
		
		return json.toString();
	}

	@Override
	public String toStringHTML() {
		
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

	@Override
	public void printXML() {
		// TODO Auto-generated method stub
		
	}
}
