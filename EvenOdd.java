import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter your number : ");
        int num = in.nextInt();
        if (num%2 == 0){
            System.out.printf("Given number is even number.");
        }
        else {
            System.out.printf("Given number is odd number.");
        }
    }
}
