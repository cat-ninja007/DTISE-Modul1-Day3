package TodoListOop.service;

import TodoListOop.entity.TodoList;
import TodoListOop.repository.TodoListRepository;

public class TodoListServiceImplementation implements TodoListService{

    private TodoListRepository todoListRepository;

    public TodoListServiceImplementation(TodoListRepository todoListRepository){
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList(){
        TodoList[] model = todoListRepository.getAll();

        System.out.println("TODO LIST");
        for(var i = 0; i < model.length; i++){
            var todolist = model[i];
            var no = i + 1;

            if(todolist != null){
                System.out.println(no + ". " + todolist.getTodo());
            }
        }

    }

    @Override
    public void addTodoList(String todo){

    }

    @Override
    public void removeTodoList(Integer number){

    }

}
