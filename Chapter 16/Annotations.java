import java.util.Date;
@FunctionalInterface
interface Functionalinterface {
    void MyMethod();
}

class Deprecation {
    @Deprecated
    void CustomDeprecatedMethod() {
        System.out.println("Custom Deprecated Method Is Made Using Deprecated Annotation");
    }

    void ToBeOverriden() {
        System.out.println("The Method Is To Be Overriden Using @Override Annotation");
    }

}

class ChildDeprecation extends Deprecation {
    @Override
    void ToBeOverriden() {
        System.out.println("Overriden Method Where Overriden Annotation is Used");
    }
}

public class Annotations {
    @SuppressWarnings("deprecation")
    public static void useDeprecatedMethod() {
        Date MyDate = new Date();
        MyDate.getDate();
        System.out.println("Deprecated method is used");
    }

    public static void main(String[] args) {
        useDeprecatedMethod();
        Deprecation MyObject = new Deprecation();
        MyObject.CustomDeprecatedMethod();
        ChildDeprecation MyObject_2 = new ChildDeprecation();
        MyObject_2.ToBeOverriden();
        Functionalinterface Myinterface=()->System.out.println("Functional Interface Method Implemented Using Lambda Expression");
        Myinterface.MyMethod();

    }
}
