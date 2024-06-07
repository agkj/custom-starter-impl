package com.custom.starter2.config;

import com.custom.starter2.service.PrintService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;


@AutoConfiguration
@EnableConfigurationProperties(PrintCustomServiceProperties.class)
public class PrintCustomServiceConfiguration {


    private final PrintCustomServiceProperties printCustomServiceProperties;

    private static final Logger log = LoggerFactory.getLogger(PrintCustomServiceConfiguration.class);

    public PrintCustomServiceConfiguration(PrintCustomServiceProperties printCustomServiceProperties){
        log.info("Config set for " + printCustomServiceProperties);
        this.printCustomServiceProperties = printCustomServiceProperties;
    }

    @Bean("printService")
    PrintService printService(){
        return new PrintService();
    }




}
