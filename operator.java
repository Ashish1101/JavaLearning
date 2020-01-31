class Operator {
   int a = 10;
   int b = 20;
   public static void main(String[] args) {
       Operator test = new Operator();
       switch (2) {
           case 1:
            int sum = test.a + test.b;
            System.out.println(sum);
            break;
            case 2:
            int sub = test.a - test.b;
            System.out.println(sub);
       }
   }
}