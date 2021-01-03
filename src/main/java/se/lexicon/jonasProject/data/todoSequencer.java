package se.lexicon.jonasProject.data;

public class todoSequencer {

    private static int todoId;

    public todoSequencer(int todoId){

        this.todoId = todoId;

    }
    public static int nextTodoId(){
        todoId = ++todoId;
        return todoId;
    }

    public static int resetTodo(){
        todoId = 0;
        return todoId;
    }
    
}
