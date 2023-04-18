import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter first Number : ");
        int a = in.nextInt();
        System.out.printf("Enter second Number : ");
        int b = in.nextInt();
        System.out.printf("Enter third Number : ");
        int c = in.nextInt();

        int max = a;
        if( b> max){
            max = b;
        }
        if( c > max ){
            max = c;
        }
        System.out.println("Largest Number is : " +max );
    }
}
