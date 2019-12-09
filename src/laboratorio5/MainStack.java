package laboratorio5;

import laboratorio5.stack.*;

public class MainStack {

	public static void main(String[] args) {
		
		//STACK
		IStack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(8);
		stack.push(9);
		
		//STACK ARRAY
		IStack<Integer> stackArray = new StackArray<Integer>();
		stackArray.push(9);
		stackArray.push(10);
		stackArray.push(90);
	
		PrinterStack printer = new PrinterStack();
		printer.show(stackArray);
		printer.show(stack);

	}
}
