package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {

  public static void main(String[] args) {
    testRemoveTodoList();
  }

  public static void testShowTodoList() {
    TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
    todoListRepository.data[0] = new TodoList("Bersih Bersih");
    todoListRepository.data[1] = new TodoList("Bersih Bersih");
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);


    todoListService.showTodoList();
  }

  public static void testAddTodoList() {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.addTodoList("Bersih Bersih");
    todoListService.addTodoList("Bersih ");
    todoListService.addTodoList("Bersih Kamar");
    todoListService.addTodoList("Bersih Hotel");
    todoListService.showTodoList();
  }

  public static void testRemoveTodoList() {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.addTodoList("Bersih Bersih");
    todoListService.addTodoList("Bersih ");
    todoListService.addTodoList("Bersih Kamar");
    todoListService.addTodoList("Bersih Hotel");

    todoListService.showTodoList();

    todoListService.removeTodoList(5);
    todoListService.showTodoList();

  }

}
