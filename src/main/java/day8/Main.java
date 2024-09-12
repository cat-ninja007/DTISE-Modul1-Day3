package day8;

public class Main {
    public static void main(String[] args) {
        TicketSystem system = new TicketSystem();
        system.addEvent("Concert", 5);
        system.addEvent("Play", 2);

        system.createTicket();
        system.bookTicket();
        system.confirmBooking();

        System.out.println("Total Tickets Sold: " + Ticket.getTotalTicketsSold());
    }
}

