package main.java.com.library.Models;

import java.util.UUID;

public class Task{
    private UUID uuid;
    private String name;
    private String description;
    private String dueDate;
    private Category category;
    private Priority priority;
    
    public Task(String name, String description, String dueDate, Category category, Priority priority){
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.category = category;
        this.priority = priority;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }
    public void setCategory(Category category){
        this.category = category;
    }
    public void setPriority(Priority priority){
        this.priority = priority;
    }

    public UUID getID(){
        return this.uuid;
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public String getDueDate(){
        return this.dueDate;
    }
    public Category getCategory(){
        return this.category;
    }
    public Priority getPriority(){
        return this.priority;
    }
}
