// join thread method in java //
// join ka matlab hota h ki ek thread jo h stop ho jagya or dusre thread ka wait karega jaise ho vo apna task complete karega tho m usse join kar lunga //
 // if thread a wants to wait for anohter thread to complete its task then we should use join ()  method // 
// methods of join method 1.  public final void join () ye exception show karata interrupted Exception  h // 
// second method  = public final synchronized void join (long milisecond) ye bhi exception show karega  interrupted Exception  // 
// this method = public final synchronized void join (long milisecond , int nano second ) ye bhi exception show karega try and catch ka use kargene sabhi ke liye or throw ka use karenge  interrupted Exception   // 
public class N extends Thread {
    public void run (){
        try{
        for(int i = 1; i<=5; i++){
            System.out.println("child thread "+i ); 
          Thread.sleep(1000); 
        } 
    }
        catch (Exception E ){
            System.out.println(E);
        }
         
    } 
    public static void main(String[] args) {
        N n = new N ();
        n.start();   
        try {
            for(int i = 1; i<=5; i++){
                System.out.println("main thread "+i);
            }
        }
        catch (Exception E ){
            System.out.println(E);
        }
     }
        
}
