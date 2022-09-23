public class Main {

    public  static  String[] model = new String[10];

    public static void main(String[] args) {

        testRemove();

    }

    /**
     *  Menampilkan todo list
     */
    public static void showTodoList() {
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

        showTodoList();
        var result = removeTodoList(2);

        System.out.println(result);

        showTodoList();
    }

    /**
     * Menampilkan view Todo
     */
    public static void viewShowTodo () {

    }

    /**
     * Menampilkan view add todo
     */
    public static void viewShowAddTodo() {

    }

    /**
     * Menampilkan view Remove Todo
     */
    public static void vewRemoveTodo() {

    }
}
