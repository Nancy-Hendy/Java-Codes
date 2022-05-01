public class Conditionals {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first number");
//        int num1 = scanner.nextInt();
//        System.out.println(" Enter a second number");
//        int num2 = scanner.nextInt();

//        if (num1 > num2) {
//            System.out.println(num1);
//        } else {
//            System.out.println(num2);
//        }
//        System.out.println(" Enter a third number");
//        int num3 = scanner.nextInt();
//
//        if (num3 % 2 == 0) {
//            System.out.println("It's an even number");
//        } else {
//            System.out.println("It's an odd number");
//        }
//        System.out.println(" Enter a traffic light colour");
//        String chosenColor = scanner.next();
//
//        if (chosenColor.equals("green")) {
//            System.out.println("green means go");
//        } else if (chosenColor.equals("red")) {
//            System.out.println("stop");
//        } else if (chosenColor.equals("yellow")) {
//            System.out.println("get ready");
//
//        } else {
//            System.out.println("invalid input");
//        }

        System.out.println("Please, Enter a number between 1 and 12");
        int month = scanner.nextInt();

        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("It's Winter");
                break;
            case 4:
            case 5:
            case 3:
                System.out.println("It's Spring");
                break;
            case 7:
            case 8:
            case 6:
                System.out.println("It's Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It's Autumn");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}