package laboratorio7;

import laboratorio5.list.IList;
import laboratorio5.list.SListArray;
import laboratorio5.stack.IStack;
import laboratorio5.stack.Stack;

public class Main {

	public static void main(String[] args) {

		IList<Integer> slistArray = new SListArray<Integer>();
		slistArray.insert(5);
		slistArray.insert(8);

		ListFormatPrinter printerList = new ListXMLPrinter();
		printerList.print(slistArray);

		IStack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(8);
		stack.push(9);

		StackFormatPrinter printerStack = new StackHTMLPrinter();
		printerStack.print(stack);
	}
}
