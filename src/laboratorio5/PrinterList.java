package laboratorio5;

import laboratorio5.list.IList;

public class PrinterList implements Printer {

	private final String ETIQUETA_TITULO = "lista";
	private final String ETIQUETA_SIZE = "size";
	private final String ETIQUETA_ELEMENTOS = "items";
	private final String ETIQUETA_ELMENTO = "items";

	private IList list;

	public PrinterList(IList lista) {
		this.list = lista;
	}

	@Override
	public void formatoXML() {
		System.out.println(abrirEtiqueta(ETIQUETA_TITULO));
		System.out.println("\t" + etiquetaConContenido(ETIQUETA_SIZE, list.size()));
		System.out.println("\t" + abrirEtiqueta(ETIQUETA_ELEMENTOS));
		for (int i = 0; i < list.size(); i++) {
			System.out.println("\t\t" + etiquetaConContenido(ETIQUETA_ELMENTO, list.get(i)));
		}
		System.out.println("\t" + cerrarEtiqueta(ETIQUETA_ELEMENTOS));
		System.out.println(cerrarEtiqueta(ETIQUETA_TITULO));
		System.out.println();
	}

	@Override
	public void formatoJSON() {

		System.out.println("{");
		System.out.println("\t" + agregarComillas(ETIQUETA_SIZE) + ":" + list.size() + ",");
		System.out.println("\t" + agregarComillas(ETIQUETA_ELEMENTOS) + ":[");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("\t\t" + claveValorJson(ETIQUETA_ELMENTO, list.get(i)));
		}
		System.out.println("\t]");
		System.out.println("}");
		System.out.println();
	}

	@Override
	public void formatoHTML() {

		String html = "HTML";
		String header = "HEADER";
		String body = "BODY";
		String ul = "ul";
		String li = "li";
		String title = "TITLE";
		String h1 = "h1";

		System.out.println(abrirEtiqueta(html));
		System.out.println("\t" + abrirEtiqueta(header));
		System.out.println("\t\t" + etiquetaConContenido(title, ETIQUETA_TITULO));
		System.out.println("\t" + cerrarEtiqueta(header));
		System.out.println();
		System.out.println("\t" + abrirEtiqueta(body));
		System.out.println("\t\t" + etiquetaConContenido(h1, ETIQUETA_TITULO));
		System.out.println("\t\t" + abrirEtiqueta(ul));
		for (int i = 0; i < list.size(); i++) {
			System.out.println("\t\t\t" + etiquetaConContenido(li, list.get(i)));
		}
		System.out.println("\t\t</ul>");
		System.out.println("\t</body>");
		System.out.println("</html>");
		System.out.println(cerrarEtiqueta("HTML"));
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

	private String agregarComillas(Object texto) {
		return "\"" + texto.toString() + "\"";
	}

	private String claveValorJson(String clave, Object valor) {
		return agregarComillas(clave) + ":" + agregarComillas(valor);
	}
}
