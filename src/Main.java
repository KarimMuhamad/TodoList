import java.util.Scanner;

public class Main {

    public  static  String[] model = new String[10];

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        viewShowTodo();
//        testRemove();
    }

    /**
     *  Menampilkan todo list
     */
    public static void showTodoList() {
        System.out.println("============ Todolist ============");
        for(var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList () {
        model[0] = "Bersih Bersih";
        model[1] = "Tidur";
        showTodoList();
    }

    /**
     * Menambah todo ke list
     */

    public static void addTodoList(String todo) {
        var isfull = true;
        for (var i = 0; i < model.length; i++) {
            if(model[i] == null) {
                isfull = false;
                break;
            }
        }

        if(isfull) {
            var temp = model;
            model = new String[model.length * 2];

            for(var i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        for(var i = 0; i < model.length; i++) {
            if(model[i] == null) {
                model[i]= todo;
                break;
            }
        }
    }

    public static void testAddTodoList () {
        for (var i = 0; i < 25; i++) {
            addTodoList("Contoh Todo ke." + i);
        }

        showTodoList();
    }

    /**
     * Menghapus todo
     */
    public static boolean removeTodoList(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (var i = (number - 1); i < model.length; i++) {
                if(i == model.length - 1) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }

            }

            return true;
        }
    }

    public static void testRemove() {
        addTodoList("coba");
        addTodoList("Coba 2");
        addTodoList("Coba 3");
        addTodoList("Coba 4");
        addTodoList("Coba 5");

        showTodoList();
        var result = removeTodoList(4);

        System.out.println(result);

        showTodoList();
    }

    public static String userInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    /**
     * Menampilkan view Todo
     */
    public static void viewShowTodo () {
        while(true) {
            showTodoList();
            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");

            String inp = userInput("Pilih menu : ");
            if(inp.equals("1")) {
                viewShowAddTodo();
            } else if(inp.equals("2")) {
                viewRemoveTodo();
            } else if(inp.equals("3")) {
                System.out.println("Terima kasih");
                System.exit(0);
            } else {
                System.out.println("Menu tidak ditemukan");
            }
        }

    }

    /**
     * Menampilkan view add todo
     */
    public static void viewShowAddTodo() {
        System.out.println("======== ADD TODO ========");

        var inp = userInput("Todo (x Jika batal)");
        if(inp.equals("x")) {

        } else {
            addTodoList(inp);
        }
    }

    /**
     * Menampilkan view Remove Todo
     */
    public static void viewRemoveTodo() {
        System.out.println("======== DELETE TODO ========");
        var inp = userInput("Nomor yang dihapus (x Jika batal)");

        if(inp.equals("x")) {

        } else {
            showTodoList();
            if(!removeTodoList(Integer.valueOf(inp))) {
                System.out.println("Gagal hapus" + inp);
            }
        }

    }
}
