package io.zipcoder;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import io.zipcoder.*;

import java.util.ArrayList;

public class ApplicationTest {

    Application app;
    Dog spot;
    Cat charlie;
    Fish flipper;
    Application newApp;

    @Before
    public void setup(){
        app = new Application();
        spot = new Dog("Spot");
        charlie = new Cat("Charlie");
        flipper = new Fish("Flipper");
        Pet[] tempArray = {spot, charlie, flipper};
        app.pets = tempArray;
    }

    @Test
    public void getPetNumberTest(){
        int expected = 3;
        int actual = app.getNumberOfPets();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKindOfPetsTest(){
        String expected = "Dog Cat Fish";
        String actual = app.getKindOfPets();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNamesOfPetsTest(){
        String expected = "Spot Charlie Flipper";
        String actual = app.getNamesOfPets();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getListTest(){
        String expected = "I have 3 pets. My Dog is Spot. My Cat is Charlie. My Fish is Flipper.";
        String actual = app.getList();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortTest(){
        newApp = new Application();
        spot = new Dog("Spot");
        charlie = new Cat("Charlie");
        flipper = new Fish("Flipper");
        Fish alpha = new Fish("Alpha");
        Pet[] tempArray = {spot, alpha, charlie, flipper};
        newApp.pets = tempArray;
        Pet[] Expected = {charlie, spot, alpha, flipper};
        Pet[] actual = newApp.getSortedPets();
    }

}
