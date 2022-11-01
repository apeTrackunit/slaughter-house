package com.example.testrestapi.controller;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.ArrayList;

@Deprecated
public class DbController {
    public static Object readJsonSimpleDemo(String filename) {
        try {
            FileReader reader = new FileReader(filename);
            JSONParser jsonParser = new JSONParser();
            return jsonParser.parse(reader);
        }
        catch (Exception ex ){
            return new JSONObject[0];
        }
    }
}
