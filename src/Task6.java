import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Endpoint: ");
        int Endpoint = sc.nextInt();
        int number1 =0;
        int number2 =1;
        int sum;
        for (int i = 0;i<Endpoint;i++){
            System.out.println(number1);
            sum = number1 + number2;
            number1 = number2;
            number2 = sum;
        }
    }
}

//n-nin istifadəçi tərəfindən daxil edildiyi n ədəddən ibarət Fibonaççi seriyasını çap etmək üçün proqram yazın:
//        0 1 1 2 3 5 8 13 24 .....
