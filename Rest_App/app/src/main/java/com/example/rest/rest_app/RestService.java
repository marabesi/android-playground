package com.example.rest.rest_app;

public class RestService {

    private static String HTTP_BASE = "http://10.0.2.2:8080/";

    public static String FETCH_ALL = HTTP_BASE + "Shopping/Cart";

    public static String FETCH_ONE = HTTP_BASE + "Shopping/Cart?code={?}";

    public static String NEW_PRODUCT = HTTP_BASE + "Shopping/Cart";

}
