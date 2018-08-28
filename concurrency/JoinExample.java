package examples.concurrency;

public class JoinExample {
	public static void main(String[] args) throws InterruptedException
	   {
	      Thread t1 = new Thread(new Runnable()
	         {
	            public void run()
	            {
	               System.out.println("First task started");
	               System.out.println("First task completed");
	            }
	         });
	      Thread t2 = new Thread(new Runnable()
	         {
	            public void run()
	            {
	               System.out.println("Second task completed");
	            }
	         });
	      t1.start(); // Line 15
	      t1.join(); // Line 16
	      t2.start();
	      //t1.join();
	   }
}
