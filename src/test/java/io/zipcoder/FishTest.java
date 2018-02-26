package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FishTest {
    Fish doug;

    @Before
    public void setup(){
        doug = new Fish("Doug");
    }

    @Test
    public void speakTest(){
        String expected = "Blub";
        String actual = doug.speak();
        Assert.assertEquals(expected, actual);
    }
}
