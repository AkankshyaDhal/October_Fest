import java.util.ArrayDeque;
public class LearnArrayDeque 
{

	public static void main(String[] args) 
	{
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(23);//from queue
		adq.offerFirst(30);//from arraydeque
		adq.offerLast(45);//from arraydeque
		adq.offer(65);
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		adq.poll();
		System.out.println(adq);
		adq.pollFirst();
		System.out.println(adq);
		/**
		 * A stack can also be implemented LIFO
		 * elements enter at last first element out by pollLast()
		 */
		adq.pollLast();
		System.out.println(adq);
		
	}

}
