import java.util.*;
public class testing {
   public static void main(String[] args) {
       
       System.out.println("hello from main class");
       number N = new number();
       calculator obj = new calculator();
       System.out.print(N);
       N.display();
       obj.show();
       
   }
}

class number {
    number() {
        System.out.print("hello from number");
    }

    void display() {
        System.out.println("hello from calculator");
    }
}

class calculator {
    void show() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter Second number : ");
        int num2 = input.nextInt();
        System.out.println("Enter choice : ");
        int choice = input.nextInt();

    
        switch(choice) {
            case 1:
              int result = num1 + num2;
                 System.out.println("sum is " + result);
                 break;
            
            case 2:
               if(num1 < num2) {
                   int result3 = num1- num2;
                   System.out.println("Sub " + result3);
               }
               else {
                   int result2 = num1 - num2;
                   System.out.println("sub is" +result2);
               }
               break;
        }
        input.close();
    }
}

