public class Practice_3 {
    public static void main(String[] args) {
        String letter = "Dear <|name|>,\n\tThanks a lot";
        letter = letter.replace("<|name|>", "Pritam");
        System.out.println(letter);
    }
}
