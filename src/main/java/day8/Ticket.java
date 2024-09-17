package day8;

public class Ticket implements Ticketable {
    private static int totalTicketsSold = 0;
    private static int ticketCounter = 1000;

    private int ticketID;
    private String buyerName;
    private Event event;
    private boolean isBooked;

    public Ticket(Event event) {
        this.ticketID = ++ticketCounter;
        this.event = event;
        this.isBooked = false;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void book(String buyerName) {
        if (!isBooked) {
            this.buyerName = buyerName;
            this.isBooked = true;
            totalTicketsSold++;
            System.out.println("Ticket booked successfully!");
            printTicket();
        } else {
            System.out.println("Sorry, this ticket is already booked.");
        }
    }

    public static int getTotalTicketsSold() {
        return totalTicketsSold;
    }

    @Override
    public void printTicket() {
        System.out.println("\n----- Ticket Details -----");
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Event: " + event.getEventName());
        System.out.println("Price: $" + event.getPrice());
        System.out.println("Buyer: " + buyerName);
        System.out.println("--------------------------\n");
    }
}


