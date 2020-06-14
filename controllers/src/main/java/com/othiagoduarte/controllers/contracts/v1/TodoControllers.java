package com.othiagoduarte.controllers.contracts.v1;

import com.othiagoduarte.controllers.facades.ToDoControllersFacade;

public class TodoControllers {
    public ToDoControllersFacade facade = new ToDoControllersFacade();

    public TodoControllers() {
        System.out.print("TodoControllers");
    }
}
