package com.example.demo.data;

public record Human() implements SayHello{
    @Override
    public String hello(){
        return "hello";
    }
}
