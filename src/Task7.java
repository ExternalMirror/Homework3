import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start,end;
        while (true) {
            System.out.print("Enter the start of the interval (a): ");
            start = sc.nextInt();
            System.out.print("Enter the end of the interval (b): ");
            end = sc.nextInt();
            if(start < 0 || end < 0){
                System.out.println("numbers can't be negative");
                continue;
            }
            if (start>end){
                System.out.println("start must be less than end");
                continue;
            }
            break;
        } //same thing as others,

        for (int i = start; i <= end; i++) {
            int sum = 0;
            int number = i;
            int LengthOfNumber = String.valueOf(i).length(); //turn strong nd fin length

            while (number != 0) {
                int digit = number % 10; //this divide gives last 1st from last digit
                sum += (int) Math.pow(digit,LengthOfNumber);
                number /= 10; //this one removes last digit.
            }
            if (sum == i) {
                System.out.println(i + " are Armstrong numbers ");
            }
        }
//        int num = sc.nextInt();
//        int digit = num % 10;
//        num /= 10;
//        System.out.println(num);
//        sc.close();
    }
}
