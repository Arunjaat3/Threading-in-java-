// Synchronization in java Multithreading //  
// Iss program m hum Synchronization Block ka use karenge // 
// block thread ka waiting time period kamm kar deta h // 

class BookTheaterSeat{   
    int total_seat = 10;
      void bookSeat(int seats){
        synchronized (this) {
            
        
        if(total_seat>=seats){
            System.out.println(seats+" seats booked successfully");
            total_seat = total_seat - seats; 
            System.out.println("Seats Left "+total_seat);
        }
        else{
            System.out.println("sorry seats can't be booked ");
            System.out.println("seats left " + total_seat);
        }
    }   



    }
}
public  class R2 extends Thread{
     static BookTheaterSeat b;
     int seats; 
    public void run(){
  b.bookSeat(seats);

    }
    public static void main(String[] args) {
        b = new BookTheaterSeat();
         R2  r = new R2 ();
         r.seats = 7;
         r.start();  
         R2 r1 = new R2 ();
         r1.seats = 6;    
         r1.start();  
    }
}

