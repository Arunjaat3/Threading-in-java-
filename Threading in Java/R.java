

// Synchronization in java Multithreading // 
// iss program m hum ne kahi bhi Synchronization ka use nahi kiya h bss jo problem aati h bina synchronization ke usse problem ko face kiya h // 
class BookTheaterSeat{
    int total_seat = 10;
     synchronized void bookSeat(int seats){
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
public  class R extends Thread{
     static BookTheaterSeat b;
     int seats; 
    public void run(){
  b.bookSeat(seats);

    }
    public static void main(String[] args) {
        b = new BookTheaterSeat();
         R  r = new R ();
         r.seats = 7;
         r.start(); 
         R r1 = new R ();
         r1.seats = 6;    
         r1.start();  
    }
}
