package basura;

import laboratorio5.Printer;

public abstract class Writer {
	protected Printer printer;
	
	public Writer(Printer printer) {
		this.printer = printer;
	}
	
	public abstract void formatoXML();
	public abstract void formatoJSON();
	public abstract void formatoHTML();

}
