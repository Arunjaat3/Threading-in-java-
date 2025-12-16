//  performing single task from single thread in another way  //  
public class D extends Thread {
  public void run() {	 
	  System.out.println("this is the thead task another way ");
  }

}
class Test { 
	public  static void main (String [] args) {
		D d = new D();
		d.start();
	} 
}  
  