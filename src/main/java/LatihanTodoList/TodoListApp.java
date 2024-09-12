package LatihanTodoList;

public class TodoListApp {

    public static String[] model = new String[10]; // Creating Model

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }

    // To show Todo list
    // we need index to show the list of todo list
    public static void showTodoList(){
        System.out.println("TODO-LIST");
        System.out.println("=============");
        for(var i = 0; i < model.length; i++){
            String todo = model[i];
            int no = i + 1;

            if(todo != null){
                System.out.println(no + ". " + todo);
            }

        }

    }

    public static void testShowTodoList(){
        model[0] = "Learn Java with Mr. Ade Putra";
        model[1] = "Mental Health is Scam";
        showTodoList();
    }



    // To Add Todo List
    public static void addTodoList(String todo){
        // to check if the array is full
        boolean arrayModelFull = true;
        for(int i = 0; i < model.length; i++){
            if(model[i] == null){
                arrayModelFull = false;
                break;
            }
        }

        // if the recent array is full, resize it by 2 times
        if(arrayModelFull){
            // create temporary array to store previous data
            String[] temp = model;

            // resize the model
            model = new String[model.length * 2];

            // add the previous data from temporary storage to resized model
            for(int i=0 ; i<temp.length ; i++){
                model[i] = temp[i];
            }
        }


        // Add todo list to empty slot array
        for(var i=0; i < model.length; i++){
            if(model[i] == null){
                model[i] = todo;
                break; // to stop searching the empty slot array once we found the empty one!
            }
        }
    }

    public static void testAddTodoList() {
        for (int i = 0; i < 25; i++) {
            addTodoList("Todo List Number " + (i+1));
        }

        showTodoList();

    }




    // To Remove Todo List
    public static boolean removeTodoList(Integer number){
        // Check to make sure that user choose the right number
        if((number - 1) >= model.length){
            return false;
        } else if(model[number - 1] == null){
            return false;
        } else {
            //model[number - 1] = null;
            // to shift the empty slot from the removed data
            for (int i = (number - 1); i < model.length; i++) {
                if(i == (model.length - 1 )) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        boolean result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }


    // Get User Input
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    // Test Input
    public static void testInput(){
        String name = input("Name");
        System.out.println("Hi " + name);
    }


    // Define the View============================
    // View to show Todo List
    public static void viewShowTodoList(){
        // Keep showing the menu
        while(true){

            showTodoList();

            System.out.println("============= ");
            System.out.println("MENU : ");
            System.out.println("1. Add Todo-List");
            System.out.println("2. Delete Todo-List");
            System.out.println("quit");

            String input = input("Pilih");
            if(input.equals("1")){
                viewAddTodoList();
            } else if(input.equals("2")){
                viewRemoveTodoList();
            }else if(input.equals("quit")){
                System.out.println("Good bye!");
                break;
            } else {
                System.out.println("Input is invalid!");
            }
        }

    }

    public static void testViewShowTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        addTodoList("Enam");
        viewShowTodoList();
    }


    // View to add Todo List
    public static void viewAddTodoList(){
        System.out.println("Add your Todo-List");

        String todo = input("Press 'x' to cancel");

        if(todo.equals("x")){
            // do nothing
        } else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");

        viewAddTodoList();

        showTodoList();
    }


    // View to remove Todo List
    public static void viewRemoveTodoList(){
        System.out.println("Remove your Todo-List");

        String todo = input("Type the number of Todo-List that you want to delete");

        if(todo.equals("x")){
            // do nothing
        } else {
            boolean success =  removeTodoList(Integer.valueOf(todo));
            if(!success){
                System.out.println("Failed to remove Todo-List!");
            }
        }
    }

    public static void testViewRemoveTodoList(){

        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }

}
