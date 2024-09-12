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

    public void addEvent(String eventName, int availableTickets) {
        events.add(new Event(eventName, availableTickets));
    }

    public void createTicket() {
        try {
            String eventName = Input.getString("Enter event name: ");
            double price = Input.getDouble("Enter ticket price: ");
            int eventId = findEvent(eventName);

            if (eventId != -1) {
                int ticketId = tickets.size() + 1;
                tickets.add(new Ticket(ticketId, eventName, price));
                System.out.println("Ticket created successfully!");
            } else {
                throw new Exception("Event not found.");
            }
        } catch (Exception e) {
            System.out.println("Error creating ticket: " + e.getMessage());
        }
    }

    public void bookTicket() {
        try {
            String eventName = Input.getString("Enter event name to book: ");
            int eventId = findEvent(eventName);

            if (eventId != -1 && events.get(eventId).isTicketAvailable()) {
                events.get(eventId).bookTicket();
                System.out.println("Ticket booked successfully!");
            } else {
                throw new Exception("No tickets available or event not found.");
            }
        } catch (Exception e) {
            System.out.println("Error booking ticket: " + e.getMessage());
        }
    }

    public void confirmBooking() {
        try {
            if (tickets.isEmpty()) {
                throw new Exception("No tickets booked.");
            }
            Ticket ticket = tickets.get(tickets.size() - 1);
            ticket.printTicketDetails();
            System.out.println("Booking confirmed!");
        } catch (Exception e) {
            System.out.println("Error confirming booking: " + e.getMessage());
        }
    }

    private int findEvent(String eventName) {
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getEventName().equalsIgnoreCase(eventName)) {
                return i;
            }
        }
        return -1;
    }
}

