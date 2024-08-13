interface Basicanimal {
    void Eat();

    void Sleep();
}

class Monkey_Animal {
    void Jump() {
        System.out.println("Monkey Is Jumping");
    }

    void Bite() {
        System.out.println("Monkey Is Biting");
    }
}

class HumanBeing extends Monkey_Animal implements Basicanimal {
    public void Eat() {
        System.out.println("Human Is Eating");
    }

    public void Sleep() {
        System.out.println("Human Is Sleeping");
    }
}

public class Practice_Problem_5 {
    public static void main(String[] args) {
        System.out.println("Demonstrating Polymorphism By Using HumanBeing As A HumanBeing");
        HumanBeing PRIAMSTECH = new HumanBeing();
        PRIAMSTECH.Eat();
        PRIAMSTECH.Sleep();
        PRIAMSTECH.Jump();
        PRIAMSTECH.Bite();
        System.out.println("Demonstrating Polymorphism By Using HumanBeing As A Basicanimal");
        Basicanimal PRIAMSTECH2 = new HumanBeing();
        PRIAMSTECH2.Eat();
        PRIAMSTECH2.Sleep();
        System.out.println("Demonstrating Polymorphism By Using HumanBeing As A Monkey_Animal");
        Monkey_Animal PRIAMSTECH3 = new HumanBeing();
        PRIAMSTECH3.Jump();
        PRIAMSTECH3.Bite();
    }
}
