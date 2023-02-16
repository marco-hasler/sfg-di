package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterinjectedControllerTest {

    SetterinjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterinjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void setGreetingService() {
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}