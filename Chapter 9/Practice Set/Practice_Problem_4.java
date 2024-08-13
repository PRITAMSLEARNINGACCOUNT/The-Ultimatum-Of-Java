class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        length = 4;
        breadth = 5;
    }

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public void GetDetails() {
        if (length == 4 && breadth == 5) {
            System.out.println("The Default Value Of Length Of The Rectangle Is :- " + length);
            System.out.println("The Default Value Of Breadth Of The Rectangle Is :- " + breadth);
            return;
        }
        System.out.println("The Value Of Length Of The Rectangle Set By The Constructor Of This Class Is :- " + length);
        System.out.println("The Value Of Breadth Of The Rectangle Set By The Constructor Of This Class Is :- " + breadth);
    }


}

public class Practice_Problem_4 {
    public static void main(String[] args) {
        Rectangle MyRectangle = new Rectangle();
        MyRectangle.GetDetails();
        Rectangle MyRectangle_2 = new Rectangle(10, 20);
        MyRectangle_2.GetDetails();
    }
}
