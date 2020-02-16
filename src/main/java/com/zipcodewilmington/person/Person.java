package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String eyeColor;
    private boolean zipcoder;
    private int numberOfCorgisOwned;
    private int numberOfFestivalsAttended;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public Person(String name, int age, String eyeColor, boolean zipcoderStatus) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.zipcoder = zipcoderStatus;
    }

    public Person(String name, int age, String eyeColor, boolean zipcoderStatus, int numberOfCorgis) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.zipcoder = zipcoderStatus;
        this.numberOfCorgisOwned = numberOfCorgis;
    }

    public Person(String name, int age, String eyeColor, boolean zipcoderStatus, int numberOfCorgis, int festivalsAttended) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.zipcoder = zipcoderStatus;
        this.numberOfCorgisOwned = numberOfCorgis;
        this.numberOfFestivalsAttended = festivalsAttended;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setZipcoder(boolean value) {
        this.zipcoder = value;
    }

    public boolean getZipcoder() {
        return zipcoder;
    }

    public void setNumberOfCorgis(int newValue) {
        this.numberOfCorgisOwned = newValue;
    }

    public int getNumberOfCorgisOwned() {
        return numberOfCorgisOwned;
    }

    public void setNumberOfFestivalsAttended(int newValue) {
        this.numberOfFestivalsAttended = newValue;
    }

    public int getNumberOfFestivalsAttended() {
        return numberOfFestivalsAttended;
    }
}
