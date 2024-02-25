package com.example.demo.data;

public sealed interface Shape permits Circle, Rectangle, Triangle{
    Long area();
}
