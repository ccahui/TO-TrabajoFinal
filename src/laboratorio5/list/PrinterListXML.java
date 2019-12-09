package laboratorio5.list;

public class PrinterListXML {

	public void print(IList list) {
		System.out.println("<list>");
		printEtiquetaSize(list.size());
		System.out.println("\t<items>");
		for(int i = 0; i < list.size(); i++) {
			printEtiquetaItem(list.get(i));
	}
		System.out.println("\t</items>");
			System.out.println("</list>");	
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
