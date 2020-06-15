package com.othiagoduarte.controllers.facades;

import com.othiagoduarte.domain.todo.facade.TodoFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ToDoControllersFacade {

    private TodoFacade todoFacade;

    public void save() {
        todoFacade.save();
    }
}
