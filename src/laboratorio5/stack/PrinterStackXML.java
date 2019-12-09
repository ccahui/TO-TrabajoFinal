package laboratorio5.stack;

import laboratorio5.list.IList;

public class PrinterStackXML {
	

	public void print(IStack list) {
		System.out.println("<stack>");
		printEtiquetaSize(list.size());
		System.out.println("\t<items>");
		for(int i = 0; i < list.size(); i++) {
			printEtiquetaItem(list.get(i));
	}
		System.out.println("\t</items>");
			System.out.println("</stack>");	
	}
	private void printEtiquetaSize(int size) {
		System.out.println("\t<size>"+size+"</size");	
	}
	
	private void printEtiquetaItem(Object item) {
		System.out.println("\t\t<item>"+item+"</item>");		
	}
	
	private void printConEtiqueta(String etiqueta, String contenido) {
		System.out.println("<"+etiqueta+">"+contenido+"</"+etiqueta+">");
	}
	
}
