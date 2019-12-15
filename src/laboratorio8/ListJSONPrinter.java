package laboratorio8;

import laboratorio5.list.CList;
import laboratorio5.list.DList;
import laboratorio5.list.IList;
import laboratorio5.list.SList;
import laboratorio5.list.SListArray;

public class ListJSONPrinter implements ListFormatPrinter {
	
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
	
	private String agregarComillas(Object texto) {
		return "\"" + texto.toString() + "\"";
	}

	protected String claveValorJson(String clave, Object valor) {
		return agregarComillas(clave) + ":" + agregarComillas(valor);
	}
	
	
}
