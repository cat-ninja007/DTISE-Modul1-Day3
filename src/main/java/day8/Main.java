package day8;

import day8.utils.Input;

public class Main {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();

        // Create some events
        ticketSystem.addEvent(new Event("Concert A", 50.0));
        ticketSystem.addEvent(new Event("Concert B", 75.0));
        ticketSystem.addEvent(new Event("Concert C", 60.0));

        System.out.println("Welcome to the Event Ticketing System!");

        while (true) {
            try {
                ticketSystem.displayAvailableEvents();
                int eventChoice = Input.getInt("Enter the event number you want to book (or 0 to exit): ");

                if (eventChoice == 0) {
                    System.out.println("Exiting the system. Thank you!");
                    break;
                }

                ticketSystem.bookTicket(eventChoice);

            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }

        System.out.println("Total tickets sold: " + Ticket.getTotalTicketsSold());
    }
}

