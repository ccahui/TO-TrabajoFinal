package laboratorio6.writerReader;

import laboratorio5.list.IList;
import laboratorio5.list.SList;


public class ReaderList implements Reader{

	private String file;

	public ReaderList(String file) {
		this.file = file;
	}

	public IList read() {

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

	private IList readFormatoHTML() {
		IList list = new SList();
		return list;
	}

	private IList readFormatoXML() {
		IList list = new SList();
		return list;
	}

	private IList readFormatoJSON() {
		IList list = new SList();
		return list;
	}

	@Override
	public String getFile() {
		// TODO Auto-generated method stub
		return file;
	}

}
