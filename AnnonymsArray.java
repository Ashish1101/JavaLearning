class AnnonymsArray {
//    static int a = 10;
    static void Display(int A[]) {
      for(int i = 0; i < A.length; i++) {
          System.out.println(A[i]);
      }
    }
    public static void main(String[] args) {
              Display(new int[]{1,2,3,4,4,5,6,7}); 
            //   System.out.println(a);
    }
}