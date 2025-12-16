// aab hum user thread create karte h // 
public class H extends Thread {
    public void run(){
         System.out.println(Thread.currentThread().getName());  // ye output m thread 0 provide kar dega // 
         Thread.currentThread().setName("xyz");
        System.out.println(Thread.currentThread().getName());                      
        System.out.println("Thread Task "); 
    }
    public static void main(String[] args) {
        H h = new H ();
        h.start(); 
        System.out.println(Thread.currentThread().getName()); // ye thread ka name output m provide kar dega main //
      System.out.println(Thread.currentThread().isAlive()); // output m aagya True // 
      System.out.println(h.isAlive());  // ye bhi output m True print kara dega thread aabhi jinda h //  


    }

    
}
