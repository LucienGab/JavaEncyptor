import java.util.Scanner;
public class dec {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            String text;
            // Enter username and press Enter
            System.out.println("Enter text to decrypt: ");
            text = myObj.nextLine();
            System.out.println("decrypted text: " + decrypt(text));
        }
    }
    private static String decrypt(String text) {
        int[] num = numberize(text);
        //for each number in the array divide it by 14
        for (int i = 0; i < num.length; i++) {
            num[i] /= 14819273;
        }
        //take each number and turn it into a letter
        String decrypted = "";
        for (int i = 0; i < num.length; i++) {
            switch (num[i]) {
                case 1:
                    decrypted += "a";
                    break;
                case 2:
                    decrypted += "b";
                    break;
                case 3:
                    decrypted += "c";
                    break;
                case 4:
                    decrypted += "d";
                    break;
                case 5:
                    decrypted += "e";
                    break;
                case 6:
                    decrypted += "f";
                    break;
                case 7:
                    decrypted += "g";
                    break;
                case 8:
                    decrypted += "h";
                    break;
                case 9:
                    decrypted += "i";
                    break;
                case 10:
                    decrypted += "j";
                    break;
                case 11:
                    decrypted += "k";
                    break;
                case 12:
                    decrypted += "l";
                    break;
                case 13:
                    decrypted += "m";
                    break;
                case 14:
                    decrypted += "n";
                    break;
                case 15:
                    decrypted += "o";
                    break;
                case 16:
                    decrypted += "p";
                    break;
                case 17:
                    decrypted += "q";
                    break;
                case 18:
                    decrypted += "r";
                    break;
                case 19:
                    decrypted += "s";
                    break;
                case 20:
                    decrypted += "t";
                    break;
                case 21:
                    decrypted += "u";
                    break;
                case 22:
                    decrypted += "v";
                    break;
                case 23:
                    decrypted += "w";
                    break;
                case 24:
                    decrypted += "x";
                    break;
                case 25:
                    decrypted += "y";
                    break;
                case 26:
                    decrypted += "z";
                    break;
                case 27:
                    decrypted += " ";
                    break;
            }
        }
        return decrypted;
    }
    public static int[] numberize(String text) {
        String[] f = split(text);
        //turn the string of numbers into an array of numbers
        int[] numbers = new int[f.length];
        for (int i = 0; i < f.length; i++) {
            numbers[i] = Integer.parseInt(f[i]);
        }
        return numbers;
    }
    private static String[] split(String text) {
        text = text.toLowerCase();
        String[] split = text.split(":");
        return split;
    }
}
