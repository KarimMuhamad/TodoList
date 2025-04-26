package repository;

import entity.TodoList;

public interface TodoListRepository {

  TodoList[] getAll();

  void add(TodoList todo);

  void remove(Integer index);

}
