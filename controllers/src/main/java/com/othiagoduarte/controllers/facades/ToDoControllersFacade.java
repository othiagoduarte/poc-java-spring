package com.othiagoduarte.controllers.facades;

import com.othiagoduarte.domain.todo.facade.TodoFacade;

public class ToDoControllersFacade {

    public TodoFacade todoFacade = new TodoFacade();

    public ToDoControllersFacade(){
        System.out.print("ToDoControllersFacade");
    }

}
