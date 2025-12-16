// Yield method Threading in java  //      
public class O extends Thread{ 
    public void run (){
           Thread.yield();   
        for(int i = 1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }

    }
    public static void main(String[] args) {
        O o1 = new O ();
        o1.start();      
     
        for(int i =1; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    
}
 