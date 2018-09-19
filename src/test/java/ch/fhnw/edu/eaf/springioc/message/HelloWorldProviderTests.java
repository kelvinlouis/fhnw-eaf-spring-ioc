package ch.fhnw.edu.eaf.springioc.message;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldProviderTests {
    private MessageProvider provider;

    @Before
    public void before() {
        provider = new HelloWorldProvider();
    }

    @Test
    public void testGetMessage(){
        assertEquals("Hello World", provider.getMessage());
    }
}
