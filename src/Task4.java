import java.lang.Math;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,base;
        while (true) {
            System.out.print("Enter number part of logarithm: ");
            number = sc.nextInt();
            System.out.print("Enter base part of logarithm: ");
            base = sc.nextInt();
            if (number <= 0 || base <= 0){
                System.out.println("Values must be positive");
                continue;
            } else if (base == 1) {
                System.out.println("This can't be calculated");
                continue;
            }
            break;
        }
        System.out.println("Formula of logarithm is log_m(n) = log(number) / log(base)");

        double result = Math.log(number) / Math.log(base);

        System.out.println("Logarithm of "+number+" to base "+base+" is "+result);

//        homework = log n esasdan m i log() ile tap
    }
}