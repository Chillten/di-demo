package com.bogovich.didemo.controllers;

import com.bogovich.didemo.services.GreetingService;
import com.bogovich.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingServiceImpl greetingService;
    // Похватывается из-за того что имя класса совпадает с уже существующем бином
    public GreetingService greetingServiceImpl; //Реализация через интерфейс, автосвзязь происходит за счет имени переменной
    // Так же в этом случаи из-за интерфейса будет браться primary been, в то время как имя класса будет отражать имя been-а
//    public String sayHello(){
//        return greetingServiceImpl.sayGreeting();
//    }
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
