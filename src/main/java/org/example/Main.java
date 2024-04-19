package org.example;
public class Main {
    public static void main(String[] args) {

        //Task 1.
        Person personTom = new Person();
        personTom.setFullName("Tomas Edison");
        personTom.setAge(23);
        System.out.println(personTom.move());
        System.out.println(personTom.talk());

        Person personJack = new Person("Jack Faster", 25);
        System.out.println(personJack.move());
        System.out.println(personJack.talk());

        //Task 2.
        Phone phoneHuawei = new Phone(799186430, "Huawei Honor 20 Pro", 174);
        Phone phoneSamsung = new Phone(158341656, "Samsung Galaxy Note 20 Ultra", 208);
        Phone phoneXiaomi = new Phone(730191503, "Xiaomi Redmi Note 8T", 200);
        System.out.println("This is " + phoneHuawei.getModel() + ", his weight is " + phoneHuawei.getWeight() + ", his number is " + phoneHuawei.getNumber());
        System.out.println("This is " + phoneSamsung.getModel() + ", his weight is " + phoneSamsung.getWeight() + ", his number is " + phoneSamsung.getNumber());
        System.out.println("This is " + phoneXiaomi.getModel() + ", his weight is " + phoneXiaomi.getWeight() + ", his number is " + phoneXiaomi.getNumber());
        System.out.println(phoneHuawei.receiveCall("Max") + "The phone number is " + phoneHuawei.getNumber() + ".");
        System.out.println(phoneSamsung.receiveCall("Tom") + "The phone number is " + phoneSamsung.getNumber() + ".");
        System.out.println(phoneXiaomi.receiveCall("Nick") + "The phone number is " + phoneXiaomi.getNumber() + ".");
        System.out.println(phoneHuawei.sendMessage(781154124, 485455589, 788845652));
        System.out.println(phoneSamsung.sendMessage(458816799, 482944395, 145888412, 188718166, 518811835));
        System.out.println(phoneXiaomi.sendMessage(485684225, 471155655));


    }
}