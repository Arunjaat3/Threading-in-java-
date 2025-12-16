// Interrupted and isInterrupted  Thread method in java // 
//  agar thread interrupted hua tho value aagyi True or nahi hoga tho value aagi false // 
// dono ke same hi kaam h // 
// in dono m difference kiya h Interrupted () method clears the Interrupted status from true to false //   
// syntax of Interrupted method public static boolean Interrupted() 
// Syntax of isInterrupted method hota h pulic boolean isInterrupted () // 
public class Q  extends Thread{
    public void run(){
        System.out.println(Thread.interrupted()); // hum yaha pe check karwa rhe h ki kya thread interrupt hua h //
        System.out.println(Thread.currentThread().isInterrupted());  
           try {
               for(int i = 1; i<=5; i++){
                System.out.println(i);
                Thread.sleep(1000);  
                System.out.println(Thread.interrupted()); // ye yaha pe false provide karega //  
               }
           } catch (Exception e) {
            e.printStackTrace(); 
           }

    }
    public static void main(String[] args) {
        Q q = new Q ();
        q.start(); 
        q.interrupt(); 
    }
    
}
