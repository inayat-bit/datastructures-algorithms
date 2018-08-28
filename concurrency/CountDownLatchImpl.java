package examples.concurrency;

public class CountDownLatchImpl {
	int count;
	public CountDownLatchImpl(int count) {
		this.count = count;
	}
	
	public synchronized void await() {
		if(count > 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void countDown() {
		count--;
		if(count == 0)
			this.notifyAll();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
