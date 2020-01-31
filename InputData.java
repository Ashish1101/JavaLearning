import java.util.*;

class inputData {
      
      public static void main( String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your choice : ");
         int i = input.nextInt();
        
         switch (i) {
             case 1:
                 System.out.println("hello case one");
                 break;
             case 2: 
                 System.out.println("hello case two");
                 break;
             default:
                 break;
         }
         input.close();
      }

}

