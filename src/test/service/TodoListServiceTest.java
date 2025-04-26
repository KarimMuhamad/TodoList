package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {

  public static void main(String[] args) {
    testShowTodoList();
  }

  public static void testShowTodoList() {
    TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
    todoListRepository.data[0] = new TodoList("Bersih Bersih");
    todoListRepository.data[1] = new TodoList("Bersih Bersih");
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);


    todoListService.showTodoList();
  }

}
