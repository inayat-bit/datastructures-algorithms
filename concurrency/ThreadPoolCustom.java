package examples.concurrency;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPoolCustom {
   BlockingQueue<Runnable> taskQueue;
   List<PoolThread> threads;
   Boolean isStopped = false;
   
   public ThreadPoolCustom(int noOfThread, int maxNoTask) {
	   taskQueue = new ArrayBlockingQueue<Runnable>(maxNoTask);
	   for (int i =0; i < noOfThread;i++) {
		   threads.add(new PoolThread(taskQueue));
	   }
	   for (PoolThread thread: threads) {
		   thread.start();
	   }
   }
   
   public synchronized void execute (Runnable task) {
	   if(isStopped)
	      throw new IllegalStateException("Thread pool is stopped");
	   try {
		taskQueue.put(task);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
   public synchronized void stop() {
	   isStopped = true;
	   for (PoolThread thread: threads) {
		   thread.doStop();
	   }
   }
}

class PoolThread extends Thread {
    BlockingQueue<Runnable> taskQueue = null;
    Boolean isStopped = false;
    
    PoolThread(BlockingQueue<Runnable> taskQueue) {
    	this.taskQueue = taskQueue;
    }
    
	@Override
	public void run() {
		while(!isStopped) {
			try {
				Runnable runnable = taskQueue.take();
				runnable.run();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void doStop() {
		isStopped = true;
		this.interrupt();
	}
}