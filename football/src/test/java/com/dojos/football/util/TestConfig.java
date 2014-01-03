package com.dojos.football.util;

import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: sully.rafiq
 * Date: 19/09/2013
 * Time: 11:37
 * To change this template use File | Settings | File Templates.
 */
public class TestConfig {

    public static String getFilePath(String file) {
        URL url = Thread.currentThread().getContextClassLoader().getResource(file);
        return url.getPath();
    }
}
