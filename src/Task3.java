import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of interval: ");
        int start,end;
        while (true){
            System.out.print("Enter start of interval: ");
            start = sc.nextInt();
            System.out.print("Enter end of interval: ");
            end = sc.nextInt();
            if (start>end){
                System.out.println("Start should be less than end, please rewrite");
                continue;
            }
            break;
        }
        for (int i = start;i<=end;i++){
            double SquareRoot = Math.sqrt(i);
            if(SquareRoot % 1 ==0){
                System.out.println("Square Root of "+i+" is "+SquareRoot);
            }
        }
        sc.close();
    }
}
