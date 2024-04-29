package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComplexNumbers complexNumbers1 = new ComplexNumbers();
        ComplexNumbers complexNumbers2 = new ComplexNumbers();
        ComplexNumbersActions complexNumbersActions = new ComplexNumbersActions();
        Main main = new Main();

        String name = "";
        int age = 0;

        //Start the program
        System.out.println("\n=) Hello! This is a program that performs the tasks of laboratory work in the discipline \"Object Oriented Programming\". " +
                "Let's start work!!!)");
        System.out.println(main.help());

        //Initialization of the eternal cycle
        while(true) {

            //Switch() declarations for different application modes
            switch(main.controlSYS()) {

                //Exit the loop and the program as a whole
                case (0): {
                    System.out.println("Before meeting!");
                    System.exit(0);
                }

                //Task 1.
                case (1): {
                    Person personTom = new Person();
                    System.out.println("Enter your character's name. In the case of multi-word names, separate them with the \"_\" character:");
                    personTom.setFullName(scanner.nextLine());
                    System.out.println("Enter your character's age:");
                    personTom.setAge(scanner.nextInt());
                    System.out.println(personTom.move());
                    System.out.println(personTom.talk());

                    System.out.println("Enter your character's name. In the case of multi-word names, separate them with the \"_\" character:");
                    name = scanner.nextLine();
                    System.out.println("Enter your character's age:");
                    age = scanner.nextInt();
                    Person personJack = new Person(name, age);
                    System.out.println(personJack.move());
                    System.out.println(personJack.talk());
                    System.out.println("Do you want to continue? Enter 6 for help or 0 to exit the program.");
                    break;
                }

                //Task 2.
                case (2): {
                    System.out.println("Let's look at the already set values and execution of the program written based on task 2:");
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
                    System.out.println("Do you want to continue? Enter 6 for help or 0 to exit the program.");
                    break;
                }

                //Task 3.
                case (3): {
                    System.out.println("Enter the length of the radius of the circle:");
                    Ball ball = new Ball(scanner.nextInt());
                    System.out.println(ball.getVolume());
                    System.out.println("Do you want to continue? Enter 6 for help or 0 to exit the program.");
                    break;
                }

                //Task 4.
                case (4): {
                    System.out.println("Let's look at the already set values and execution of the program written based on task 2:");
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
                    System.out.println("Do you want to continue? Enter 6 for help or 0 to exit the program.");
                    break;
                }

                //Task 5 and 6.
                case (5): {
                    System.out.println("Enter the real and imaginary parts of the first complex number:");
                    complexNumbers1.setRealPart(scanner.nextInt());
                    complexNumbers1.setImagePart(scanner.nextInt());
                    System.out.println(complexNumbers1.getNumber());
                    System.out.println(complexNumbers1.getModule());
                    System.out.println(complexNumbers1.getArgumentInRadian());
                    System.out.println(complexNumbers1.getArgumentInDegree());

                    System.out.println("Enter the real and imaginary parts of the second complex number:");
                    complexNumbers2.setRealPart(scanner.nextInt());
                    complexNumbers2.setImagePart(scanner.nextInt());
                    System.out.println(complexNumbers2.getNumber());
                    System.out.println(complexNumbers2.getModule());
                    System.out.println(complexNumbers2.getArgumentInRadian());
                    System.out.println(complexNumbers2.getArgumentInDegree());

                    System.out.println(complexNumbersActions.getSumTwoNum(complexNumbers1.getRealPart(), complexNumbers1.getImagePart(), complexNumbers2.getRealPart(), complexNumbers2.getImagePart()));
                    System.out.println(complexNumbersActions.getDifTwoNum(complexNumbers1.getRealPart(), complexNumbers1.getImagePart(), complexNumbers2.getRealPart(), complexNumbers2.getImagePart()));
                    System.out.println(complexNumbersActions.getMulTwoNum(complexNumbers1.getRealPart(), complexNumbers1.getImagePart(), complexNumbers2.getRealPart(), complexNumbers2.getImagePart()));
                    System.out.println(complexNumbersActions.getDivTwoNum(complexNumbers1.getRealPart(), complexNumbers1.getImagePart(), complexNumbers2.getRealPart(), complexNumbers2.getImagePart()));
                    System.out.println("Do you want to continue? Enter 6 for help or 0 to exit the program.");
                    break;
                }

                case (6): {
                    System.out.println("The essence of the program:");
                    System.out.println(main.help());
                    break;
                }

                //In case of error or unforeseen situations.
                default: {
                    System.out.println(main.ground());
                    System.out.println(main.help());
                    break;
                }
            }
        }
    }

    public int controlSYS() {
        Scanner scanner = new Scanner(System.in);
        int _control = 0;
        try {
            _control = scanner.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Please follow the instructions and be careful when working with this program.");
            return 11;
        }
        return _control;
    }

    //Help block
    public String help() {
        return """
                Enter 1 to display the result of task 1;\s
                Enter 2 to display the result of task 2;\s
                Enter 3 to display the result of task 3;\s
                Enter 4 to display the result of task 4;\s
                Enter 5 to display the result of tasks 5 and 6;\s
                Enter 0 to exit the program.""";
    }

    public String ground() {
        return "Please follow the instructions and be careful when working with this program.";
    }

}