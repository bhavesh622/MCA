import java.lang.Thread;

class Producer extends Thread {

    Thread t1;
    StringBuffer buffer;

    Producer() {
        buffer = new StringBuffer(5);
        t1 = new Thread(this);
    }

    public void run() {

        for (int i = 0; i < 5; i++) {
            buffer.append(i);
            System.out.println("Produced:- " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nBuffer is FUll");

        Consumer c = new Consumer(this);
        t1 = new Thread(c);
        t1.start();
    }
}

class Consumer extends Thread {

    Producer p;

    Consumer(Producer temp) {
        p = temp;
    }
    public void run() {

        for (int i = 0; i < p.buffer.length(); i++) {
            System.out.println("Consumed:- " + p.buffer.charAt(i));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nBuffer is Empty");
    }
}

 class ProducerCheck {
    public static void main(String[] args) {
        Producer p = new Producer();
        p.start();
    }
}