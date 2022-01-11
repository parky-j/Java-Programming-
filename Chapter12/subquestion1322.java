import java.util.Arrays;
class foryou{
	public static int[][] changeArr(int[][] ar1){
		int[][] ar2=ar1;
		for(int i=0; i<ar1.length; i++){
			for(int j=0; j<ar1[i].length; j++){
				if(i<ar1.length)
					ar1[i][j]=ar2[i+1][j];
				else
					ar1[i][j]=ar2[1][j];
			}
		}
		return ar2;
	}
}

class question1322{
	public static void main(String[] args){
		foryou f = new foryou();
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
		f.changeArr(arr);
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
