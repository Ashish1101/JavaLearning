import java.time.LocalTime;

class localdate {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
    }

}