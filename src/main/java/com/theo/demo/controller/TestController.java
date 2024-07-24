package com.theo.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
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

        return "777";
    }


    /**
        * Retrieves the name with a prefix.
        *
        * @param name the name to be prefixed
        * @return the prefixed name
        */
    @RequestMapping(value = "/Name")
    public String getName(@PathVariable("name") String name) {
        
        return "Mr."+name;
    }



    @RequestMapping(value = "/Name1")
    public String getName1(@PathVariable("name") String name) {
        
        return "Mr."+name;
    }

}
