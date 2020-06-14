package com.othiagoduarte.domain.todo.service;

import com.othiagoduarte.domain.todo.repository.TodoRepository;
import com.othiagoduarte.producers.kafka.todo.TodoProducers;

public class TodoService {

    public TodoRepository repository = new TodoRepository();
    public TodoProducers producersKafka = new TodoProducers();
    public TodoService() {
        System.out.print("TodoService");
    }
}
