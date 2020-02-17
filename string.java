import java.lang.String;

class string {
    public static void main(String[] args) {
        String str = " ashish";
        System.out.println(str);

        String str2 = new String("Shakya");
        System.out.println(str2);
        System.out.println(str2.equals(str));
        char ch[] = {'a', 'b', 'c', 'd', 'f'};
        System.out.println(ch);
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str2.endsWith("h"));
        System.out.println(str2.concat(str));
    }
}
