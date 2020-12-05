package com.example.listofemployeestest.javaclasses.input;
// Временный класс, возвращает данные для парсировки
public class InputDataHardware implements InputDataInterface {
    @Override
    public String getPageAsString() {
        return "{\n" +
                "    \"company\": {\n" +
                "        \"name\":\"High Technologies Center\",\n" +
                "        \"age\": \"18\",\n" +
                "        \"competences\": [\"Android\", \"IOS\", \".NET\", \"PHP\", \"Smart-TV\", \"Java\"],\n" +
                "    \t\"employees\": [{\n" +
                "\t\t\t\"name\": \"John\",\n" +
                "\t\t\t\"phone_number\": \"769453\",\n" +
                "\t\t\t\"skills\": [\"Java\", \"Android\"]\n" +
                "\t\t}, {\n" +
                "\t\t\t\"name\": \"Diego\",\n" +
                "\t\t\t\"phone_number\": \"987924\",\n" +
                "\t\t\t\"skills\": [\"Java\", \"Smart-TV\"]\n" +
                "\t\t}, {\n" +
                "\t\t\t\"name\": \"Alfred\",\n" +
                "\t\t\t\"phone_number\": \"452533\",\n" +
                "\t\t\t\"skills\": [\"Objective-C\", \"Android\", \"Photoshop\"]\n" +
                "\t\t}, {\n" +
                "\t\t\t\"name\": \"John\",\n" +
                "\t\t\t\"phone_number\": \"212456\",\n" +
                "\t\t\t\"skills\": [\"Java\", \"Phython\"]\n" +
                "\t\t}, {\n" +
                "\t\t\t\"name\": \"Mat\",\n" +
                "\t\t\t\"phone_number\": \"778975\",\n" +
                "\t\t\t\"skills\": [\"Android\", \"MovieMaker\"]\n" +
                "\t\t}, {\n" +
                "\t\t\t\"name\": \"Bob\",\n" +
                "\t\t\t\"phone_number\": \"456468\",\n" +
                "\t\t\t\"skills\": [\"Groovy\", \"Kotlin\"]\n" +
                "\t\t}, {\n" +
                "    \t\t\"name\": \"Marty\",\n" +
                "\t\t\t\"phone_number\": \"123\",\n" +
                "\t\t\t\"skills\": [\"Android\"]\n" +
                "\t\t}, {\n" +
                "\t\t\t\"phone_number\": \"321789\",\n" +
                "\t\t\t\"skills\": [\"PHP\"]\n" +
                "\t\t}, {\n" +
                "    \t\t\"name\": \"Morty\",\n" +
                "\t\t\t\"skills\": [\"C#\"]\n" +
                "\t\t}, {\n" +
                "    \t\t\"name\": \"Rick\",\n" +
                "\t\t\t\"phone_number\": \"321789\"\n" +
                "\t\t}]\t\n" +
                "\t}\n" +
                "}";
    }
}
