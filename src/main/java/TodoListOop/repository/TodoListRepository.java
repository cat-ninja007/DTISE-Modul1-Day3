package TodoListOop.repository;

import TodoListOop.entity.TodoList;

public interface TodoListRepository {

    // show all todolist
    TodoList[] getAll();


    // add todo list
    void add(TodoList todoList);


    // delete todolist
    void remove(Integer number);

}
