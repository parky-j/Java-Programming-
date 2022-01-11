import java.util.*;

class final2{
	public static void main(String[] args){
		String s1 ="As I stand in this plaza with many of our citizens "+
"today to commemorate the 30th Anniversary of the June 10 Democratic Struggle, "+
"my heart is indeed filled with deep emotions. People, ranging from teenagers to "+
"elders in their 70s, from Jeju to Seoul and from the southeastern part of Korea to "+
"the southwestern part of the country, shouted with one voice for constitutional revision "+
"and the end of dictatorship. Their fervent chant is still ringing vividly in my ears. "+
"In June, 30 years ago, we showed our greatness as a people. In June, 30 years ago, we witnessed the victory of the people.";
		
		String s = s1.toLowerCase();
		StringTokenizer st = new StringTokenizer(s, " ");
		String[] tk = new String[st.countTokens()];
		int i =0;
		while(st.hasMoreTokens()){
			tk[i] = st.nextToken();
			i++;
		}
		System.out.println(tk[0]);
	}
}