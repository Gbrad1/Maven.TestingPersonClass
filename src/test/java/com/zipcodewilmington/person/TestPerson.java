package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithNameAgeEyeColor() {
        // Given
        String expectedName = "Leon";
        int expectedAge = 23;
        String expectedEyeColor = "green";

        // When
        Person person = new Person(expectedName, expectedAge, expectedEyeColor);

        // Then
        String actualName = person.getName();
        int actualAge = person.getAge();
        String actualEyeColor = person.getEyeColor();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
    }

    @Test
    public void testConstructorWithEyeColor() {
        Person daxter = new Person("Daxter", 5, "green");
        String expectedEyeColor = "green";
        String actualEyeColor = daxter.getEyeColor();
        Assert.assertEquals(expectedEyeColor,actualEyeColor);
    }

    @Test
    public void testConstructorIsAZipcoder() {
        Person jak = new Person("Jak", 25, "blue", true);
        String expectedName = "Jak";
        int expectedAge = 25;
        String expectedEyeColor = "blue";

        String actualName = jak.getName();
        int actualAge = jak.getAge();
        String actualEyeColor = jak.getEyeColor();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertTrue(jak.getZipcoder());
    }

    @Test
    public void testSetEyeColor() {
        Person jak = new Person("Jak", 25, null, true);
        jak.setEyeColor("blue");
        String expectedEyeColor = "blue";
        String actual = jak.getEyeColor();
        Assert.assertEquals(expectedEyeColor, actual);
    }

    @Test
    public void testIfZipCoder() {
        Person jak = new Person();
        jak.setZipcoder(true);
        Assert.assertTrue(jak.getZipcoder());
    }

    @Test
    public void setNumberOfCorgisOwned() {
        Person amanda = new Person();
        amanda.setNumberOfCorgis(10);
        int expectedNumberOfCorgis = 10;
        Assert.assertEquals(expectedNumberOfCorgis, amanda.getNumberOfCorgisOwned());
    }

    @Test
    public void setNumberOfFestivalsAttended() {
        Person timmy = new Person();
        timmy.setNumberOfFestivalsAttended(10);
        int actual = timmy.getNumberOfFestivalsAttended();
        Assert.assertEquals(10, actual);
    }

    @Test
    public void getNumberOfFestivalsAttended() {
        Person timmy = new Person("Timmy", 21, "green", false, 1, 10);
        int actual = timmy.getNumberOfFestivalsAttended();
        Assert.assertEquals(10, actual);
    }

}
