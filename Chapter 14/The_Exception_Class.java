class MyCustomException extends Exception {
    @Override
    public String toString() {
        return "This Is A Custom Exception";
    }

    @Override
    public String getMessage() {
        return "My Custom Error Message";
    }
}

public class The_Exception_Class {
    public static void main(String[] args) {
        int Value = -1;
        try {
            if (Value == -1) {
                throw new MyCustomException();
            }
        } catch (MyCustomException Error) {
            System.out.println(Error);
            Error.printStackTrace();
            System.out.println(Error.getMessage());
        }
    }
}