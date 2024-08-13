public class String_Methods {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.printf("The Length Of The String Is - %d\n", str.length());
        System.out.format("The Character At Index 4 Is - %c\n", str.charAt(4));
        System.out.println("The Substring From Index 4 To 8 Is - " + str.substring(4, 8));
        System.out.print("The Substring Method Using In A Different Way - Starting From Index 5 To Ending Index\n" + str.substring(5));
        System.out.println("The Index Of The Character 'W' Is - " + str.indexOf('W'));
        String SecondString = "     hdkjhfdss      ";
        System.out.println("Removing Unwanted Whitespaces From A Sentence - " + SecondString.trim());
        String ThirdString = "HELLO";
        System.out.println("Converting The String To Lowercase - " + ThirdString.toLowerCase());
        System.out.println("Converting The String To Uppercase - " + SecondString.toUpperCase());
        System.out.println("Replacing The Character 'L' With 'M' - " + ThirdString.replace('L', 'M'));
        System.out.println("Replacing The Word \"hdkjhfdss\" With \"Queen\" - " + ThirdString.replace("hdkjhfdss", "Queen"));
        System.out.println("Checking If The String Starts With 'H' - " + ThirdString.startsWith("H"));
        System.out.println("Checking If The String Ends With 'O' - " + ThirdString.endsWith("F"));
        System.out.println("The Index Of The Character 'W' After Index No 2 Is - " + str.indexOf('W', 2));
        String FourthString = "Harry Bhai";
        System.out.println("The Last Index Of 'r' In The Fourth String Is - " + FourthString.lastIndexOf('r'));
        String FifthString = "rayrrr";
        System.out.println("The Last Index Of 'r' Before Index 2 In The Fourth String Is - " + FifthString.lastIndexOf('r', 2));
        System.out.println("Checking If The String Is Equal To \"Hello World\" - " + str.equals("hello world"));
        System.out.println("Checking If The String Is Equal To \"Hello World\" Irrespective Of The Case Of Charecters - " + str.equalsIgnoreCase("hello world"));


    }
}
