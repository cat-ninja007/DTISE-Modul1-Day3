package TodoListOop.entity;

public class TodoList {

    // the model is encapsulated
    private String todo;

    // constructor
    public TodoList(){

    }

    public TodoList(String todo){
        this.todo = todo;
    }

    // to get the data
    public String getTodo() {
        return todo;
    }

    // to set the data
    public void setTodo(String todo) {
        this.todo = todo;
    }
}
