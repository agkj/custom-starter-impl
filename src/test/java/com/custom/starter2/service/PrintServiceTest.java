package com.custom.starter2.service;

import com.custom.starter2.config.PrintCustomServiceConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.junit.jupiter.api.Assertions.*;

class PrintServiceTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(PrintCustomServiceConfiguration.class));


    @Test
    void shouldContainTodoRestClientBean() {
        contextRunner.run(context -> {
            assertTrue(context.containsBean("printService"));
        });
    }



}