package com.ivoronline.springboot_filter_exception_controlleradvice.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

  //==================================================================
  // HANDLE EXCEPTIONS
  //==================================================================
  @ResponseBody
  @ExceptionHandler
  public String handleExceptions(Exception exception) {
    return exception.getMessage();
  }

}

