package com.ekaqa.automation.constatnts;

import lombok.experimental.UtilityClass;

import java.util.ResourceBundle;

@UtilityClass
public class UrlConstants {

    public static final String BASE_URL = ResourceBundle.getBundle("testdata").getString("baseUrl");
    public static final String URL_PART = ResourceBundle.getBundle("testdata").getString("urlPart");
    public static final int STATUS_CODE_200 = Integer.parseInt(ResourceBundle.getBundle("testdata").getString("Status200"));
    public static final int STATUS_CODE_201 = Integer.parseInt(ResourceBundle.getBundle("testdata").getString("Status201"));
    public static final String REQUEST_BODY = "{\n" +
            "  \"title\": \"random_title\",\n" +
            "  \"body\": \"random_body\",\n" +
            "  \"userId\": \"1\",\n" +
            "  \"id\": \"101\" \n}";
}
