package com.parangluv.withmypet.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Redesign on 2017. 4. 9..
 */
@RestController
public class MovieController {

    @RequestMapping(value = "/api/movie")
    public JSONObject movieList() {
        JSONObject jsonObject = null;


        try {
            File file = new File("/Users/Redesign/Desktop/withmypet/withmypet/movies.json");
            System.out.println(file.getName());
            Object movieJson = new FileReader(file);
            jsonObject = (JSONObject)movieJson;

            return jsonObject;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return jsonObject;
    }
}