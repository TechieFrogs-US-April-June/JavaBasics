package OopsEncapsulation;

public class Date {
    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Date dateObj = new Date(1, 4 ,1990);
        System.out.println(dateObj);
        dateObj.setDate(4, 8, 2000);
        System.out.println(dateObj);
        dateObj.setYear(2010);
        System.out.println(dateObj);
        System.out.println(dateObj.getMonth());
    }
}
