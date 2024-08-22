import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low;
        while (true) {
            System.out.print("Enter low: ");
            low = sc.nextInt();
            if (low == 0){
                System.out.println("low can't be zero");
                continue;
            }
            break;
        }
        double sum = 0;
        int NegativeOrPositive = (low < 0)? -1:1;
        for (int i =1; i<=Math.abs(low);i++){
            double result = (double) NegativeOrPositive /i;
            sum+=result;
        }
        System.out.format("%.2f",sum);

//        İstifadəçi tərəfindən n-nin daxil edildiyi aşağıdakı seriyaların cəmini hesablamaq üçün proqram yazın.
//        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

    }
}
