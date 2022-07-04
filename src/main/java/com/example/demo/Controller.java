package com.example.demo;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @PostMapping("/credit")
    String creditRequest(@RequestBody Details ob)
    {
        Answer answer = new Answer();
        answer.name = ob.name;
        answer.number = (int) (Math.random() * 1000);
        return new Gson().toJson(answer);
    }
}
