interface Printable{
	public void print(String doc);
}

class Printer implements Printable{
	@Override
	public void print(String doc){
		System.out.println(doc);
	}
}

class PrintableInterface2{
	public static void main(String[] args){
		Printable prn = new Printer();
		prn.print("Hello World!");
		System.out.printf("%5s%5s","hi","hello");
	}
}