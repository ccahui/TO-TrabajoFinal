package laboratorio8;

import laboratorio5.stack.IStack;
import laboratorio5.stack.Stack;
import laboratorio5.stack.StackArray;

public class StackJSONPrinter implements StackFormatPrinter {
	
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
