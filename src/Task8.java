import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial;
        while(true) {
            System.out.print("Enter factorial: ");
            factorial = sc.nextInt();
            if (factorial < 0){
                System.out.println("Factorial can't be negative");
                continue;
            }
            break;
        }
        if (factorial == 0){
            System.out.println("Factorial is 1");
            return;
        }
        int multiply = 1;
        for (int i = 1; i<=factorial;i++){
            multiply*=i;
        }
        System.out.println(multiply);
    }
}
//    n faktorialı hesablayan proqram tərtib edin. Məsələn,5!=5*4*3*2*1