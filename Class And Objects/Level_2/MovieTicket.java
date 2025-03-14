package Level_2;
class Movie {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    public Movie(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false; 
    }

    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName + " (Seat: " + seatNumber + ").");
            System.out.println("Total Price:" + price);
        } else {
            System.out.println("Sorry, Seat " + seatNumber + " is already booked.");
        }
    }

    public void displayTicketDetails() {
        System.out.println("Ticket Details");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price:" + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }
}

public class MovieTicket {
    public static void main(String[] args) {
        Movie ticket1 = new Movie("avengers", "12", 250.0);
        Movie ticket2 = new Movie("martian", "13", 300.0);

        // Booking tickets
        ticket1.bookTicket();
        ticket2.bookTicket();

        // Displaying ticket details
        ticket1.displayTicketDetails();
        ticket2.displayTicketDetails();
    }
}
