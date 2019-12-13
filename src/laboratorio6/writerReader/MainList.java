package laboratorio6.writerReader;

import laboratorio5.Printer;
import laboratorio5.PrinterList;
import laboratorio5.list.IList;
import laboratorio5.list.SListArray;

public class MainList {

	public static void main(String[] args) {
		
		/*LIST ARRAY SIMPLE*/
		IList<Integer> slistArray = new SListArray<Integer>();
		slistArray.insert(5);
		slistArray.insert(8);
		
		Printer print= new PrinterList(slistArray);
				
		Writer write = new WriterList(print);
		write.formatoXML();
		write.formatoJSON();
		write.formatoHTML();
	}
}
