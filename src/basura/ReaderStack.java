package basura;

import laboratorio5.stack.IStack;
import laboratorio5.stack.StackArray;

public class ReaderStack implements Reader{

	private String file;

	public ReaderStack(String file) {
		this.file = file;
	}

	public IStack read() {

		
		String extensionFile = fileExtension();
		System.out.println("Procesando archivo "+extensionFile);

		switch (extensionFile) {
			case XML:
				return readFormatoXML();
	
			case HTML:
				return readFormatoHTML();
	
			case JSON:
				return readFormatoJSON();
	
			default:
				return null;
		}
	}

	private String fileExtension() {
		String extension = "";
		int i = file.lastIndexOf('.');

		if (i > 0) {
			extension = file.substring(i + 1);
		}
		return extension;
	}

	private IStack readFormatoHTML() {
		IStack stack = new StackArray();

		return stack;
	}

	private IStack readFormatoXML() {
		IStack stack = new StackArray();

		return stack;
	}

	private IStack readFormatoJSON() {
		IStack stack = new StackArray();
		return stack;
	}

	@Override
	public String getFile() {
		// TODO Auto-generated method stub
		return file;
	}

}
