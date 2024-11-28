package main.java.com.library.Services;
import java.util.UUID;
import main.java.com.library.Managers.*;
import main.java.com.library.Models.*;

import javafx.collections.ObservableList;

public class TaskService{
    private TaskManager taskManager;

    public TaskService(TaskManager taskManager){
        this.taskManager = taskManager;
    }

    public TaskManager getTaskManager(){
        return taskManager;
    }

    public void addTask(String name, String description, String dueDate, Category category, Priority priority){
        Task task = new Task(name, description, dueDate, category, priority);
        taskManager.addTask(task);
    }

    public void deleteTask(Task task){
        taskManager.deleteTask(task);
    }

    public Task getTaskbyTaskID(UUID taskID){
        return taskManager.getTaskList().stream().filter(a -> a.getID().equals(taskID)).findFirst().orElse(null);
    }

    public void updateTask(Task task, String name, String description, String dueDate, Category category, Priority priority){
        task.setName(name);
        task.setDescription(description);
        task.setDueDate(dueDate);
        task.setCategory(category);
        task.setPriority(priority);
    }
}