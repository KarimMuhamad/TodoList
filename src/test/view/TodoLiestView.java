package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoLiestView {
  public static void main(String[] args) {
    showTodoList();
  }

  public static void showTodoList() {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.addTodoList("Bersih Bersih");
    todoListService.addTodoList("Bersih ");
    todoListService.addTodoList("Bersih Kamar");
    todoListService.addTodoList("Bersih Hotel");

    TodoListView todoListView = new TodoListView(todoListService);
    todoListView.showTodoList();
  }
}
