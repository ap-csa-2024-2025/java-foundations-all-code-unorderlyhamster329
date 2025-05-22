import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        long bignumber = 9999999;
        short shortington = 255;
        byte bytington = 42;

        Scanner input = new Scanner(System.in);
        System.out.println("whats ur grade");
        int grade = input.nextInt();
        System.out.println("ur grade next year is: " + (grade + 1));
        input.close();
    }
}
