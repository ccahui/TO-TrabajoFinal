package laboratorio6.writerReader;

import laboratorio5.Printer;
import laboratorio5.PrinterStack;
import laboratorio5.stack.*;

public class MainStack {
public static void main(String[] args) {
		
		/*LIST ARRAY SIMPLE*/
		IStack<Integer> stack = new StackArray<Integer>();
		stack.push(5);
		stack.push(8);
		
		Printer print = new PrinterStack(stack);
		
		Writer write = new WriterStack(print);
		
		write.formatoXML();
		write.formatoJSON();
		write.formatoHTML();
		
		ReaderStack reader = new ReaderStack("stack.html");
		reader.read();
	}
}
