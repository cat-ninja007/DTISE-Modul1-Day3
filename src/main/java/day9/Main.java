package day9;

import day8.utils.Input;

public class Main {
    public static void main(String[] args) {
        ToDoListApp app = new ToDoListApp();
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the To-Do List App");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = Input.getInt("Choose an option: ");
            switch (choice) {
                case 1:
                    app.registerUser();
                    break;
                case 2:
                    if (app.loginUser()) {
                        boolean loggedIn = true;
                        while (loggedIn) {
                            app.showMenu();
                            int menuChoice = Input.getInt("Choose an option: ");
                            switch (menuChoice) {
                                case 1:
                                    app.addTask();
                                    break;
                                case 2:
                                    app.viewTasks();
                                    break;
                                case 3:
                                    app.deleteTask();
                                    break;
                                case 4:
                                    app.logout();
                                    loggedIn = false;
                                    break;
                                default:
                                    System.out.println("Invalid choice. Please try again.");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting the application.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
