package com.othiagoduarte.domain.todo.facade;

import com.othiagoduarte.domain.todo.service.TodoService;

public class TodoFacade {

    public TodoService todoService = new TodoService();
    public TodoFacade(){
        System.out.print("TodoFacade");
    }
}
