package com.doikota.maven_sonar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	
	static Logger logger = LoggerFactory.getLogger(App.class);
	
    public String helloWorld() {
        return "Hello world!!!";
    }

    public static void main(String[] args) {
        logger.info(new App().helloWorld());
    }
}
