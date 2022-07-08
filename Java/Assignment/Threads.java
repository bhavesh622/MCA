package Assignment;


    class A extends Thread {

	@Override
	public void run()
	{
		for (int i = 1; i <= 4; i++) {
			try {
				Thread.sleep(100);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			System.out.print(i + " ");
		}
	}
}

class B extends Thread {

	@Override
	public void run()
	{
		for (char i = 'a'; i <= 'd'; i++) {
			try {
				Thread.sleep(100);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			System.out.print(i + " ");
		}
	}
}

class Threads extends Thread {

	public static void main(String args[])
	{
		// creating two threads
		A a1 = new A();
		B b1 = new B();

		// starts second thread after when
		// first thread a1 is died.
		a1.start();
		try {
			a1.join();
		}
		catch (Exception e) {
			System.out.println(e);
		}

		// after thread a1 execution finished
		// then b1 thread start
		b1.start();
	}
}

