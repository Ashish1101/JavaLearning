class test {
    static void addition(int arr[]) {
        int sum = 0;
        int result;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            
        }

        result = sum / arr.length;
        
        System.out.println(result);
        
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        addition(a);
    }
}