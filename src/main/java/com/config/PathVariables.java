package com.config;

public class PathVariables {
    public static String baseDir = System.getProperty("user.dir");
    public static String mainJavaDir = "\\src\\main\\java";
    public static String testResourceDir = "\\src\\main\\resources";
    public static String browserType = "chrome";
    public static String testDataLoc = baseDir + testResourceDir + "\\testdata\\";
    public static String testURL = "http://automationpractice.com/index.php";

    private PathVariables() {
    }
}
