package com.example.demo.data;

public record Cat() implements SayHello{
    @Override
    public String hello(){
        return "hello";
    }
}
