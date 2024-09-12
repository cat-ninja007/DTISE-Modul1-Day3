package day8;

public class Ticket implements Ticketable {
    private static int totalTicketsSold = 0;
    private int ticketId;
    private String eventName;
    private double price;

    public Ticket(int ticketId, String eventName, double price) {
        this.ticketId = ticketId;
        this.eventName = eventName;
        this.price = price;
        totalTicketsSold++;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getEventName() {
        return eventName;
    }

    public double getPrice() {
        return price;
    }

    public static int getTotalTicketsSold() {
        return totalTicketsSold;
    }

    @Override
    public void printTicketDetails() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Event: " + eventName);
        System.out.println("Price: $" + price);
    }
}

