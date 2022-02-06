public class MyThreadA implements Runnable
{public void run()
{ System.out.println(Thread.currentThread()); // This method is static.
}
public static void main(String[] args) {
 MyThreadA a = new MyThreadA();
 short z;
 Thread t = new Thread(a, "NewThread");
 System.out.println("Priority of Thread: " +t.getPriority());
 System.out.println("Name of Thread: " +t.getName());
 t.start(); }}
