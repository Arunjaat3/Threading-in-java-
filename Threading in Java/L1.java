// aab l class ke program ko same hum Thread bana ke kargene // 
public class L1 extends Thread {
    public void run (){
        for(int i = 1; i<=5; i++){
            try{
                   Thread.sleep(1000); 

            System.out.println(i);
            } 
            catch(Exception e ){
                System.out.println(e);
            }
        
        }
    }
    public static void main(String[] args) {
        L1 l = new L1();
        l.start();  
    }


    
}
 