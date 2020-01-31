import java.util.*;
public class banking {
    public static void main(String[] args) {
        System.out.println("hello from banking class");
        account obj1 = new account();
        System.out.println(obj1);
        obj1.Details();
       
    }
}


class account {
    
      
    
      void Details() {
         
         Scanner input = new Scanner(System.in);
         int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result  = num1 + num2;
        System.out.println(result);
         input.close();
      }

}