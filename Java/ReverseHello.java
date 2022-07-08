public class ReverseHello {

    static void createHelloThreads(int n) throws InterruptedException{
        Thread t = new Thread(){
            public void run(){
                while(n>0){try {
                    createHelloThreads(n-1);
                    System.out.println("Hello from Thread "+(n-1));
                    this.join();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                
                }}
            };  
        };
        t.start();
        //t.join();
    }       
    public static void main(String[] args) {
        int n = 20;
        try{
            createHelloThreads(n);
        
    }
    catch(InterruptedException e){};
            }    
        }   
    


