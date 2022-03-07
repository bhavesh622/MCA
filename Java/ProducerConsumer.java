import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumer {

    public static void main(String args[])throws InterruptedException{
  
     //Creating shared object
     BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>(2);
 
     
//Producer Thread in java
    Thread prodThread = new Thread(()->{
            for(int i=0; i<10; i++){
                try {
                    System.out.println("Produced: " + i);
                    sharedQueue.put(i);
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.getStackTrace();
                }
            }
        });

//Consumer Thread in Java
    Thread consThread = new Thread(()-> {
            while(true){
                try {
                    System.out.println("Consumed: "+ sharedQueue.take());
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.getStackTrace();
                }
            }
        });
//Starting producer and Consumer thread
     prodThread.start();
     consThread.start();
     prodThread.join();
     consThread.join();
    };
}
