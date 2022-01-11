import java.util.Random;

class mid{
	public static void main(String[] args){
		Random rand = new Random();
		int[] aDice = new int[5];
		int[] bDice = new int[5];
		int aSum=0;
		int bSum=0;
	
		for(int i=0; i<5; i++){
			aDice[i]=rand.nextInt(6)+1;
			bDice[i]=rand.nextInt(6)+1;
			
			aSum+=aDice[i];
			bSum+=bDice[i];
		}
		System.out.print("A: ");
		for(int i=0; i<5; i++){
			System.out.print(aDice[i]+"  ");
		}
		System.out.println("sum: "+aSum);
		System.out.print("B: ");
		for(int i=0; i<5; i++){
			System.out.print(bDice[i]+"  ");
		}
		System.out.println("sum: "+bSum);
		if(aSum>bSum)
			System.out.println("A wins");
		else
			System.out.println("B wins");
	}
}
		