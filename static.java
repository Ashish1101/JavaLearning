

class Static {

    /* Static variable */
    static int x = 20;
    static boolean b;
    static int y;
    static byte name;

    public static void main(String[] args) {
        System.out.println(Static.x);
        int z = ++x;
        System.out.println(z);
        System.out.println(Static.b);
        // Static obj = new Static();
        System.out.println(Static.y);
        System.out.println(Static.b);
        // System.out.println(obj.b);
        // System.out.println(obj.name);

    }
    

}