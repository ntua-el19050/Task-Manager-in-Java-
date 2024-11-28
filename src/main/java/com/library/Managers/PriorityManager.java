package main.java.com.library.Managers;

import main.java.com.library.Models.Priority;

public class PriorityManager {
    private ObservableList<Priority> priorityList = FXCollections.observableArrayList();

    public ObservableList<Priority> getPriorityList(){
        return priorityList;
    }

    public void addPriority(Priority priority){
        priorityList.add(priority);
    }

    public void deletePriority(Priority priority){
        priorityList.remove(priority);
    }
}
