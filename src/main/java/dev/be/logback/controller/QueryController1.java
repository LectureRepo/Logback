package dev.be.logback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "SQL_LOG1")
@RestController
public class QueryController1 {

    @GetMapping("/query1")
    public String query() {

        log.trace("log --> TRACE");
        log.debug("log --> DEBUG");
        log.info("log --> INFO");
        log.warn("log --> WARN");
        log.error("log --> ERROR");

        if (true) {
            throw new RuntimeException();
        }

        return "Query";
    }
}
