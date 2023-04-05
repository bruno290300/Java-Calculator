import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args) {
        showMenu();
    }
    
    public static void showMenu() {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println(Constants.CALCULATOR);
            System.out.println("-------------");
            System.out.println("1. " + Constants.SUMA);
            System.out.println("2. " + Constants.RESTA);
            System.out.println("3. " + Constants.MULTIPLY);
            System.out.println("4. " + Constants.DIVIDE);
            System.out.println("5. " + Constants.EXIT);
            System.out.print(Constants.ENTER_YOUR_CHOICE);
            
            int choice = input.nextInt();
            
            if (choice == 5) {
                System.out.println(Constants.EXIT);
                break;
            }
            
            System.out.print(Constants.ENTER_THE_FIRST_NUMBER);
            double num1 = input.nextDouble();
            System.out.print(Constants.ENTER_THE_SECOND_NUMBER);
            double num2 = input.nextDouble();
            
            switch (choice) {
                case 1:
                    System.out.println(Constants.THE_RESULT_IS + (num1 + num2));
                    break;
                case 2:
                    System.out.println(Constants.THE_RESULT_IS + (num1 - num2));
                    break;
                case 3:
                    System.out.println(Constants.THE_RESULT_IS + (num1 * num2));
                    break;
                case 4:
                    System.out.println(Constants.THE_RESULT_IS + (num1 / num2));
                    break;
                default:
                    System.out.println(Constants.INVALID_CHOICE);
                    break;
            }
            
            System.out.println();
        }
        
        input.close();
    }
    
}



