package org.example;

public class Person {

    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person(){}

    public String move() {
        return fullName + ", who is " + age + " years old, runs, jumps, walks and has fun!";
    }

    public String talk() {
        return fullName + ", who is " + age + " years old, smiles, talks, jokes and grinds his tongue!";
    }
}
