public class G {  
    public static void main(String[] args) {
     
        System.out.println(Thread.currentThread().getName()); // iss method se hum thread ka name pata laga sakte h // 
        // output m thread ka name print ho jayga //
        // output m main aagya //     

        Thread.currentThread().setName("abc"); // ye method thread ke name ko change kar dega // 
        System.out.println(Thread.currentThread().getName());   // aab output m abc   
        // System.out.println(10/0);  ye exception show kara dega lekin aab exception m main ki jagha pe abc ka name aagya // 
        

    }
      
    
}
