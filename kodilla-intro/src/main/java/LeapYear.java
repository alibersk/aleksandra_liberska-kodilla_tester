public class LeapYear {
    public static void main(String[] args) {
        int year = 1892;
        int modulo4 = (year % 4);
        int modulo100 = (year % 100);
        int modulo400 = (year % 400);
        boolean isALeapYear;

        System.out.println(year);

        if (modulo400 == 0) {
            isALeapYear = true;
            System.out.println(isALeapYear);
            System.out.println("it's a leap year");
            }
        else if (modulo100 == 0){
            isALeapYear = false;
            System.out.println(isALeapYear);
            System.out.println("it's not a leap year");
            }
        else if (modulo4 == 0){
            isALeapYear = true;
            System.out.println(isALeapYear);
            System.out.println("it's a leap year");
            }
        else {
            isALeapYear = false;
            System.out.println(isALeapYear);
            System.out.println("it's not a leap year");
        }
    }
}