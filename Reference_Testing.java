class Super {
    int Varriable;
}
public class Reference_Testing {
    public static void ChangeValue(Super Obj) {
        Obj.Varriable = 20;
    }

    public static void main(String[] args) {
        Super SuperObject = new Super();
        SuperObject.Varriable = 10;
        System.out.println(SuperObject.Varriable);
        ChangeValue(SuperObject);
        System.out.println(SuperObject.Varriable);
    }
}
