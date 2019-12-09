package laboratorio5.stack;

public class PrinterStack {
	
	public void show(IStack stack) {
			for(int i = 0; i < stack.size(); i++) {
						System.out.println(stack.get(i));
			}
			System.out.println();
}
}

