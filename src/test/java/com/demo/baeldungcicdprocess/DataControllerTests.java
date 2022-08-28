package com.demo.baeldungcicdprocess;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DataControllerTests {
    @Autowired
    DataController dataController;

    @Test
    void health(){
        assertEquals("STATUS CHECK OK", dataController.healthCheck());
    }

    @Test
    void version(){
        assertEquals("Version is 1.0.0", dataController.version());
    }

    @Test
    void nationsLength(){
        Integer nationsLength = dataController.getRandomNations().size();
        assertEquals("10", nationsLength);
    }

    @Test
    void currenciesLength(){
        Integer currenciesLength = dataController.getRandomCurrencies().size();
        assertEquals("20", currenciesLength);
    }
}
