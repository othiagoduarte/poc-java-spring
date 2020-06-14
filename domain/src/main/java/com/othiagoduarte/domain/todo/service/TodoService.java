package com.othiagoduarte.domain.todo.service;

import com.othiagoduarte.domain.todo.repository.TodoRepository;
import com.othiagoduarte.producers.kafka.todo.TodoProducers;

public class TodoService {

    private TodoRepository repository = new TodoRepository();
    private TodoProducers producersKafka = new TodoProducers();
    public TodoService() {
        System.out.print("TodoService");
    }
}
