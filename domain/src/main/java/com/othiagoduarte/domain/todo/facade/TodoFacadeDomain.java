package com.othiagoduarte.domain.todo.facade;

import com.othiagoduarte.domain.todo.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class TodoFacadeDomain {
    private TodoService todoService;

    public void save() {
        todoService.save();
    }
}
