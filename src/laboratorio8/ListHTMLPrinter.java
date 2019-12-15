package laboratorio8;

import laboratorio5.list.CList;
import laboratorio5.list.DList;
import laboratorio5.list.IList;
import laboratorio5.list.SList;
import laboratorio5.list.SListArray;

public class ListHTMLPrinter implements ListFormatPrinter{

	@Override
	public void print(IList lista) {
		System.out.println(toString(lista));
	}

	@Override
	public String toString(IList list) {
		
		if(list instanceof SListArray) {
			return tipoDeLista("lista-simple-array", list);
		}
		if(list instanceof CList) {
			return tipoDeLista("lista-circular", list);
		}
		if(list instanceof DList) {
			return tipoDeLista("lista-doble", list);
		}
		if(list instanceof SListArray) {
			return tipoDeLista("lista-simple-array", list);
		}
		if(list instanceof SList) {
			return tipoDeLista("lista-simple", list);
		}
		return "";
	}
	
	private String tipoDeLista(String ETIQUETA_TITULO, IList list) {
		
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
