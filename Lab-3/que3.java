interface SwimBehavior {
    void swim();
}

interface FlyBehavior {
    void fly();
}

interface QuackBehavior {
    void quack();
}

class RubberDuck implements SwimBehavior, QuackBehavior {
    public void swim() {
        System.out.println("Rubber Duck is swimming.");
    }

    public void quack() {
        System.out.println("Rubber Duck squeaks.");
    }
}

class WoodenDuck implements SwimBehavior {
    public void swim() {
        System.out.println("Wooden Duck is swimming.");
    }
}

class RedHeadDuck implements SwimBehavior, FlyBehavior, QuackBehavior {
    public void swim() {
        System.out.println("RedHead Duck is swimming.");
    }

    public void fly() {
        System.out.println("RedHead Duck is flying.");
    }

    public void quack() {
        System.out.println("RedHead Duck quacks.");
    }
}

class LakeDuck implements SwimBehavior, QuackBehavior {
    public void swim() {
        System.out.println("Lake Duck is swimming.");
    }

    public void quack() {
        System.out.println("Lake Duck quacks.");
    }
}

public class que3 {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        rubberDuck.swim(); 
        rubberDuck.quack(); 

        woodenDuck.swim(); 

        redHeadDuck.swim(); 
        redHeadDuck.fly(); 
        redHeadDuck.quack(); 

        lakeDuck.swim();
        lakeDuck.quack(); 
    }
}