package laboratorio8;

import laboratorio5.list.DList;
import laboratorio5.list.IList;
import laboratorio5.list.SList;
import laboratorio5.list.SListArray;
import laboratorio5.stack.IStack;
import laboratorio5.stack.Stack;

public class Main {

	public static void main(String[] args) {

		IList<Integer> slistArray = new SListArray<Integer>();
		slistArray.insert(5);
		slistArray.insert(8);

		IList<Integer> listaDoble = new DList<Integer>();
		listaDoble.insert(150);
		listaDoble.insert(15);
		listaDoble.insert(1);
		
		IList<Integer> listaSimple = new SList<Integer>();
		listaSimple.insert(15);
		listaSimple.insert(15);
		listaSimple.insert(15);
		
		ListFormatPrinter printerList = new ListXMLPrinter();
		printerList.print(slistArray);
		System.out.println();
		printerList.print(listaDoble);
		System.out.println();
		printerList.print(listaSimple);
		
	}
}
