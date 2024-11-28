package main.java.com.library.Models;

import java.util.UUID;

public class Category {
    private UUID uuid;
    private String name;

    public Category( String name){
        this.uuid = UUID.randomUUID();
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public UUID getID(){
        return this.uuid;
    }
    public String getName(){
        return this.name;
    }
}
