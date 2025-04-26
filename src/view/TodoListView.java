package view;

import service.TodoListService;
import utils.InputUtils;

import static utils.InputUtils.userInput;

public class TodoListView {

  private TodoListService todoListService;

  public TodoListView(TodoListService todoListService) {
    this.todoListService = todoListService;
  }

  public void showTodoList() {
    while(true) {
      todoListService.showTodoList();

      System.out.println("MENU : ");
      System.out.println("1. Tambah");
      System.out.println("2. Hapus");
      System.out.println("3. Keluar");

      String inp = userInput("Pilih menu : ");
      if(inp.equals("1")) {
        addTodoList();
      } else if(inp.equals("2")) {
        removeTodoList();
      } else if(inp.equals("3")) {
        System.out.println("Terima kasih");
        System.exit(0);
      } else {
        System.out.println("Menu tidak ditemukan");
      }
    }
  }

  public void addTodoList() {
    System.out.println("======== ADD TODO ========");

    var inp = userInput("Todo (x Jika batal) : ");
    if(inp.equals("x")) {

    } else {
      todoListService.addTodoList(inp);
    }
  }

  public void removeTodoList() {
    System.out.println("======== DELETE TODO ========");
    var inp = userInput("Nomor yang dihapus (x Jika batal)");

    if(inp.equals("x")) {

    } else {
      todoListService.removeTodoList(Integer.valueOf(inp));
    }
  }

}
