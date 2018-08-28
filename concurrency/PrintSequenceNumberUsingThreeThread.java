package examples.concurrency;


class PrintSequenceNumber implements Runnable {
    private final int PRINT_NUMBER = 10;
    private int remainder;
    static int number = 1;
    static Object lock = new Object();
    public PrintSequenceNumber(int remainder) {
		this.remainder = remainder;
	}
    
	@Override
	public void run() {
		while (number < PRINT_NUMBER-1) {
			synchronized(lock) {
				while (number%3 != remainder) {
				  try {
					lock.wait();
				  } catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				  }
				}
				System.out.println(number+" "+Thread.currentThread().getName());
				number++;
				lock.notifyAll();
			}
		}
		
		
	}
	
	
}
public class PrintSequenceNumberUsingThreeThread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new PrintSequenceNumber(1), "T1");
		Thread t2 = new Thread(new PrintSequenceNumber(2), "T2");
		Thread t3 = new Thread(new PrintSequenceNumber(0), "T3");
		t1.start();
		t2.start();
		t3.start();

	}

  }
