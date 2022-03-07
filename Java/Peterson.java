class Peterson {
    static boolean[] flag = {false, false};
    static int turn = 0;
    static int N = 5;
    
    static Thread createProcess(int i) {
      return new Thread(() -> {
        int j = 1 - i;
        for (int n=0; n<N; n++) {
          log("Process/Thread "+(i+1)+ ": Wants Critical Section "); // LOCK
          flag[i] = true; 
          turn = j;       
          while (flag[j] && turn == j) Thread.yield(); 
          
          log("Process/Thread "+ (i+1) +": currently in Critical Section "+n);
          sleep(1000 * Math.random()); 
  
          log("Process/Thread "+(i+1)+": is done with Critical Section"); // UNLOCK
          flag[i] = false; 
        }
      });
    }
  
  
    public static void main(String[] args) {
      try {
        log("Starting 2 threads");
        Thread p0 = createProcess(0);
        Thread p1 = createProcess(1);
        p0.start();
        p1.start();
        p0.join();
        p1.join();
      }
      catch (InterruptedException e) {
          e.getStackTrace();
      }
    }
  
    static void sleep(double t) {
      try { Thread.sleep((long)t); }
      catch (InterruptedException e) {}
    }
  
    static void log(String x) {
      System.out.println(x);
    }
  }
  