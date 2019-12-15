package basura;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import laboratorio5.Printer;

public class WriterList extends Writer{

	
	public WriterList(Printer printer) {
		super(printer);
	}
	
	@Override
	public void formatoXML() {
			FileWriter fileWriter;
			try {
				fileWriter = new FileWriter("lista.xml");
				PrintWriter printWriter = new PrintWriter(fileWriter);
			    printWriter.print(printer.toStringXML());
			    printWriter.close();	
			    
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
	}

	@Override
	public void formatoJSON() {
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter("lista.json");
			PrintWriter printWriter = new PrintWriter(fileWriter);
		    printWriter.print(printer.toStringJSON());
		    printWriter.close();	
		    
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void formatoHTML() {
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter("lista.html");
			PrintWriter printWriter = new PrintWriter(fileWriter);
		    printWriter.print(printer.toStringHTML());
		    printWriter.close();	
		    
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}		
	}
}
