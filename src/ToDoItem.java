public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field

    public ToDoItem(String description){
        this.description = description;
        this.isDone = false;
    }
    //Getter
    public String getDescription(){
        return description;
    }
    // Setter
    public void setDescription(String description){
        this.description = description;
    }

    public boolean isDone(){
        return isDone;
    }

    public void setDone(boolean isDone){
        this.isDone = isDone;
    }
}
