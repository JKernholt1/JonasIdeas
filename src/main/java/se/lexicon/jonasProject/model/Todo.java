package se.lexicon.jonasProject.model;

public class Todo {
    private int todoId;
    private String description;
    private boolean done;
    private Person assignee;

    public Todo(int todoId, String description) {
        this.todoId = todoId;
        this.description = description;
        this.done = done;
        this.assignee = assignee;

    }
    public int getTodoId() {
        return todoId;
    }

    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getPerson() {
        return assignee;
    }

    public void setPerson(Person assignee) {
        this.assignee = assignee;
    }

}//class
