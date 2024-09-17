package TodoListOop.test.service;

import TodoListOop.entity.TodoList;
import TodoListOop.repository.TodoListRepository;
import TodoListOop.repository.TodoListRepositoryImplementation;
import TodoListOop.service.TodoListService;
import TodoListOop.service.TodoListServiceImplementation;

public class TodoListServiceTest {

    public static void main(String[] args) {
        testShowTodoList();
    }

    public static void  testShowTodoList(){
        TodoListRepositoryImplementation todoListRepository = new TodoListRepositoryImplementation();
        todoListRepository.data[0] = new TodoList("Learn Java with Ade Putra");
        todoListRepository.data[1] = new TodoList("Bootcamp Purwadhika");
        todoListRepository.data[2] =  new TodoList("Learning All Day Long");


        TodoListService todoListService = new TodoListServiceImplementation(todoListRepository);

        todoListService.showTodoList();
    }
}
