package Chapter10.com.zsjxjv.enum_;

public class enum01 {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        if (today == Day.FRIDAY) {
            System.out.println("It's Friday!");
        } else {
            System.out.println("It's not Friday.");
        }

    }
}
enum Day{
    MONDAY,TUESDAY,WEDENSDAY,THURSDAY,FRIDAY
}
