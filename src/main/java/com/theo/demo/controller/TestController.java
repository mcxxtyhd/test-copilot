package com.theo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The TestController class handles requests related to testing.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    /**
     * Retrieves a test response.
     *
     * @return The test response as a string.
     */
    @RequestMapping(value = "/theo")
    public String getTest() {

        Boolean a = false;
        while (a == true) {

            continue;

        }

        return "666";
    }

}
