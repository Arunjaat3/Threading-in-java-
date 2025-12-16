// Performing single task from single thread in java // 
public class C extends Thread  { 
	public void run () {
		System.out.println("this is the single task program in java ");
	}

	public static void main(String[] args) {
		C c = new C ();
		c.start();  
	    

	}

}
   