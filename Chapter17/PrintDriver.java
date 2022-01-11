interface Printable{
	public void print(String doc);
}

class SPrinterDriver implements Printable{
	@Override
	public void print(String doc){
		System.out.println("From Samsung print");
		System.out.println(doc);
	}
}

class LPrinterDriver implements Printable{
	@Override	
	public void print(String doc){
		System.out.println("From LG print");
		System.out.println(doc);
	}
}

class PrintDriver{
	public static void main(String[] args){
		Printable sp = new SPrinterDriver();
		Printable lp = new LPrinterDriver();
		
		sp.print("Hi Bixby!");
		lp.print("OK Google!");
	}
}