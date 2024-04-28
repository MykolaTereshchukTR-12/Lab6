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

        //Task 3.
        Ball ball = new Ball(5);
        System.out.println(ball.getVolume());

        //Task 4.
        Sedan sedan = new Sedan();
        sedan.setModel("Honda Accord");
        sedan.setColor("blue");
        sedan.setMaxSpeed(100);
        sedan.setDrives("front wheel");
        sedan.setEngines("gasoline engine");
        System.out.println(sedan.getInfo());
        System.out.println(sedan.getDrives());
        System.out.println(sedan.getEngines());
        System.out.println(sedan.gas());
        System.out.println(sedan.brake());

        Truck truck = new Truck();
        truck.setModel("Scania R580");
        truck.setColor("white");
        truck.setMaxSpeed(110);
        truck.setBodyType("van");
        truck.setCarryingCapacity(50);
        System.out.println(truck.getInfo());
        System.out.println(truck.cargo());
        System.out.println(truck.gas());
        System.out.println(truck.brake());

        //Task 5.
        ComplexNumbers complexNumbers = new ComplexNumbers();
        complexNumbers.setRealPart(2);
        complexNumbers.setImagePart(2);
        System.out.println(complexNumbers.getNumber());
        System.out.println(complexNumbers.getModule());
        System.out.println(complexNumbers.getArgument());
    }
}