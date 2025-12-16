// Ye h Daemon Methods // 
// jo kisi dusre thread ke background m run karte h vo Daemon Threads hote h // 
public class I extends Thread {
    public void run(){
       System.out.println(Thread.currentThread().isDaemon());  //  iss se hum pata kar sakte h ki thread daemon h ki nahi // 
       System.out.println("Child Thread");  
    }
public static void main(String[] args) {
    System.out.println("thread");
    I i = new I ();
    i.setDaemon(true);    
    i.start();       
}

    
}
       