package calc1;

import java.util.Scanner;

public class Calc1 {

    public static void main(String[] args) {
      int num_1, num_2, choice;
      
        System.out.println("1:+");
        System.out.println("2:-");
        System.out.println("3:*");
        System.out.println("4:/");
        System.out.println("5:%");
        
        System.out.print("Enter your choice:");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        System.out.print("Enter num1=");
        num_1 = input.nextInt();
        System.out.print("Enter num2=");
        num_2 = input.nextInt();
        calc(choice, num_1, num_2); // 3rd arg added for choice
    }
    public static void calc(int choice, int x, int y) { // 3rd param added for choice
        int c;

        switch (choice) {
            case 1:
                c = x + y;
                System.out.println("Output=" + c);
                break;
            case 2:
                c = x - y;
                System.out.println("Output=" + c);
                break;
            case 3:
                c = x * y;
                System.out.println("Output=" + c);
                break;
            case 4:
                c = x / y;
                System.out.println("Output=" + c);
                break;
              case 5:
                c = x % y;
                System.out.println("Output=" + c);
                break;  
        }
    }
}
    
