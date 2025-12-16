// cases of Sleep method in java //  
public class L2 extends Thread {
    public void run (){
        try {

            for(int i = 1; i<=5; i++){
                System.out.println(i+" "+Thread.currentThread().getName());   // aab ye bata dega ki konsa thread execute ho rha h //  
                Thread.sleep(1000); 
            }

        }
        catch (Exception E ){
            System.out.println(E);
        }

    }
    public static void main(String[] args) {
        L2 l = new L2();
        l.start();  
        // abb hum ek or thread create kar dinge // 
        L2 l1 = new L2();
        l1.start();   
        
    }
    
}
