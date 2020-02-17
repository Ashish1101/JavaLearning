import java.lang.StringBuilder;

class StringBuilderAW {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        StringBuilder sb1 = new StringBuilder("Hello");
        System.out.println(sb1);
        sb1.append("how are you ?");
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        System.out.println(sb1.reverse());
        System.out.println(sb1.capacity());
        sb1.ensureCapacity(50);
       
        System.out.println(sb1.capacity());
    }
    
}