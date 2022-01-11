import java.util.Scanner;
import java.util.Random;

class question201{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int A = 0;
		int Z = 0;
		int[] rInt = new int[10];

		System.out.print("A...? ");
		A=sc.nextInt();
		System.out.print("Z...? ");
		Z=sc.nextInt();
		
		for(int i=0; i<10; i++){
			if(A>Z){
				rInt[i] = rand.nextInt(A-Z+1)+Z;
			}
			else{
				rInt[i] = rand.nextInt(Z-A+1)+A;
			}
			System.out.print(rInt[i]+" ");
		}
	}
}