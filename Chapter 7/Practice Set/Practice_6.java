public class Practice_6 {
    static float CalculateAvg(int... numbers) {
        float sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / (float) numbers.length;
    }

    public static void main(String[] args) {
        System.out.println("The Average Of The Numbers 1, 2, 3, 4, 5 Is: " + CalculateAvg(1, 2, 3, 4, 5,6));
    }
}
