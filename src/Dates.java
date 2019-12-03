public class Dates {

    private int day;
    private int month;
    private int year;

    public Dates(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static int StayDays(Dates x, Dates y) {
        // method that calculates the number of nights between x and y
        return 0;
    }

    public static int StayDays(int x, int y){
        return y - x;
    }

    public static int compareDates(int x, int y){
        if(x > y ){
            return x;
        } else  if(x < y){
            return y;
        } else{
            return 0;
        }
    }

    public static boolean equalDate(int x, int y){
        if(x == y) {
            return true;
        } else {
            return false;
        }
    }
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
