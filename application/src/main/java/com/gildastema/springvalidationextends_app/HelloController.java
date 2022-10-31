package com.gildastema.springvalidationextends_app;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HelloController {

    @PostMapping("api/match")
    public void hello(@Valid @RequestBody HelloRequest helloRequest){

    }

    @PostMapping("api/unique")
    public  void unique(@Valid @RequestBody UniqueRequest uniqueRequest){

    }

}
