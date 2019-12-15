package laboratorio7;

import laboratorio5.stack.IStack;

public class StackJSONPrinter implements StackFormatPrinter {
	
	@Override
	public void print(IStack stack) {

	System.out.println(toString(stack));
	}

	@Override
	public String toString(IStack stack) {
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
	
	private String agregarComillas(Object texto) {
		return "\"" + texto.toString() + "\"";
	}

	protected String claveValorJson(String clave, Object valor) {
		return agregarComillas(clave) + ":" + agregarComillas(valor);
	}
	
	
}
