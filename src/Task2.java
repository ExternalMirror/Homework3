import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int start,end;
        while (true) {
            System.out.print("Enter the value of num1: ");
            start = sc.nextInt();
            System.out.print("Enter the value of num2: ");
            end = sc.nextInt();
            if (end < start) {
                System.out.println("Value of num1 must be less than value of num2");
                continue;
            }
            break;
        }
        int RandomNum1 = r.nextInt(end - start + 1)+ start;
        int RandomNum2 = r.nextInt(end - start + 1)+ start;
        System.out.println("first random number is "+RandomNum1+" ,second random number is "+RandomNum2);
        int MinValue = Math.min(RandomNum1,RandomNum2);
        int MaxValue = Math.max(RandomNum1,RandomNum2);
        System.out.println("Maximum number between 2 random number is "+MaxValue);
        System.out.println("Minimum number between 2 random number is "+MinValue);
        sc.close();
    }
}