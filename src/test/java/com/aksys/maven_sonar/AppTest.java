package com.aksys.maven_sonar;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testHelloWorld() {
        App app = new App();
        assertEquals("Hello world!!!", app.helloWorld());
    }

    @Test
    public void testMain() {
    	App.main(new String[]{});
        assertTrue(true);
    }
}
