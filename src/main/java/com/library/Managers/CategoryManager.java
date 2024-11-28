package main.java.com.library.Managers;

import main.java.com.library.Models.Task;

public class CategoryManager {
    private ObservableList<Category> categoryList = FXCollections.observableArrayList();

    public ObservableList<Category> getCategoryList(){
        return categoryList;
    }

    public void addTask(Category category){
        categoryList.add(category);
    }

    public void deleteTask(Category category){
        categoryList.remove(category);
    }
}
