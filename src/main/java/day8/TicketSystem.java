package day8;

import day8.utils.Input;

import java.util.ArrayList;
import java.util.List;

public class TicketSystem {
    private List<Event> events;
    private List<Ticket> tickets;

    public TicketSystem() {
        events = new ArrayList<>();
        tickets = new ArrayList<>();
    }

    // Method to add an event to the system
    public void addEvent(Event event) {
        events.add(event);
        tickets.add(new Ticket(event));
    }

    // Display available events that are not yet booked
    public void displayAvailableEvents() {
        System.out.println("\nAvailable Events:");
        for (int i = 0; i < events.size(); i++) {
            if (!tickets.get(i).isBooked()) {
                System.out.println((i + 1) + ". " + events.get(i).getEventName() + " - $" + events.get(i).getPrice());
            }
        }
    }

    // Method to book a ticket for an event
    public void bookTicket(int eventChoice) {
        try {
            if (eventChoice > 0 && eventChoice <= events.size()) {
                Ticket selectedTicket = tickets.get(eventChoice - 1);

                if (!selectedTicket.isBooked()) {
                    Input.getString(""); // Consume newline
                    String buyerName = Input.getString("Enter your name: ");
                    selectedTicket.book(buyerName);
                } else {
                    System.out.println("Sorry, this ticket is already booked.");
                }
            } else {
                System.out.println("Invalid event choice.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while booking the ticket: " + e.getMessage());
        }
    }
}

