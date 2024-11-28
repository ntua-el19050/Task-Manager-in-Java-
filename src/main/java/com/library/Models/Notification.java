package main.java.com.library.Models;

import java.util.UUID;

public class Notification {
    private UUID uuid;
    private Task task;
    private String message;
    private String notifyAt;

    public Notification(Task task, String message, String notifyAt){
        this.uuid = UUID.randomUUID();
        this.task = task;
        this.message = message;
        this.notifyAt = notifyAt;
    }

    public void setTask(Task task){
        this.task = task;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public void setNotifyAt(String notifyAt){
        this.notifyAt = notifyAt;
    }

    
    public UUID getID(){
        return this.uuid;
    }
    public Task getTask(){
        return this.task;
    }
    public String getMessage(){
        return this.message;
    }
    public String getNotifyAt(){
        return this.notifyAt;
    }
}
