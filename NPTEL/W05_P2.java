import java.util.Scanner;

interface GCD {
    public int findGCD(int n1, int n2);
}

class B implements GCD {

    @Override
    public int findGCD(int n1, int n2) {
        // int n1,n2;

        // if(n1==0&& n2==0) {
        // #___________
        // }
        // else if(n2 == 0){
        // #___________
        // }

        // else {
        // return findGCD(//#___________);
        // }
        // }
        // }
    }
}

public class W05_P2 {
    public static void main(String[] args) {
        B a = new B(); // Create an object of class B
        // Read two numbers from the keyboard
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        System.out.print(a.findGCD(p1, p2));
    }
}
