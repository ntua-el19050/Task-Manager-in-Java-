package main.java.com.library.Managers;
import main.java.com.library.Models.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TaskManager {
    private ObservableList<Task> taskList = FXCollections.observableArrayList();

    public ObservableList<Task> getTaskList(){
        return taskList;
    }

    public void addTask(Task task){
        taskList.add(task);
    }

    public void deleteTask(Task task){
        taskList.remove(task);
    }
}
