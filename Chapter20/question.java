import java.util.Random;

class question{
	public static void main(String[] args){
		int[] forA = new int[5];
		int[] forB = new int[5];
		int sumA = 0;
		int sumB = 0;
		Random rand = new Random();
	
		for(int i=0; i<5; i++){
			forA[i]=rand.nextInt(5)+1;
			sumA += forA[i];
		}
		for(int j=0; j<5; j++){
			forB[j]=rand.nextInt(5)+1;
			sumB += forB[j];
		}

		System.out.print("A: ");
		for(int i=0; i<5; i++){
			System.out.print(forA[i]+" ");
		}
		System.out.print(" sum : "+sumA);
		System.out.println();

		System.out.print("B: ");
		for(int i=0; i<5; i++){
			System.out.print(forB[i]+" ");
		}
		System.out.print(" sum : "+sumB);
		System.out.println();
		if(sumA>sumB){
			System.out.println("A wins");
		}
		else if(sumA==sumB){
			System.out.println("draw");
		}
		else{
			System.out.println("B wins");
		}
	}
}
		