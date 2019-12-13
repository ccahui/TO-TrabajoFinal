package laboratorio6.writerReader;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import laboratorio5.Printer;

public class WriterStack extends Writer{

	public WriterStack(Printer printer) {
		super(printer);
	}
	
	@Override
	public void formatoXML() {
			FileWriter fileWriter;
			try {
				fileWriter = new FileWriter("stack.xml");
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
			fileWriter = new FileWriter("stack.json");
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
			fileWriter = new FileWriter("stack.html");
			PrintWriter printWriter = new PrintWriter(fileWriter);
		    printWriter.print(printer.toStringJSON());
		    printWriter.close();	
		    
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}		
	}
}
