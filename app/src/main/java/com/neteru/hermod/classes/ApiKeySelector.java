package com.neteru.hermod.classes;

import java.util.Random;

public class ApiKeySelector {
    private String[] keyList = new String[]{
                    "YOUR_NEWSAPI_KEY",
                    "YOUR_NEWSAPI_KEY",
                    "YOUR_NEWSAPI_KEY",
                    "YOUR_NEWSAPI_KEY",
                    "YOUR_NEWSAPI_KEY"

    };

    private ApiKeySelector(){}

    public static ApiKeySelector getInstance(){
        return new ApiKeySelector();
    }

    public String getKey(){
        return keyList[new Random().nextInt(keyList.length)];
    }
}
