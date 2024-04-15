package org.example;
public class Main {
    public static void main(String[] args) {

        Person personTom = new Person();
        personTom.setFullName("Tomas Edison");
        personTom.setAge(23);
        System.out.println(personTom.move());
        System.out.println(personTom.talk());

        Person personJack = new Person("Jack Faster", 25);
        System.out.println(personJack.move());
        System.out.println(personJack.talk());

    }
}