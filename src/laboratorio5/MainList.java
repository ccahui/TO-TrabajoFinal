package laboratorio5;

import laboratorio5.list.*;

public class MainList {

	public static void main(String[] args) {
	
		/*LIST ARRAY SIMPLE*/
		IList<Integer> slistArray = new SListArray<Integer>();
		slistArray.insert(5);
		slistArray.insert(8);
		
		PrinterList  printer = new PrinterList();
		printer.show(slistArray);
		
		
		
		
		
	}
}
