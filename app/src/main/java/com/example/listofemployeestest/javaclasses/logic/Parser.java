package com.example.listofemployeestest.javaclasses.logic;

import com.example.listofemployeestest.javaclasses.entity.World;

public interface Parser {
    World parseStringToWorld(CharSequence jsonAsString);
}
