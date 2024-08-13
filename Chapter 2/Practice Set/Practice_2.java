public class Practice_2 {
    public static void main(String[] args) {
        char Grade = 'A';
        Grade = (char) (Grade + 8);
        System.out.println("Encrypted Grade: " + Grade);
        System.out.println("Decrypted Grade/Real Grade: " + (char) (Grade - 8));
    }
}
