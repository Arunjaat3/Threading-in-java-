
    
public class A extends Thread {


		public void run() // hum ne run method ko override karwaya h //
		{
			System.out.println("thread task  ");
			
		}
		public static void main (String [] args) {
			A a = new A(); 
			a.start();    
			// a.start hum thread ko dubara se start nahi kara sakte h // 
		}
	              	

	}


  
    
  
