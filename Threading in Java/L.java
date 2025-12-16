// sleep  method in threading in java // 
// sleep method overload kiya hua ha //  
// sleep method interrupted exception throw karta h // 
// sleep method ko hum use kyu karte h kyuki jo thread exceute ho rha h uss thread ki execution ko khuch time ke liye rok deta h // 
public class L {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){

            try{
                Thread.sleep(1000);   // ye ek ek second baad output show karega //  
            System.out.println(i);
            } 
            catch (Exception e ){    
                System.out.println(e);
            }
        }
    }
}
