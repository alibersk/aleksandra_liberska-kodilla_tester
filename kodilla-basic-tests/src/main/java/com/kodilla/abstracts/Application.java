package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.giveVoice();

        Animal dog = new Dog();
        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
    }
}
