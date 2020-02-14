import java.time.LocalDate;

 class Date {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(2);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today date " + date);
        System.out.println("Yesterday date " + yesterday);
        System.out.println("Tomorrow date " + tomorrow);
    }
}