package com.tensquare.base.controller;


import com.itcast.entity.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class BaseExcuptionHandler {


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception  e){
        e.printStackTrace();
        return  new Result(false,2000,e.getMessage());
    }
}
