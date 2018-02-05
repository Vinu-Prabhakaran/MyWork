package com.vinu.learn;

class ChildThread implements Runnable{
	Thread t;
	
	public ChildThread(int p) {
		t=new Thread(this,"ChildThread");
		t.setPriority(p);
		System.out.println("Thread Created "+t);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(t+" loop :"+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Child Thread "+t+" Interrupted...");
		}
	};
	
}

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread obj1 = new ChildThread(Thread.NORM_PRIORITY - 2);
		ChildThread obj2 = new ChildThread(Thread.NORM_PRIORITY + 2);
		ChildThread obj3 = new ChildThread(Thread.NORM_PRIORITY + 3);
		
		//Starting Threads with different priorities
		obj1.t.start();
		obj2.t.start();
		obj3.t.start();
		try {
			System.out.println("Main Thread is waiting for child threads to finish...");
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}finally {
			System.out.println(obj1.t+" is alive ?"+obj1.t.isAlive());
			System.out.println(obj2.t+" is alive ?"+obj2.t.isAlive());
			System.out.println(obj3.t+" is alive ?"+obj3.t.isAlive());
			System.out.println("Main thread exiting...");
		}
	}

}
