package Chapter15.com.E.Exception;

import java.util.Objects;

/**
 * @author aj
 * @version 1.0
 */
public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate myDate)) return false;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    @Override
    public int compareTo(MyDate o) {
        int y = year - o.getYear();
        if(y != 0){
            return y;
        }
        int m = month - o.getMonth();
        if(m != 0){
            return m;
        }
        int d = day - o.getDay();
        if(d != 0){
            return d;
        }
        return 0;
    }
}
