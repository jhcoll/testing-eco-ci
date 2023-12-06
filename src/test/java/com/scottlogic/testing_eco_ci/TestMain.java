package com.scottlogic.testing_eco_ci;


import org.junit.jupiter.api.Test;
import org.junitpioneer.jupiter.StdIo;
import org.junitpioneer.jupiter.StdOut;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    @StdIo
    public void testMain(StdOut out) {
        Main.main(new String[0]);
        assertEquals("Hello World!", out.capturedLines()[0]);
    }
}