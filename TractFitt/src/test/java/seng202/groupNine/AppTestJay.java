package seng202.groupNine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTestJay {
    int x[];

    @Before
    public void setUp() throws Exception {
        App app = new App();
        x = app.getTestArray();
    }

    @Test
    public void getTestArray() {
        assertEquals(0, x[0]);
    }
}