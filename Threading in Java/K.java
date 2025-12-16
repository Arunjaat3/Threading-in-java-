// ye program h Thread Priority in Java // 
public class K extends Thread {
    public void run (){
        System.out.println(Thread.currentThread().getPriority());   
        System.out.println("task 1 ");
              
    }
    public static void main (String [] args){
        System.out.println(Thread.currentThread().getPriority());   // ye output  m dega 5 kyuki bydefault main thread ki priority 5 hoti h // 
        Thread.currentThread().setPriority(10);  // ye new prority h // 
        K k = new K ();
        // hum priority set bhi kara sakte h //  s 
        k.start(); 
    
    // by default thread ki priority 5 hoti h // 
    // if priority value not in between 1 to 10 then it will throw run time exception illegal argument exception // 
//   agar khuch threads ki prority same h tho phele konsa execute hoga ye hum aassumen nahi kar sakte h jvm by defalut khus se karta h // s 
// main point windows prority ko support nahi karta h    // 
} 
    
}
