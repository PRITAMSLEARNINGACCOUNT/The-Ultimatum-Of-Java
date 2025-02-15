interface First {
    // default method
    default void show() {
        System.out.println("Default method implementation of First interface.");
    }
}

interface Second {
    // Default method
    default void show() {
        System.out.println("Default method implementation of Second interface.");
    }
}

// Implementation class code
class Main implements First, Second {
// Overriding default show method
public void show(){
    System.out.println("Default method implementation of First interface.");
    System.out.println("Default method implementation of Second interface.");
} 
  
    public static void main(String args[]){ 
        Main q = new Main(); 
        q.show(); 
    } 
}