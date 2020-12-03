package com.example.listofemployeestest.javaclasses.logic;

import com.google.gson.Gson;
import com.example.listofemployeestest.javaclasses.entity.World;

public class ParserJson implements Parser {
    public World parseStringToWorld(CharSequence jsonAsString) {
        return new Gson().fromJson(jsonAsString.toString(), World.class);
    }
}
