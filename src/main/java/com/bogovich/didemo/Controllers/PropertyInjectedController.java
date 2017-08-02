package com.bogovich.didemo.Controllers;

import com.bogovich.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingServiceImpl greetingService;
    // Похватывается из-за того что имя класса совпадает с уже существующем бином
    //public GreetingService greetingServiceImpl; //Реализация через интерфейс, автосвзязь происходит за счет имени переменной

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
