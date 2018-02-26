package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatClass {

    Cat doug;

    @Before
    public void setup(){
        doug = new Cat("Doug");
    }

    @Test
    public void speakTest(){
        String expected = "Meow";
        String actual = doug.speak();
        Assert.assertEquals(expected, actual);
    }
}
