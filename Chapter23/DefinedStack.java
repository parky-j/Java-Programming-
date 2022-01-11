import java.util.Deque;
import java.util.ArrayDeque;

interface DIStack<E>{
	public boolean push(E item);
	public E pop();
}

class DCStack<E> implements DIStack<E>{
	private Deque<E> deq;

	public DCStack(Deque<E> d){
		deq = d;
	}
	public boolean push(E item){
		return deq.offerFirst(item);
	}
	public E pop(){
		return deq.pollFirst();
	}
}
class DefinedStack{
	public static void main(String[] args){
		DIStack dis = new DCStack(new ArrayDeque<String>());
		dis.push("Box");
		dis.push("Cat");
		dis.push("Robot");
		
		System.out.println(dis.pop());
		System.out.println(dis.pop());
		System.out.println(dis.pop());
	}
}