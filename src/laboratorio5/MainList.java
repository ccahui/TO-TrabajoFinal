package laboratorio5;

import laboratorio5.list.*;

public class MainList {

	public static void main(String[] args) {
	
		/*LIST ARRAY SIMPLE*/
		IList<Integer> slistArray = new SListArray<Integer>();
		slistArray.insert(5);
		slistArray.insert(8);
		
		
		Printer print = new PrinterList(slistArray);
		System.out.println("----XML----");
		print.formatoXML();
		
		System.out.println("----JSON----");
		print.formatoJSON();
		
		System.out.println("----HTML----");
		print.formatoHTML();
	
	}


}
