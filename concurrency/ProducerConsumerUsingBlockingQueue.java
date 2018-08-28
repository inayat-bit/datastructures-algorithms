package examples.concurrency;

  class Producer1 implements Runnable {
	  BlockingQueueImpl sharedQueue;
	  
	  Producer1(BlockingQueueImpl sharedQueue) {
		  this.sharedQueue = sharedQueue;
	  }

	@Override
	public void run() {
		for (int i =0; i<10; i++) {
			try {
				sharedQueue.enqueue(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Produce "+i);
		}
		
	}
	  
  }
  
  class Consumer1 implements Runnable {
	  BlockingQueueImpl sharedQueue;
	  
	  Consumer1(BlockingQueueImpl sharedQueue) {
		  this.sharedQueue = sharedQueue;
	  }

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consume "+sharedQueue.dequeue());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	  
  }
  
  public class ProducerConsumerUsingBlockingQueue {

	public static void main(String[] args) {
		BlockingQueueImpl sharedQueue = new BlockingQueueImpl();
		Thread producer = new Thread(new Producer1(sharedQueue));
		Thread consumer = new Thread(new Consumer1(sharedQueue));
		producer.start();
		consumer.start();

	}

  }
 