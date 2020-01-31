/**
 * returningArray
 */
class returningArray {
    
    static int[] show() {
        return new int[]{1,2,3,4,5,6,7};
    }

    static int b = 20;
    public static void main(String[] args) {
        
        int a[] = show();
        
        for (int i : a) {
            System.out.println(i);
        }

    }
    
}