package service;

import entity.TodoList;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {

  private TodoListRepository todoListRepository;

  public TodoListServiceImpl(TodoListRepository todoListRepository) {
    this.todoListRepository = todoListRepository;
  }

  @Override
  public void showTodoList() {
    TodoList[] model = todoListRepository.getAll();


    System.out.println("============ Todolist ============");

    for(var i = 0; i < model.length; i++) {
      var todo = model[i];
      var no = i + 1;

      if (todo != null) {
        System.out.println(no + ". " + todo.getTodo());
      }
    }
  }

  @Override
  public void addTodoList(String todo) {
    TodoList todoList = new TodoList(todo);
    todoListRepository.add(todoList);
    System.out.println("SUKSES MENAMBAH TODO " + todo);
  }

  @Override
  public void removeTodoList(Integer number) {
    boolean succes = todoListRepository.remove(number);

    if(succes) {
      System.out.println("SUSKSES MENGHAPUS TODO : " + number);
    } else {
      System.out.println("GAGAL MENGHAPUS TODO : " + number);
    }
  }
}
