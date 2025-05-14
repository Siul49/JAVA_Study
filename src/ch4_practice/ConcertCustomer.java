package ch4_practice;

public class ConcertCustomer {
    private final String name;
    private int seatNumber;
    private int seatSection;


    ConcertCustomer(String name, int seatNumber,  int seatSection) {
        this.name = name;
        this.seatNumber = seatNumber;
        this.seatSection = seatSection;
    }

    String getName(){
        return name;
    }

    void reservationSeats(){
        if (this.seatSection == 1){
            ConcertSeats.S[seatNumber-1] = name;
        }
        else if (this.seatSection == 2){
            ConcertSeats.A[seatNumber-1] = name;
        }
        else if (this.seatSection == 3){
            ConcertSeats.B[seatNumber-1] = name;
        }
    }

    void cancelSeats(){
        if (this.seatSection == 1){
            ConcertSeats.S[seatNumber-1] = "---";
        }
        else if (this.seatSection == 2){
            ConcertSeats.A[seatNumber-1] = "---";
        }
        else if (this.seatSection == 3){
            ConcertSeats.B[seatNumber-1] = "---";
        }
    }
}
