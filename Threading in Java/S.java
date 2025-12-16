// iss program m hum ne wait (), or notify() ka use kiya h // 

class TotalEarning extends Thread {
    int total = 0;    
    public void run(){
        synchronized (this) {
            
        
        
        for(int i = 1; i<=10; i++){
               total = total + 100; 
        }
        this.notify(); 
    }
    }  

    
}
public class S{
    public static void main(String[] args)  throws InterruptedException {  
        TotalEarning te = new TotalEarning();
        te.start(); 
      //   System.out.println("Total Earning "+te.total+ " rs ");  
        synchronized(te){
            te.wait(); // hum yaha pe time limit bhi provide kara sakte h //   
            System.out.println("total Earnings "+ te.total+ " rs ");   
        }
        
    }
}