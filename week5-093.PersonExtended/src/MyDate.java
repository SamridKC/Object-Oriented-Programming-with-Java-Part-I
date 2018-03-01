
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
//    public int differneceInYears(MyDate compared) {
//        return -99;
//    }

    public int differenceInYears(MyDate comparedDate) {

        int difference = 0;
        if(!this.earlier(comparedDate)) {
            difference = differenceInYearsHelper(this, comparedDate);
        }
        else {
            difference = differenceInYearsHelper(comparedDate, this);
        }
        return difference;
    }

    public int differenceInYearsHelper(MyDate firstDate, MyDate secondDate) {

        int difference = firstDate.year - secondDate.year;

        if (((firstDate.month + 12) - secondDate.month) < 12) {
            difference = (difference - 1);
        }
        if (firstDate.month == secondDate.month) {
            if (firstDate.day < secondDate.day) {
                difference = (difference - 1);
            }
        }
        return difference;
    }

  
}
