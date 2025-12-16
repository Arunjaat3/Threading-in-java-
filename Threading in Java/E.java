// one method multiple threads in java //  
// performing single task from multiple thread in java //   
public class E extends Thread  {
    public void run(){
        System.out.println("This is the program in thread one method multiple threads in java ");
    }
    
}
class main{
    public static void main (String [] args){
        E e = new E ();
        e.start();
        E e1 = new E (); 
        e1.start();  
       // abb output do baar aagya // 

    }    
}
   