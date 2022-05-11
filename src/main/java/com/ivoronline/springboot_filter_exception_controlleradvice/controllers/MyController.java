package com.ivoronline.springboot_filter_exception_controlleradvice.controllers;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class MyController {

  //==================================================================
  // HELLO
  //==================================================================
  // http://localhost:8080/Hello?name=John
  @RequestMapping("Hello")
  String hello(@RequestParam String name) {
    return "Hello " + name;
  }


}

