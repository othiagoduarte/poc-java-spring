package com.othiagoduarte.controllers.facades;

import com.othiagoduarte.domain.todo.facade.TodoFacadeDomain;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ToDoControllersFacade {

    private TodoFacadeDomain todoFacadeDomain;

    public void save() {
        todoFacadeDomain.save();
    }
}
