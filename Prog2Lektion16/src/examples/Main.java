package examples;


import examples.models.MallardDuck;
import examples.models.RedheadDuck;
import examples.models.RubberDuck;

public class Main {
    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        mallard.quack();
        mallard.fly();
        RedheadDuck redhead = new RedheadDuck();
        redhead.quack();
        redhead.fly();
        RubberDuck rubber = new RubberDuck();
        rubber.quack();
        rubber.fly();
    }
}