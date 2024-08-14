class GenericsDemo {
    public int Variable_1;

    @Override
    public String toString() {
        return "" + Variable_1 + "";
    }
}

class Generics<Type_1, Type_2> {
    Type_1 CustomData_1;
    Type_2 CustomData_2;

    Generics(Type_1 MyData_1, Type_2 MyData_2) {
        this.CustomData_1 = MyData_1;
        this.CustomData_2 = MyData_2;
    }

    public Type_1 GetData_1() {
        return CustomData_1;
    }

    public Type_2 GetData_2() {
        return CustomData_2;
    }

    public void GetAllData() {
        System.out.println("Type 1 Data: " + CustomData_1 + " Type 2 Data: " + CustomData_2.toString());
        System.out.println("The DataType Of First Data Is -" + CustomData_1.getClass().getName());
        System.out.println("The DataType Of Second Data Is -" + CustomData_2.getClass().getName());
    }
}

public class Java_Generics {
    public static void main(String[] args) {
        GenericsDemo MyGeneric = new GenericsDemo();
        MyGeneric.Variable_1 = 123;
        Generics<String, GenericsDemo> MyObject = new Generics<String, GenericsDemo>("Hello World", MyGeneric);
        MyObject.GetAllData();
    }

}