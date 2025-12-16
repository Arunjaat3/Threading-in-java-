// yield method in Threading  in java // 
// ye current thread ko rok deta h or dusre thread ko permession de deta h ki thum execute ho jao // 
// in java 5 me  yield method internally Sleep method ko use karta h //
// in java 6 thread provides the hint to the thread scheduler then it depends on thread scheduler to accept on ignore the hint //  
public class M extends Thread {
public void run (){
    Thread.yield();  
    for(int i = 1; i<=5; i++){
        System.out.println(Thread.currentThread().getName()+" "+ i);
    }

}
public static void main(String[] args) {
    M m = new M();
    m.start(); 
    for(int i = 1; i<=5; i++){ 
        // if you want main method to stop and provide chance to other thread for execution // 
       //  Thread.yield();  jase hi ye line likhi vese hi hint pauch gi dusre thread ke pass ki mm stop ho sakta hu // 
        System.out.println("main - "+i);     
    }   
    // agar hint ko accept kar leta h to output khuch or aagyi //
    // agar accept nahi karta h tho dono ek sath execute hogne //     
}
    
}
