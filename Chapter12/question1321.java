import java.util.Scanner;
class DArr{
	public static void addOneArr(int[] arr, int add){
		for(int i=0; i<arr.length; i++)
			arr[i] += add;
	}
	public static void addTwoArr(int[][] arr, int add){
		for(int j=0; j<arr.length; j++){
			addOneArr(arr[j], add);
		}
	}
}

class question1321{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("how much do you wanna increase? : ");
		int a = sc.nextInt();
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<arr.length; i++){
			for(int j=0;  j<arr[i].length; j++)
				System.out.print(arr[i][j]+"\t");
			System.out.println();
		}
		System.out.println("\n"+"it became..."+"\n");
		DArr.addTwoArr(arr,a);
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length;j++)
				System.out.print(arr[i][j]+"\t");
			System.out.println();
		}
	}
}