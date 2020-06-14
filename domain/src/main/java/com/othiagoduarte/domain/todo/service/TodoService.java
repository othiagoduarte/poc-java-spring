package com.othiagoduarte.domain.todo.service;

import com.othiagoduarte.domain.todo.repository.TodoRepository;

public class TodoService {

    private TodoRepository repository = new TodoRepository();
//    private TodoProducers producersKafka = new TodoProducers();
    public TodoService() {
        System.out.print("TodoService");
    }
}
