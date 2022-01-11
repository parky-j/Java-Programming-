import java.util.Deque;
import java.util.ArrayDeque;

class ArrayDequeCollection{
	public static void main(String[] args){
		Deque<String> deq = new ArrayDeque<>();
		deq.offerFirst("Box");
		deq.offerFirst("Cat");
		deq.offerFirst("Robot");

		System.out.println("next: "+deq.peekFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());

		System.out.println("next: "+deq.peekFirst());
		System.out.println(deq.pollFirst());
	}
}
		