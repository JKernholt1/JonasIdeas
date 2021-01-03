package se.lexicon.jonasProject.data;

import se.lexicon.jonasProject.model.Person;

import java.util.Arrays;

public class todoItems {
/*
    int todoId;
    String description;
    boolean done;
    Person assignee;
*/
private Todo[] todos = new Todo[0];

    public Todo[] addTodo(Todo todo[]) {
        Todo[] newTodoArray = Arrays.copyOf(todos, todos.length + 1);
        newTodoArray[newTodoArray.length - 1] = todo;
        todos = newTodoArray;
        todoSequencer.nextTodoId();
        return todos;
    }

    public int size(Todo[] todos, int todoSize){ // should return the length of the array.
        todos = this.todos;
        for (int i = 0; i < todos.length; i++){
            todoSize = i+1;
        }
        return todoSize;
    }

    public void todoItemsFindAll(Todo[]... todos){ // should return the whole todo array.

        for (Todo[] todo : todos) {
            System.out.println("Todo Id's and description: " + Todo.getTodoId(todo) + "\t" + Todo.getDescription(todo));
        }
    }
//

    public Todo[] todoFindById(int todoId){ // should return the todo that has the matching todoId as the passed parameter.
//todoId, description

        todo[] = Todo.getTodoId(todoId), Todo.getDescription();

        return todo[];
    }


    public void clearTodo(){ //Clears all todo objects from the Todo array.
        Todo todos[] = {};

    }


//-------- not finished methods below


    public Todo[] findByDoneStatus(boolean doneStatus){

    }

    public Todo[] findByAssignee(int personId){

    }

    public Todo[] findByAssignee(Person assignee){

    }

    public Todo[] findUnassignedTodoItems(){

    }

    public void removeTodo(){ //Removes a Todo from the toDoItems Array

    }

}//class
