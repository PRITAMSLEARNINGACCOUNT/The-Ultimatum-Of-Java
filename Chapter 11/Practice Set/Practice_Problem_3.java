interface BasicAnimal {
    void Eat();

    void Sleep();
}

class Monkey {
    void Jump() {
        System.out.println("Monkey_Animal Is Jumping");
    }

    void Bite() {
        System.out.println("Monkey_Animal Is Biting");
    }
}

class Human extends Monkey_Animal implements BasicAnimal {
    public void Eat() {
        System.out.println("Human Is Eating");
    }

    public void Sleep() {
        System.out.println("Human Is Sleeping");
    }
}

public class Practice_Problem_3 {
    public static void main(String[] args) {
        Human PRIAMSTECH = new Human();
        PRIAMSTECH.Eat();
        PRIAMSTECH.Sleep();
        PRIAMSTECH.Jump();
        PRIAMSTECH.Bite();
    }
}
