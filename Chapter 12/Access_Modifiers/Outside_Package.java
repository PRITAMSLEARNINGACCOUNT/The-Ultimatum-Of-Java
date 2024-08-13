package OutsidePackage;

import DepthUnderstanding.Public;
import DepthUnderstanding.Default;
import DepthUnderstanding.Protected;

class PublicInheritance extends Public {
    void Display() {
        System.out.println("Successfully Inherited From A Public Class");
    }
}
// public class Outside_Package extends DefaultClass { --> Will Throw An Error
// As Default Access Modifier Can Not Be Accessed Outside From The Package Using
// Inheritance Or Non-Using Inheritance.

public class Outside_Package extends Protected {
    void DisplayProtectedProperty() {
        System.out.println(ProtectedProperty);
    }

    public static void main(String[] args) {
        PublicInheritance MyObject = new PublicInheritance();
        MyObject.Display();
        System.out.println("Successfully Inherited From A Protected Class");
    }
}