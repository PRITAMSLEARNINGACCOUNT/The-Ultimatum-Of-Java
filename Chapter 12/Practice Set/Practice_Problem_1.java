package CalculatorPackage;

class BasicCalculator {
    public void Info() {
        System.out.println("This is a Basic Calculator");
    }

}

class ScientificCalculator {

    public void Info() {
        System.out.println("This is a Scientific Calculator");
    }
}

class HybridCalculator {

    public void Info() {
        System.out.println("This is a Hybrid Calculator");
    }
}

public class Practice_Problem_1 {
    public static void main(String[] args) {
        BasicCalculator MyBasicCalculator = new BasicCalculator();
        ScientificCalculator MyScCalculator = new ScientificCalculator();
        HybridCalculator MyHybridCalculator = new HybridCalculator();

        MyBasicCalculator.Info();
        MyScCalculator.Info();
        MyHybridCalculator.Info();
    }
}