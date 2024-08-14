

class Anonymus_Demo {
    public void ToBeOverriden() {
        System.out.println("The Method Is To Be Overriden Using @Override Annotation");
    }
}

public class Anonymus_Classes {

    public static void main(String[] args) {
        Anonymus_Demo MyObject = new Anonymus_Demo() {
            @Override
            public void ToBeOverriden() {
                System.out.println("Overriden Method Where Overriden Annotation is Used");
                System.out.println("This Is An Example Of Anonymus Class");
            }
        };
        MyObject.ToBeOverriden();
        
    }
}