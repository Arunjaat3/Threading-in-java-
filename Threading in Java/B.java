
public class B implements Runnable {
	public void run() {
		System.out.println("Thread task 2 "); 
		
	}

	public static void main(String[] args) {
            B  b = new B();
            Thread t = new Thread(b);
            t.start();    
  

	}
       
} 
    