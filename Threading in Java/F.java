// performing multiple task from multiple thread in java // 
public class F extends  Thread {
public void run(){
    System.out.println("this is task 1 ");
}

}
class Thread2 extends Thread{
    public void run(){
        System.out.println("this is task 2 ");
    }
}    
class Thread3 extends Thread{
    public void run (){
        System.out.println("this is task 3 ");

    }
}
class main { 
    public static void main(String[] args) {
        F f = new F ();
        f.start();
        Thread2  t = new Thread2();
        t.start();
        Thread3 t3 = new Thread3();
        t3.start();
        // ye sab task ek sath execute hua  h // 

    }   
}
 