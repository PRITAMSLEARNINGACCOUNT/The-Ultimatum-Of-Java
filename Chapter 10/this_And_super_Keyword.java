class BaseParentClass {
    int Varriable;

    public void SetValue(int Varriable) {
        this.Varriable = Varriable;
    }

    public int GetValue() {
        return this.Varriable;
    }

    BaseParentClass() {
        System.out.println("BaseParentClass Constructor Called");
    }

    BaseParentClass(int Value) {
        Varriable = Value;
    }
}

class ChildDerivedClass extends BaseParentClass {
    ChildDerivedClass() {
        System.out.println("ChildDerivedClass Constructor Called");
    }

    ChildDerivedClass(int Value) {
        super(Value);
        System.out.println(
                "ChildDerivedClass Constructor Called And The Value Of A Varriable In Base Class Has Been Set");
    }
}

public class this_And_super_Keyword {
    public static void main(String[] args) {
        System.out.println("Object Of Derived Class Is Created");
        ChildDerivedClass Child = new ChildDerivedClass(10);
        System.out.println("The Value Of A Varriable In Base Class Is: " + Child.GetValue());
        Child.SetValue(20);
        System.out.println("The Value Of A Varriable In Base Class After Calling The Setter Of The Base Class Is: "
                + Child.GetValue());
        System.out.println("Another Object Of Derived Class Is Created");
        ChildDerivedClass Child_2 = new ChildDerivedClass();
        Child_2.SetValue(30);
        System.out.println("The Value Of A Varriable In Base Class After Calling The Setter Of The Base Class Is: "
                + Child_2.GetValue());

    }
}
