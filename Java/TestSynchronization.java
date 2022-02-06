class Tables{
    synchronized void printTable(int n){// synchronized method
    for(int i=1;i<=10;i++)
    System.out.println(n*i);
    try{ Thread. sleep(5000);}
    catch(InterruptedException e){System.out.println(e);}}
    }
    class MyThread2 extends Thread{
    Tables t;
    MyThread2(Tables t){this.t=t;}
    public void run(){t.printTable(10);}}
    class MyThread1 extends Thread{
    Tables t;
    MyThread1(Tables t){this.t=t;}
    public void run(){t.printTable(5);}}
    public class TestSynchronization{
    public static void main(String[] a){
    Tables o=new Tables();
    MyThread1 t1=new MyThread1(o);
    MyThread2 t2=new MyThread2(o);
    t1.start();
    t2.start();}
    }
    