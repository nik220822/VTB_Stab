package com.nicode.controller;

import com.nicode.IbsVtbKafkaStubGrafanaApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    final static Logger logger = LoggerFactory.getLogger(IbsVtbKafkaStubGrafanaApplication.class);

    @GetMapping()
    public ResponseEntity<String> createLogs() {
        logger.warn("Just checking");
        return ResponseEntity.ok().body("Ok");
    }
}
