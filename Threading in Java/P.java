// Interrupted method threading in java // 
// method will only works when the thread is in sleeping or waiting sleep () or wait () // 
public class P extends Thread {
    public void run (){
        try{
        for(int i = 1; i<=5; i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
    } 
    catch(Exception E ){
        System.out.println(E); 
    }
    }
    public static void main(String[] args) {
        P p = new P ();
        p.start(); 
        p.interrupt();  // ye output m bss 1 aaygya //         
         
    }


    
}
