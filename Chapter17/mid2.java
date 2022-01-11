
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

class mid2{
	public static void main(String[] args){
		LocalDate ld = new LocalDate.now();
		LocalTime lt = new LocalTime.now();
		
		//Duration between = Duration.between(ld,);
		System.out.println("Current time: "+ld+"  "+lt);
		System.out.println("Y2038: ");
		System.out.println();
	}
} 
