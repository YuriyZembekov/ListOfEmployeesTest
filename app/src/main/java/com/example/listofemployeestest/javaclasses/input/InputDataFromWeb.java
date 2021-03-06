package com.example.listofemployeestest.javaclasses.input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// Класс читает информацию с сайта
public class InputDataFromWeb implements InputDataInterface {
    // Построчно читает данные с сайта возвращает String
    public String getPageAsString() {
        String pageAsString=null;
        URL inputDataURL = null;
        try {
            inputDataURL = new URL("http://www.mocky.io/v2/5ddcd3673400005800eae483");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try(BufferedReader inputStream = new BufferedReader(
                new InputStreamReader(inputDataURL.openStream()))) {
            String inputDataString;
            StringBuilder stringInputData = new StringBuilder();
            while ((inputDataString = inputStream.readLine()) != null) {
                stringInputData.append(inputDataString);
            }
            pageAsString = stringInputData.toString();
        } catch (Exception e){
            e.printStackTrace();
        }
        return pageAsString;
    }
}
