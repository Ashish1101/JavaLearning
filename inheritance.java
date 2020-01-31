

class Parent {
    static int x = 10;
    int y = 20;
    int arr[] = {1,2,3,4,5,6,7,8};
    public static void main(String[] args) {
       Parent obj = new Parent();
    //    System.out.println(obj.y);
    //    System.out.println(Parent.x);
       char A[] = {'A', 'B', 'C', 'D', 'E'};
       for (char c : A) {
           System.out.println(c);
       }

       for (int i : obj.arr) {
           System.out.println(i);
       }
    }
}

