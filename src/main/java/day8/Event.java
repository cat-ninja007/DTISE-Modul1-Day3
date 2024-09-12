package day8;

public class Event {
    private String eventName;
    private int availableTickets;

    public Event(String eventName, int availableTickets) {
        this.eventName = eventName;
        this.availableTickets = availableTickets;
    }

    public String getEventName() {
        return eventName;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void bookTicket() throws Exception {
        if (availableTickets > 0) {
            availableTickets--;
        } else {
            throw new Exception("No tickets available for this event.");
        }
    }

    public boolean isTicketAvailable() {
        return availableTickets > 0;
    }
}
