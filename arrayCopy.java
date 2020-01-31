/* Copying one array to other */

class arrayCopy {

    static void copyArr(int arr[], int brr[]) {
        for(int i = 0; i <(arr.length & brr.length); i++ ) {
           if(brr.length <= arr.length) {
               brr[i] = arr[i];
           } else {
               System.out.println("Array out of bound");
           } 

        }

        for(int i = 0; i < brr.length;  i++) {
            System.out.println(brr[i]);
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,6};
        int b[] = new int[5];
        copyArr(a, b);
    }
}