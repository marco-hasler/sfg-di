package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterinjectedControllerTest {

    SetterinjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterinjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void setGreetingService() {
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}