package com.example.listofemployeestest.javaclasses.logic;

import com.example.listofemployeestest.javaclasses.entity.World;

// интерфейс для парсинга входных данных
// используется для простой замены класса-реализатора
// на другой
public interface Parser {
    World parseStringToWorld(CharSequence jsonAsString);
}
