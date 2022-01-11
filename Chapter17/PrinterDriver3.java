interface Printable{
	void print(String doc);
}

interface ColorPrintable extends Printable{
	void printCMYK(String doc);
}

class Prn204Drv implements ColorPrintable{
	@Override
	public void print(String doc){
		System.out.println("From MD-204 printer");
		System.out.println(doc);
	}
	@Override
	public void printCMYK(String doc){
		System.out.println("From MD-204 colorprinter");
		System.out.println(doc);
	}	
}

class Prn731Drv implements Printable{
	@Override
	public void print(String doc){
		System.out.println("From MD-731 printer");
		System.out.println(doc);
	}
}

class PrinterDriver3{
	public static void main(String[] args){
		String myDoc = "This is a report about...";
		
		ColorPrintable prn = new Prn204Drv();
		prn.print(myDoc);
		prn.printCMYK(myDoc);
		System.out.println();
	}
}