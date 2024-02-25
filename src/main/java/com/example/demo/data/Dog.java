package com.example.demo.data;

public record Dog() implements SayHello{
    @Override
    public String hello(){
        return "hello";
    }
}
