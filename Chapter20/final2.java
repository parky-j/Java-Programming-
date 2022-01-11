import java.util.Arrays;

class Students implements Comparable{
	int num;
	String name;
	String attendance;
	int score;
	public Students(int num, String name, String att, int score){
		this.num = num;
		this.name = name;
		attendance = att;
		this.score = score;
	}
	@Override
	public String toString(){
		return num+" "+name;
	}
	@Override
	public int compareTo(Object o){
		Students st = (Students)o;
		return this.num - st.num;
	}
}

class final2{
	public static void main(String[] args){
		int sumScore=0;
		Students[] st ={new Students(201411111, "lim js", "a", 100),new Students(201811111, "kim js", "a", 89),
			       (new Students(201211111, "lee js", "a", 65)),new Students(201511111, "choi js", "b", 66),
			       (new Students(201311111, "park js", "b", 80))};

		for(int i=0; i<5; i++){
			System.out.println(st[i]);
		}
		System.out.println();

		for(int i=0; i<5; i++){
			if(st[i].attendance=="a"){
				System.out.println(st[i]);
			}
		}
		System.out.println();

		Arrays.sort(st);
		for(int i=0; i<5; i++){
			System.out.println(st[i]);
		}
		System.out.println();
		for(int i=0; i<5; i++){
			sumScore += st[i].score;
		}

		for(int i=0; i<5; i++){
			System.out.print(st[i]+"  ");
			System.out.println(st[i].score);
		}
		System.out.println("                        "+sumScore);
	}
}