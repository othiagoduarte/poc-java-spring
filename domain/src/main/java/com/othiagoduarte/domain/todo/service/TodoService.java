package com.othiagoduarte.domain.todo.service;

import com.othiagoduarte.domain.todo.repository.TodoRepository;
import com.othiagoduarte.producers.kafka.todo.TodoProducers;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TodoService {

    private TodoRepository repository;
    private TodoProducers producers;

    public void save() {
        repository.save();
        producers.save();
    }
}
