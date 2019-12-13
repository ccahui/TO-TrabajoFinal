package laboratorio5;

import laboratorio5.stack.*;

public class MainStack {

	public static void main(String[] args) {
		
		//STACK
		IStack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(8);
		stack.push(9);	
		
		Printer print = new PrinterStack(stack);
		System.out.println("----XML----");
		print.printXML();
		
		System.out.println("----JSON----");
		print.printJSON();
		
		System.out.println("----HTML----");
		print.printHTML();

	}
}
