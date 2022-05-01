import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("Please type a number");
        Scanner scanner = new Scanner(System.in);
//        int i = 0;
//        int num1 = scanner.nextInt();
//
//
//        do {
//            System.out.println(i);
//            i++;
//
//        }
//        while (i < num1);
        System.out.println("enter another number");
        int num2 = scanner.nextInt();
        int x = 0;
        while (x < num2) ;
        {
            if (x % 2 == 0) ;
            {
                System.out.println( "x = " + x);
            }

        }
    }
}
