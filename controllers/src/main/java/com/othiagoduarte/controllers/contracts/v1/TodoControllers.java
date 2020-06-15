package com.othiagoduarte.controllers.contracts.v1;

import com.othiagoduarte.controllers.facades.ToDoControllersFacade;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
@AllArgsConstructor
public class TodoControllers {

    private ToDoControllersFacade facade;

    @GetMapping("save")
    public String helloWorld() {
        facade.save();
        return "save OK";
    }

    @GetMapping("")
    public String index() {
        return "index";
    }

}
