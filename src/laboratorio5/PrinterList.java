package laboratorio5;

import laboratorio5.list.IList;

public class PrinterList extends Printer {

	private final String ETIQUETA_TITULO = "lista";
	private final String ETIQUETA_SIZE = "size";
	private final String ETIQUETA_ELEMENTOS = "items";
	private final String ETIQUETA_ELMENTO = "item";

	private IList list;

	public PrinterList(IList lista) {
		this.list = lista;
	}
	
	@Override
	public void printXML() {
	System.out.println(toStringXML());
		
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
		
		xml.append("\t" + etiquetaConContenido(ETIQUETA_SIZE, list.size()));
		xml.append("\n");
		
		xml.append("\t" + abrirEtiqueta(ETIQUETA_ELEMENTOS));
		xml.append("\n");
		
		for (int i = 0; i < list.size(); i++) {
			xml.append("\t\t" + etiquetaConContenido(ETIQUETA_ELMENTO, list.get(i)));
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
		
		json.append("\t" + agregarComillas(ETIQUETA_SIZE) + ":" + list.size() + ",");
		json.append("\n");
		
		json.append("\t" + agregarComillas(ETIQUETA_ELEMENTOS) + ":[");
		json.append("\n");
		for (int i = 0; i < list.size(); i++) {
			json.append("\t\t" + claveValorJson(ETIQUETA_ELMENTO, list.get(i)));
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
        for (int i = 0; i < list.size(); i++) {
        	html.append("\t\t\t" + etiquetaConContenido(li, list.get(i)));
        	html.append("\n");
        }

        html.append("\t\t</ul>");
		html.append("\n");
		
        html.append("\t</body>");
		html.append("\n");
        html.append(cerrarEtiqueta("HTML"));
		
		return html.toString();
	}
}
