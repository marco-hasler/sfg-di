package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class ProbertyInjectedController {

    public GreetingService greetingService;

    public  String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
