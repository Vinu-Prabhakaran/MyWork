/**
 * 
 */
package com.vinu.ocpchap7;

import java.util.concurrent.*;

/**
 * @author Vinu Prabhakaran
 *         on Jul 26, 2021
 *
 */

/*offer(E e, long timeout,TimeUnit unit) - Adds item to the queue waiting the specified time,
										 returning false if time elapses before space is available
poll(long timeout, TimeUnit unit)      - Retrieves and removes an item from the queue, waiting the specified time, 
										 returning null if the time elapses before the item is available
offerFirst(E e, long timeout			
					, TimeUnit unit)   - Adds an item to the front of the queue, waiting a specified time, 
										 returning false if time elapses before space is available
offerLast(E e, long timeout
		,TimeUnit unit)				   - Adds an item to the tail of the queue, waiting a specified time, 
										 returning false if time elapses before space is available*/
public class BlockingQueues {
	
	public static void main(String[] args) {
		
		try {
			BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
			blockingQueue.offer(39);
			blockingQueue.offer(3, 4, TimeUnit.SECONDS);
			
			System.out.println(blockingQueue.poll());
			System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
			
			BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
			blockingDeque.offer(10);
			System.out.println("After offer :"+blockingDeque);
			blockingDeque.offerFirst(20);
			blockingDeque.offerFirst(30);
			System.out.println("After offerFirst :"+blockingDeque);
			blockingDeque.offerLast(40);
			blockingDeque.offerLast(50);
			System.out.println("After offerLast :"+blockingDeque);
			System.out.println("Poll() :"+blockingDeque.poll());
			System.out.println("PollFirst() :"+blockingDeque.pollFirst());
			System.out.println("PollLast() :"+blockingDeque.pollLast());
			System.out.println("After pollLast :"+blockingDeque);
			System.out.println("Peek() :"+blockingDeque.peek());
			System.out.println("PeekFirst() :"+blockingDeque.peekFirst());
			System.out.println("PeekLast() :"+blockingDeque.peekLast());
			System.out.println("After peekLast :"+blockingDeque);

			

			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
