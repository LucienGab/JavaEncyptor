import java.util.Scanner;
public class enc {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            String text;
            // Enter username and press Enter
            System.out.println("Enter text to encrypt: ");
            text = myObj.nextLine();
            System.out.println("Encrypted text: " + encrypt(text));
        }
    }
// takes a string divides it into letters and then turns each letter into a number and then adds 1 to each number
    private static char[] split(String text) {
        text = text.toLowerCase();
        char[] split = text.toCharArray();
        return split;
    }
    private static int numberize(char split) {
        switch(split) {
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 3;
            case 'd':   
                return 4;
            case 'e':
                return 5;
            case 'f':
                return 6;
            case 'g':
                return 7;
            case 'h':
                return 8;
            case 'i':
                return 9;
            case 'j':
                return 10;
            case 'k':
                return 11;
            case 'l':
                return 12;
            case 'm':
                return 13;
            case 'n':
                return 14;
            case 'o':
                return 15;
            case 'p':
                return 16;
            case 'q':
                return 17;
            case 'r':
                return 18;
            case 's':
                return 19;
            case 't':
                return 20;
            case 'u':
                return 21;
            case 'v':
                return 22;
            case 'w':
                return 23;
            case 'x':
                return 24;
            case 'y':
                return 25;
            case 'z':
                return 26;
            case ' ':
                return 27;
            default:
                return 0;
        }
    }
    public static String encrypt(String text) {
        char[] split = split(text);
        int[] numbers = new int[split.length];
        StringBuilder funny = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            numbers[i] = numberize(split[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 14819273;
        }
        for (int i = 0; i < numbers.length; i++) {
            StringBuilder sb = new StringBuilder(Integer.toString(numbers[i]) + ":");
            funny.append(sb);
        }
        String TheEncrypted = funny.toString();
        return TheEncrypted;
    }
}