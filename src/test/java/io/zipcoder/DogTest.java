package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DogTest {

    Dog doug;

    @Before
    public void setup(){
        doug = new Dog("Doug");
    }

    @Test
    public void speakTest(){
        String expected = "Bark";
        String actual = doug.speak();
        Assert.assertEquals(expected, actual);
    }

}
