public class Exam_Temp {

    public static void main(String[] args) {
        try {
            int x=10/0;
        } catch(ArithmeticException Ae){
            System.out.println(Ae);
        }catch(Exception e){
            System.out.println("An Exception Occured");
        }
    }
}