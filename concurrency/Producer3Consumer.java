package examples.concurrency;

import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

class Token {
  private UUID id;
  private int number;
  private String description;

  public UUID getId() {
	return id;
  }

  public void setId(UUID id) {
	this.id = id;
  }

  public int getNumber() {
	return number;
  }

  public void setNumber(int number) {
	this.number = number;
  }

  public String getDescription() {
	return description;
  }

  public void setDescription(String description) {
	this.description = description;
  }

  @Override
  public String toString() {
	return "Token [id=" + id + ", number=" + number + ", description=" + description + "]";
  }
}

class TokenVendingMachine implements Runnable {
    private BlockingQueue<Token> queue;
    
    public TokenVendingMachine(BlockingQueue<Token> queue) {
		this.queue = queue;
	}
    
	@Override
	public void run() {
	  for(int i = 0; i<100; i++) {
		  Token token = new Token();
		  token.setId(UUID.randomUUID());
		  token.setNumber(i);
		  token.setDescription("Some Description");
		  System.out.println("New Token issued");
		  queue.add(token);
	  }
		
	}
	
}

class TokenServiceCounter implements Runnable {
	
	private BlockingQueue<Token> queue;
	private CountDownLatch latch;
	
	public TokenServiceCounter(BlockingQueue<Token> queue, CountDownLatch latch) {
		this.queue = queue;
		this.latch = latch;
	}

	@Override
	public void run() {
		while(true) {
			if(latch.getCount() == 0)
				break;
			try {
				Token token = queue.take();
				System.out.println("Serving token: "+token);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				latch.countDown();
			}
		}
		
	}
	
}
public class Producer3Consumer {
	public static void main(String[] args) {
		BlockingQueue<Token> queue = new LinkedBlockingQueue<>();
		CountDownLatch latch = new CountDownLatch(100);
		TokenVendingMachine vendingMachine = new TokenVendingMachine(queue);
		new Thread(vendingMachine).start();
		TokenServiceCounter serviceCounter = new TokenServiceCounter(queue, latch);
		ExecutorService executer = Executors.newFixedThreadPool(5);
		for (int i =0; i<5; i++) {
			executer.execute(serviceCounter);
		}
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println("Stopped");
	    executer.shutdown();
	}

}
