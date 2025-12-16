// Static Synchronization in Java // 
// agar hum multiple objects create karte h tho problem aati h uss problem ko solve karne ke liye hum  static synchronization ka use karte h // 
 class BookTheaterSeat{ 
   static int total_seat  = 20;
   static synchronized  void bookSeat(int seats){
        if(total_seat>= seats){
            System.out.println(seats+ "seats booked Successfully");
            total_seat = total_seat - seats; 
            System.out.println("seats left : " +total_seat); 
        }
        else {
            System.out.println("Seats can't be booked"); 
            System.out.println("seats left: "+total_seat); 
        }

    }
 }
 class MyThread1 extends  Thread{ 
 BookTheaterSeat b;
 int seats;  
     MyThread1(BookTheaterSeat b, int seats) {
        this.b = b;
        this.seats = seats; 
    }
    public void run (){
        b.bookSeat(seats);
    }
    
 } 
  class MyThread2 extends  Thread{
 BookTheaterSeat b;
 int seats; 
     MyThread2(BookTheaterSeat b, int seats) {
        this.b = b;
        this.seats = seats; 
    }
    public void run (){
        b.bookSeat(seats);
    }
    
 }
 public class R3 {
    public static void main(String[] args) {
       BookTheaterSeat b1 = new BookTheaterSeat();
       MyThread1 t1 = new MyThread1(b1, 7);
       t1.start(); 

       MyThread2 t2 = new MyThread2(b1, 6);
       t2.start();  
         BookTheaterSeat b2 = new BookTheaterSeat();
       MyThread1 t3 = new MyThread1(b1, 5);
       t3.start(); 

       MyThread2 t4 = new MyThread2(b1, 9); 
       t4.start();  
                  
    }
 }