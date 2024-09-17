package day8;

public class Event {
    private String eventName;
    private double price;

    public Event(String eventName, double price) {
        this.eventName = eventName;
        this.price = price;
    }

    public String getEventName() {
        return eventName;
    }

    public double getPrice() {
        return price;
    }
}
