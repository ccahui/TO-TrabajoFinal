package laboratorio5.list;

public class PrinterList {

	public void show(IList list) {
			for(int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i)+" --> ");
			}
			System.out.println();
	}
	

}
