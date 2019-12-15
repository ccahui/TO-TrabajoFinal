package laboratorio7;

import laboratorio5.list.IList;

public class ListJSONPrinter implements ListFormatPrinter {
	
	@Override
	public void print(IList lista) {

	System.out.println(toString(lista));
	}

	@Override
	public String toString(IList list) {
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
