import java.util.*;

class student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name");
        String name = input.nextLine();
        System.out.print("Enter roll no.");
        int roll = input.nextInt();
        System.out.print("Enter Mobile : ");
        long m = input.nextLong();
        System.out.print("Enter Gender : ");
        char g = input.next().charAt(0);
        System.out.println("Name : " +name);
        System.out.println("Roll No. : " +roll);
        System.out.println("Mobile : " +m);
        System.out.println("Gender : " +g);
        input.close();
    }
}