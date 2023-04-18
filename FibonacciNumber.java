import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.printf("Enter Number : ");
        int num = obj.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;
        while(count <=num){
            int temp = i;
            i = i + p;
            p = temp;
            count++;
        }
        System.out.println(i);
    }
}
