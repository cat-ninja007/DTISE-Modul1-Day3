package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import day8.utils.Input;

public class ToDoListApp {
    private Map<String, User> users;  // A map to store users with username as key
    private Map<String, List<Task>> userTasks; // A map to store tasks for each user

    private User loggedInUser;

    public ToDoListApp() {
        users = new HashMap<>();
        userTasks = new HashMap<>();
    }

    // Register a new user
    public void registerUser() {
        String username = Input.getString("Enter a username: ");
        if (users.containsKey(username)) {
            System.out.println("Username already exists! Please try again.");
            return;
        }
        String password = Input.getString("Enter a password: ");
        users.put(username, new User(username, password));
        userTasks.put(username, new ArrayList<>()); // Initialize an empty task list for the user
        System.out.println("Account created successfully!");
    }

    // Login a user
    public boolean loginUser() {
        String username = Input.getString("Enter your username: ");
        String password = Input.getString("Enter your password: ");
        User user = users.get(username);
        if (user != null && user.checkPassword(password)) {
            loggedInUser = user;
            System.out.println("Login successful! Welcome, " + username);
            return true;
        } else {
            System.out.println("Invalid username or password. Please try again.");
            return false;
        }
    }

    // Add a task for the logged-in user
    public void addTask() {
        if (loggedInUser == null) return;
        String description = Input.getString("Enter the task description: ");
        Task task = new Task(description);
        userTasks.get(loggedInUser.getUsername()).add(task);
        System.out.println("Task added successfully!");
    }

    // View all tasks for the logged-in user
    public void viewTasks() {
        if (loggedInUser == null) return;
        List<Task> tasks = userTasks.get(loggedInUser.getUsername());
        if (tasks.isEmpty()) {
            System.out.println("You have no tasks.");
        } else {
            System.out.println("Your Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.println((i + 1) + ". [" + task.getTaskID() + "] " + task.getDescription());
            }
        }
    }

    // Delete a task by its index
    public void deleteTask() {
        if (loggedInUser == null) return;
        viewTasks();
        List<Task> tasks = userTasks.get(loggedInUser.getUsername());
        if (tasks.isEmpty()) {
            return;
        }
        int taskNumber = Input.getInt("Enter the number of the task to delete: ");
        if (taskNumber <= 0 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number.");
        } else {
            Task removedTask = tasks.remove(taskNumber - 1);
            System.out.println("Task '" + removedTask.getDescription() + "' deleted successfully!");
        }
    }

    // Logout the current user
    public void logout() {
        if (loggedInUser != null) {
            System.out.println("Goodbye, " + loggedInUser.getUsername() + "!");
            loggedInUser = null;
        }
    }

    // Main menu
    public void showMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add a task");
        System.out.println("2. View tasks");
        System.out.println("3. Delete a task");
        System.out.println("4. Logout");
    }
}
