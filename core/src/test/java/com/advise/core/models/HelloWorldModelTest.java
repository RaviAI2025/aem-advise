package com.advise.core.models;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldModelTest {

    @Test
    public void testGetMessage() {
        HelloWorldModel model = new HelloWorldModel();
        assertEquals(null, model.getMessage());
    }
}
