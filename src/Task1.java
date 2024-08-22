import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter how many random number should be generated: ");
        int numberOfLoops = sc.nextInt();
        if (numberOfLoops < 0){
            System.out.println("Please write positive number");
        }
        int start, end;
        while (true) {
            System.out.print("Enter start of interval: ");
            start = sc.nextInt();
            System.out.print("Enter end of interval: ");
            end = sc.nextInt();
            if (start > end) {
                System.out.println("Start should be less than end value");
                continue;
            }
            break;
        }
        int sum = 0;
        for (int i = 0; i<numberOfLoops;i++){
            int RandomNumbers = r.nextInt(end - start + 1)+start; //bound end i goturur alinmayacaq
            System.out.println(RandomNumbers);
            sum+= RandomNumbers;
        }
        System.out.println("\nsum of "+numberOfLoops+" random number in interval of ["+start+","+end+"] is "+sum);
        sc.close();
    }
}
