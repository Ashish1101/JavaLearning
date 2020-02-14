class Method {
    int a;
    int b;

    void add(int a , int b) {
        this.a = a;
        this.b = b;
        int c = a + b;
        System.out.println("sum of this problem is " + c);
    }

    void mull(int a , int b) {
        this.a = a;
        this.b = b;
        int c = a * b;
        System.out.println("multiplication of number is " + c);
        this.add(a, b);
    }
}

class This { 
    public static void main(String[] args) {
        Method obj = new Method();
        obj.mull(4, 8);
    }
}
