// Synchronization in java Multithreading // 
// iss program m hum ne Synchronization ka use kiya h //  
// iss program m hum ne Sychronization Method banaya h // 
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
public  class R1 extends Thread{
     static BookTheaterSeat b;
     int seats; 
    public void run(){
  b.bookSeat(seats);

    }
    public static void main(String[] args) {
        b = new BookTheaterSeat();
         R1  r = new R1 ();
         r.seats = 7;
         r.start();  
         R1 r1 = new R1 ();
         r1.seats = 6;    
         r1.start();  
    }
}

