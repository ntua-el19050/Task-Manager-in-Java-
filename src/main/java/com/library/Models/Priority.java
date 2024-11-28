package main.java.com.library.Models;

import java.util.UUID;

public class Priority {
    private UUID uuid;
    private String level;
    
    public Priority(String level){
        this.uuid = UUID.randomUUID();
        this.level = level;
    }

    public void setLevel(String level){
        this.level = level;
    }
    public UUID getID(){
        return this.uuid;
    }
    public String getLevel(){
        return this.level;
    }
}
