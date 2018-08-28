package examples.concurrency;

public class YeildExample {
	public static void main(String[] args)
	   {
	      Thread producer = new Thread1();
	      Thread consumer = new Thread2();
	       
	      producer.setPriority(Thread.MIN_PRIORITY); //Min Priority
	      consumer.setPriority(Thread.MAX_PRIORITY); //Max Priority
	       
	      producer.start();
	      consumer.start();
	   }
	}
	 
	class Thread1 extends Thread
	{
	   public void run()
	   {
	      for (int i = 1; i < 10; i = i+2)
	      {
	         System.out.println("I am Thread1 " + i);
	         Thread.yield();
	      }
	   }
	}
	 
	class Thread2 extends Thread
	{
	   public void run()
	   {
	      for (int i = 2; i < 11; i = i+2)
	      {
	         System.out.println("I am Thread2 " + i);
	         Thread.yield();
	      }
	   }
}
