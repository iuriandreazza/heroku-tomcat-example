package com.controllers;

import com.models.ModelTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by iuriandreazza on 02/04/17.
 */
@RestController
@RequestMapping("/service/")
public class RestTest {


    @RequestMapping("/rest")
    public String index(){
        return "abc";
    }

}
