package day9;

import java.util.UUID;

public class Task {
    private String taskID;
    private String description;

    public Task(String description) {
        this.taskID = UUID.randomUUID().toString(); // Generate a unique ID using UUID
        this.description = description;
    }

    public String getTaskID() {
        return taskID;
    }

    public String getDescription() {
        return description;
    }
}
