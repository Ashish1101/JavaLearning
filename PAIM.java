/* 
passing Array in MEthod or we can say in function
 */

class PAIM {
    static void maximum(int Arr[]) {
         int max_INT = -32768;
         for(int i = 0; i<Arr.length; i++) {
             if(Arr[i] > max_INT) {
                 max_INT = Arr[i];
             }

             
         }
         System.out.println(max_INT);
    }

    static void minimum(int Arr[]) {
        int min_INT = 32768;

       for(int i = 0; i < Arr.length; i++) {
           if(Arr[i] < min_INT) {
               min_INT = Arr[i];
           }
       }

       System.out.println(min_INT);
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        maximum(a);
        minimum(a);
    }
}